package com.arpit.integration.salesforce.controller;

import com.arpit.integration.salesforce.service.SalesforceApiService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SalesforceController {

    private final SalesforceApiService service;

    public SalesforceController(SalesforceApiService service) {
        this.service = service;
    }

    @GetMapping("/salesforce/accounts")
    public String accounts() {
        return service.getAccounts();
    }
}
