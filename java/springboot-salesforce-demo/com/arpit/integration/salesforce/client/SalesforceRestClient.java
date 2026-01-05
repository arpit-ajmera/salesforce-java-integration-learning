package com.arpit.integration.salesforce.client;

import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SalesforceRestClient {

    private final RestTemplate restTemplate = new RestTemplate();

    public String fetchAccounts(String instanceUrl, String accessToken) {

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(accessToken);

        HttpEntity<String> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                instanceUrl + "/services/data/v59.0/sobjects/Account/",
                HttpMethod.GET,
                entity,
                String.class
        );

        return response.getBody();
    }
}
