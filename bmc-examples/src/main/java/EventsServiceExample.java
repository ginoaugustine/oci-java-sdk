/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
import com.google.common.collect.ImmutableList;
import com.oracle.bmc.ConfigFileReader;
import com.oracle.bmc.OCID;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.events.EventsClient;
import com.oracle.bmc.events.model.ActionDetails;
import com.oracle.bmc.events.model.ActionDetailsList;
import com.oracle.bmc.events.model.CreateRuleDetails;
import com.oracle.bmc.events.model.CreateStreamingServiceActionDetails;
import com.oracle.bmc.events.model.Rule;
import com.oracle.bmc.events.model.RuleSummary;
import com.oracle.bmc.events.model.UpdateRuleDetails;
import com.oracle.bmc.events.requests.CreateRuleRequest;
import com.oracle.bmc.events.requests.DeleteRuleRequest;
import com.oracle.bmc.events.requests.GetRuleRequest;
import com.oracle.bmc.events.requests.ListRulesRequest;
import com.oracle.bmc.events.requests.UpdateRuleRequest;
import com.oracle.bmc.events.responses.CreateRuleResponse;
import com.oracle.bmc.events.responses.GetRuleResponse;
import com.oracle.bmc.events.responses.UpdateRuleResponse;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.internal.StringUtils;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This class provides examples of basic events service usage.
 * - creating a rule
 * - retrieving a rule
 * - updating a rule
 * - deleting a rule
 * - listing all rules in a given compartment
 */
public class EventsServiceExample implements Closeable {

    final static String configurationFilePath = "~/.oci/config";
    final static String profile = "DEFAULT";

    private final EventsClient eventsClient;

    public EventsServiceExample() throws Exception {
        // Configuring the AuthenticationDetailsProvider. It's assuming there is a default OCI config file
        // "~/.oci/config", and a profile in that config with the name "DEFAULT". Make changes to the following
        // line if needed and use ConfigFileReader.parse(configurationFilePath, profile);

        final ConfigFileReader.ConfigFile configFile = ConfigFileReader.parseDefault();

        final AuthenticationDetailsProvider provider =
                new ConfigFileAuthenticationDetailsProvider(configFile);

        this.eventsClient = new EventsClient(provider);
    }

    /**
     * Shows examples of how to create, read, update, list and delete Rules.
     * @param args Command line arguments
     * @throws Exception Throws Exceptions
     */
    public static void main(final String[] args) throws Exception {
        validateArguments(args);

        final String compartmentId = args[0];
        final String streamId = args[1];

        final EventsServiceExample eventsServiceExample = new EventsServiceExample();

        // We create a new Rule
        final Rule newRule = eventsServiceExample.createRule(compartmentId, streamId);

        // We try to get the Rule that was just created.
        final Rule ruleReadFromService = eventsServiceExample.getRule(newRule.getId());

        // We try to update the Rule that we had just read.
        final String newDisplayName = "Example Rule generated by SDK Sample Code - Updated";
        final Rule updatedRule =
                eventsServiceExample.updateRule(ruleReadFromService.getId(), newDisplayName);

        // We now list all the rules in our compartment
        final List<RuleSummary> rulesList = eventsServiceExample.listRules(compartmentId);
        System.out.println(
                "Number of rules in compartment " + compartmentId + " is " + rulesList.size());

        // We delete our Rule
        eventsServiceExample.deleteRule(updatedRule.getId());

        // Cleanup
        eventsServiceExample.close();
    }

    /**
     * We create a new Rule here.
     * Our Rule has a condition that is used to filter out particular events that are of interest to us.
     * When an event matches our condition, an Action is triggered.
     * Here, our action would be to copy the event of interest, to an OSS stream.
     * @param compartmentId OCID of compartment where the Rule should be created. Must match the compartment where events are emitted.
     * @param streamId OCID of OSS stream where the matching events must be copied over to.
     * @return The Rule that was created.
     */
    private Rule createRule(String compartmentId, final String streamId) {
        final ActionDetails actionDetails =
                CreateStreamingServiceActionDetails.builder()
                        .streamId(streamId)
                        .isEnabled(true)
                        .build();

        final String condition =
                "{\n" + "\t\"eventType\": \"com.oraclecloud.objectstorage.object.create\" \n" + "}";

        final Map<String, String> tags = new HashMap<>();
        tags.put("EventsServiceExample", "RuleCreationTags");

        final CreateRuleDetails createRuleDetails =
                CreateRuleDetails.builder()
                        .actions(
                                ActionDetailsList.builder()
                                        .actions(ImmutableList.of(actionDetails))
                                        .build())
                        .compartmentId(compartmentId)
                        .condition(condition)
                        .displayName("Example Rule generated by SDK Sample Code")
                        .isEnabled(Boolean.TRUE)
                        .freeformTags(tags)
                        .build();

        final CreateRuleRequest createRuleRequest =
                CreateRuleRequest.builder().createRuleDetails(createRuleDetails).build();

        try {
            final CreateRuleResponse createRuleResponse =
                    this.eventsClient.createRule(createRuleRequest);

            final Rule rule = createRuleResponse.getRule();
            System.out.println(
                    "Rule "
                            + rule.getId()
                            + " with displayName "
                            + rule.getDisplayName()
                            + " created in compartment "
                            + compartmentId);

            return rule;
        } catch (final BmcException e) {
            System.out.println(
                    "Failed to create Rule in compartment "
                            + compartmentId
                            + "StreamId = "
                            + streamId);
            throw e;
        }
    }

