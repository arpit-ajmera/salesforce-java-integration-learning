# Salesforce REST API – Learning Notes

- API endpoint: /services/data/vXX.X/sobjects/Account/
- Authentication: OAuth 2.0 (JWT Bearer Flow)
- Example request (Java Spring Boot):
```java
RestTemplate restTemplate = new RestTemplate();
HttpHeaders headers = new HttpHeaders();
headers.setBearerAuth(accessToken);
HttpEntity<String> entity = new HttpEntity<>(headers);
ResponseEntity<String> response = restTemplate.exchange(
    "https://yourInstance.salesforce.com/services/data/vXX.X/sobjects/Account/",
    HttpMethod.GET,
    entity,
    String.class
);
System.out.println(response.getBody());
```
- Notes:
  - Token expires in 15 minutes → refresh required
  - Handle HTTP 401 errors
