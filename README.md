# Salesforce–Java Integration Learning

Learning Salesforce–Java integration patterns using **Spring Boot**, **REST APIs**, and **environment variable
configuration**.  
This repo demonstrates my **learning-in-public journey** and a safe demo of Salesforce integration.

---

## 📁 Project Structure

springboot-salesforce-demo
└── src
└── main
├── java
│ └── com/arpit/integration/salesforce
│ ├── SalesforceIntegrationApplication.java
│ ├── SalesforceController.java
│ └── SalesforceApiService.java
└── resources
└── application.yml


- `SalesforceIntegrationApplication.java` → Main Spring Boot application
- `SalesforceController.java` → Exposes REST endpoints (`/salesforce/accounts`)
- `SalesforceApiService.java` → Handles Salesforce API calls (mocked locally for safe demo)
- `application.yml` → Contains Salesforce instance URL, API version, and other configuration

---

## ⚙️ Prerequisites

- Java 17+
- Maven 3.8+

Configuration is in `src/main/resources/application.yml`.  
Example snippet from `application.yml`:

```yaml
salesforce:
  api-version: v59.0
  instance-url: https://yourInstance.salesforce.com
```
For demo purposes, the service uses a mock response, so no real Salesforce credentials are required.

🚀 Run Locally
Clone the repo:

```bash
git clone https://github.com/arpit-ajmera/salesforce-java-integration-learning.git
cd salesforce-java-integration-learning/java/springboot-salesforce-demo
```
Build and run:

```bash
mvn clean spring-boot:run
```
Access the endpoint:
```bash
http://localhost:8080/salesforce/accounts
```
Expected response (mocked):

```json
[
  {"Id":"001xx000003DGbJAAW","Name":"Test Account"}
]
```
📝 Notes
Mocked responses ensure safe public demo

Can later replace with real Salesforce OAuth + API calls

Demonstrates Java + Spring Boot integration patterns

🏷️ Keywords / Tags
Java | Spring Boot | Salesforce Integration | REST API | Application.yml | Mock Data | Learning-in-Public
---