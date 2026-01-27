## Spring Boot Project Demo – Simple SOAP Service with H2 Database - Configured with application.yml

This project is configured exclusively using application.yml. No .properties files are used.

Spring Boot supports hierarchical configuration through YAML, which improves readability and makes complex 
configurations easier to understand compared to flat .properties files.

```    
server:
    port: 8084

spring:
    application:
        name: simplesoapyml
    datasource:
        url: jdbc:h2:mem:testdb
        driver-class-name: org.h2.Driver
        username: sa
        password: password
    jpa:
        database-platform: org.hibernate.dialect.H2Dialect
    h2:
        console:
            enabled: true
            path: /h2-console

jpa:
    show-sql: true

logging:
    level:
        org.hibernate.SQL: DEBUG
        org.springframework.ws.client.MessageTracing.sent: DEBUG
        org.springframework.ws.client.MessageTracing.received: DEBUG
        org.springframework.ws.server.endpoint: DEBUG
        org.springframework.ws.soap: DEBUG
        org.springframework.ws.client: DEBUG
        org.springframework.oxm.jaxb: DEBUG
```
This file configures the embedded server, application name, in-memory H2 database, JPA behavior, H2 console access, 
and detailed logging for SOAP client/server interactions.
Here is a breakdown of the key configuration properties used in the application.yml file:

### Server Configuration
Defined in application.yml using YAML indentation.

| Property | Value | Description |
|---------|-------|-------------|
| `server.port` | 8084 | Embedded server listening port |

### Application Metadata
Identifies the application inside Spring Boot. Defined in application.yml using YAML indentation.

| Property | Value | Description |
|---------|-------|-------------|
| `spring.application.name` | simplesoapyml | Spring Boot application name |

### Database & JPA Configuration (YAML-based)
All database and JPA settings are grouped hierarchically under spring in application.yml using YAML indentation.

| Property | Value | Description |
|---------|-------|-------------|
| `spring.datasource.url` | jdbc:h2:mem:testdb | In-memory H2 JDBC URL |
| `spring.datasource.driver-class-name` | org.h2.Driver | H2 JDBC driver |
| `spring.datasource.username` | sa | Database username |
| `spring.datasource.password` | password | Database password |
| `spring.jpa.database-platform` | org.hibernate.dialect.H2Dialect | Hibernate dialect for H2 |
| `jpa.show-sql` | true | Show generated SQL in logs |

### H2 Console (YAML Configuration)
Enables a web interface that allows developers to view and query the in-memory H2 database while the application 
is running. Defined in application.yml using YAML indentation.

| Property | Value | Description |
|---------|-------|-------------|
| `spring.h2.console.enabled` | true | Enable H2 web console |
| `spring.h2.console.path` | /h2-console | H2 console access path |

### Logging Configuration (SOAP & Hibernate – YAML)
Detailed logging settings for SOAP messages and Hibernate SQL statements. Defined in application.yml using YAML 
indentation.

| Property | Value | Description |
|---------|-------|-------------|
| `logging.level.org.hibernate.SQL` | DEBUG | Hibernate SQL logging |
| `logging.level.org.springframework.ws.client.MessageTracing.sent` | DEBUG | SOAP outgoing request logging |
| `logging.level.org.springframework.ws.client.MessageTracing.received` | DEBUG | SOAP incoming response logging |
| `logging.level.org.springframework.ws.server.endpoint` | DEBUG | SOAP server endpoint logging |
| `logging.level.org.springframework.ws.soap` | DEBUG | SOAP protocol logging |
| `logging.level.org.springframework.ws.client` | DEBUG | SOAP client logging |
| `logging.level.org.springframework.oxm.jaxb` | DEBUG | JAXB marshalling/unmarshalling logging |

## Running and Using the SOAP Application
This section describes the recommended step-by-step workflow to build, run, and test the SOAP application using Maven, 
Spring Boot, and curl.

### Generate SOAP Sources (WSDL → Java)
```
mvn clean generate-sources
```
This command uses the Maven JAX-WS plugin to generate Java classes from the WSDL file located in src/main/resources.
### Build the Application
```
mvn clean package
```
This command compiles the source code, runs tests, and packages the application into an executable JAR file.
### Run the Application
```
mvn spring-boot:run
```
This command starts the Spring Boot application, which will listen for SOAP requests on port 8084.
### Test the SOAP Service with curl
Use the following curl command to send a SOAP request to the service:
```
curl GET http://localhost:8084/service/demo-data/demoDataWsdl.wsdl
```
You can redirect the WSDL output to a file:
```
curl GET http://localhost:8084/service/demo-data/demoDataWsdl.wsdl > demoDataWsdl.wsdl
```
### Access the H2 Database Console
Open a web browser and navigate to:
```
http://localhost:8084/h2-console
```
Use the following credentials to log in:
- **JDBC URL**: `jdbc:h2:mem:testdb`
- **Username**: `sa`
- **Password**: `password`
This console allows you to view and query the in-memory H2 database used by the application.
- - -
This README provides a comprehensive guide to configuring, building, running, and testing a simple SOAP service
using Spring Boot with an H2 database, all configured through application.yml.