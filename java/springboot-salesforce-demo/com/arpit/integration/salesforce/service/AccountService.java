package com.arpit.integration.salesforce.service;

import com.arpit.integration.salesforce.client.SalesforceRestClient;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private final SalesforceRestClient client;

    public AccountService(SalesforceRestClient client) {
        this.client = client;
    }

    public String getAccounts(String instanceUrl, String token) {
        return client.fetchAccounts(instanceUrl, token);
    }
}
