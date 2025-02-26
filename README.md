# Simple API-First Approach Demo

## Project Overview

This project demonstrates an API-first approach to development using OpenAPI 3.0.0. It includes a simple API that provides greetings with structured responses. The API specification is defined in a YAML file, and the application is built using Spring Boot.

---

## API Specification

The OpenAPI specification (`codegen-api-example.yaml`) defines the following API endpoint:

### **Endpoint**: `/greetings`
**Method**: `GET`
- **Tags**: `greetings`
- **Summary**: Retrieve greetings.
- **Description**: Provides a greeting message.

#### Responses
- **200**: Success
    - **Content Type**: `application/json`
    - **Schema**: `Greetings`
      ```json
      {
        "hey": "string"
      }
      ```
- **404**: No greetings found
    - **Content Type**: `application/json`
    - **Schema**: `GreetingNotFoundError`
      ```json
      {
        "message": "string"
      }
      ```

### Components

#### Schemas
1. **Greetings**
   ```yaml
   type: object
   properties:
     hey:
       type: string
   ```
2. **GreetingNotFoundError**
   ```yaml
   type: object
   properties:
     message:
       type: string
   ```

---

## Setup and Installation

1. **Clone the Repository**
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```

2. **Build the Project**
   ```bash
   mvn clean install
   ```

3. **Run the Application**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the API**
    - Base URL: `http://localhost:8080`
    - Test the endpoint: `GET /greetings`

---

## Generating API Code

The OpenAPI specification (`codegen-api-example.yaml`) is used to generate API interfaces and models. The `openapi-generator-maven-plugin` is configured in the `pom.xml` file to automate this process.

### To Generate the Code:
Run the following Maven command:
```bash
mvn clean generate-sources
```

---

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.open_specApi.open_specApi
│   ├── resources
│   │   └── codegen-api-example.yaml   # OpenAPI specification file
│   └── application.properties
├── test
    └── java
        └── com.open_specApi.open_specApi
```

---

## Dependencies

Key dependencies used in this project:
- **Spring Boot Starter Web**: REST API development.
- **OpenAPI Generator**: Code generation from OpenAPI spec.
- **Swagger Annotations**: API documentation.
- **Lombok**: Simplifies Java code with annotations.

Refer to `pom.xml` for the complete list of dependencies.

---

## Future Enhancements

- Add authentication to secure the `/greetings` endpoint.
- Implement more detailed error handling and custom exceptions.
- Extend the API with additional features like POST or DELETE operations.

---

Feel free to contribute to this project by creating issues or submitting pull requests!