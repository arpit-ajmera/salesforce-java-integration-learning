package com.arpit.integration.salesforce.controller;

import com.arpit.integration.salesforce.service.AccountService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping("/accounts")
    public String accounts() {
        return service.getAccounts(
                "https://yourInstance.salesforce.com",
                "YOUR_ACCESS_TOKEN"
        );
    }
}
