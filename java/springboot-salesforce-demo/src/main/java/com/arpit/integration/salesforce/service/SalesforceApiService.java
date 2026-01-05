package com.arpit.integration.salesforce.service;

import com.arpit.integration.salesforce.config.SalesforceProperties;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SalesforceApiService {

    private final SalesforceProperties properties;
    private final RestTemplate restTemplate = new RestTemplate();

    public SalesforceApiService(SalesforceProperties properties) {
        this.properties = properties;
    }

    // ✅ KEEP THIS METHOD
    public String getBaseSalesforceUrl() {
        return properties.getInstanceUrl()
                + "/services/data/"
                + properties.getApiVersion();
    }

    public String getAccounts() {

        String url = getBaseSalesforceUrl()
                + "/query?q=SELECT+Id,Name+FROM+Account+LIMIT+5";

        HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(getAccessToken()); // OAuth next
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Void> entity = new HttpEntity<>(headers);

        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                entity,
                String.class
        );

        return response.getBody();
    }

    // TEMP stub — real OAuth next
    private String getAccessToken() {
        return "DUMMY_TOKEN";
    }
}