    /**
     * Retrieves a Rule by calling the Events Service.
     * @param ruleId OCID of Rule that needs to be retrieved.
     * @return The Rule that was retrieved
     */
    private Rule getRule(String ruleId) {
        final GetRuleRequest getRuleRequest = GetRuleRequest.builder().ruleId(ruleId).build();

        try {
            GetRuleResponse ruleResponse = this.eventsClient.getRule(getRuleRequest);
            return ruleResponse.getRule();
        } catch (final BmcException e) {
            System.out.println("Failed to retrieve the Rule " + ruleId);
            throw e;
        }
    }

    /**
     * Updates the display name of a Rule.
     * @param ruleId OCID of the Rule that needs to be updated.
     * @param newDisplayName The new display name
     * @return The updated Rule
     */
    private Rule updateRule(final String ruleId, final String newDisplayName) {
        final UpdateRuleDetails updateRuleDetails =
                UpdateRuleDetails.builder().displayName(newDisplayName).build();

        final UpdateRuleRequest updateRuleRequest =
                UpdateRuleRequest.builder()
                        .ruleId(ruleId)
                        .updateRuleDetails(updateRuleDetails)
                        .build();

        try {
            final UpdateRuleResponse updateRuleResponse =
                    eventsClient.updateRule(updateRuleRequest);
            System.out.println("Rule " + ruleId + " was updated");

            return updateRuleResponse.getRule();
        } catch (final BmcException e) {
            System.out.println(
                    "Failed to update rule " + ruleId + " with displayName " + newDisplayName);
            throw e;
        }
    }

    /**
     * Lists all rules in a given compartment.
     * Clients can set various additional filter and sorting criteria during the listing (not shown here).
     * @param compartmentId OCID of the compartment where Rules will be listed
     * @return The list of Rule(s) in the compartment
     */
    private List<RuleSummary> listRules(final String compartmentId) {
        final ListRulesRequest listRulesRequest =
                ListRulesRequest.builder().compartmentId(compartmentId).limit(10).build();

        try {
            final List<RuleSummary> allRulesInCompartment = new ArrayList<>();

            for (final RuleSummary ruleSummary :
                    eventsClient.getPaginators().listRulesRecordIterator(listRulesRequest)) {
                allRulesInCompartment.add(ruleSummary);
            }

            return allRulesInCompartment;
        } catch (final BmcException e) {
            System.out.println("Failed to list rules in compartment " + compartmentId);
            throw e;
        }
    }

    /**
     * Delete a Rule
     * @param ruleId OCID of the Rule to be deleted.
     */
    private void deleteRule(final String ruleId) {
        final DeleteRuleRequest deleteRuleRequest =
                DeleteRuleRequest.builder().ruleId(ruleId).build();

        try {
            eventsClient.deleteRule(deleteRuleRequest);
            System.out.println("Rule " + ruleId + "was deleted");
        } catch (final BmcException e) {
            System.out.println("Failed to delete rule " + ruleId);
            throw e;
        }
    }

    /**
     * Validates the input, passed in via the command line arguments.
     * @param args Command line arguments
     */
    private static void validateArguments(final String[] args) {
        if (args.length < 2) {
            throw new IllegalArgumentException(
                    "This example expects two arguments (in that order): OCID for a compartment, OCID of an OSS stream");
        }

        if (!OCID.isValid(args[0])) {
            if (StringUtils.isBlank(args[0])) {
                throw new IllegalArgumentException("Compartment Id must be passed in");
            }
            throw new IllegalArgumentException(
                    String.format("Compartment Id %s does not match expected pattern", args[0]));
        }

        if (!OCID.isValid(args[1])) {
            if (StringUtils.isBlank(args[1])) {
                throw new IllegalArgumentException("OSS stream Id must be passed in");
            }
            throw new IllegalArgumentException(
                    String.format("OSS stream Id %s does not match expected pattern", args[1]));
        }
    }

    @Override
    public void close() throws IOException {
        this.eventsClient.close();
    }
}
