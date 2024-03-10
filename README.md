# Assinment_ishan
Sure, here's the updated README file with the corrected API endpoints:

---

# Project Management System

## Overview
The Project Management System is a web application designed to streamline project management tasks such as creating, updating, and deleting projects. It provides RESTful APIs for managing projects, allowing users to perform CRUD (Create, Read, Update, Delete) operations on project data.

## Features
- **Create Project**: Users can create new projects by providing project details such as name, description, start date, and end date.
- **Update Project**: Existing projects can be updated with new information, including modifying project details and changing the project duration.
- **Delete Project**: Users can delete projects that are no longer needed.
- **Get All Projects**: Retrieve a list of all projects currently in the system.
- **Get Project by ID**: Retrieve detailed information about a specific project by its unique identifier.
  
## Technologies Used
- Java
- Spring Boot
- Spring Data JPA
- Swagger (for API documentation)
- MySQL (or any other supported database)

## Setup Instructions
1. Clone the repository to your local machine.
2. Ensure you have Java and Maven installed.
3. Configure the database settings in `application.properties`.
4. Run the application using Maven: `mvn spring-boot:run`.
5. Access the Swagger UI to interact with the APIs: `http://localhost:8080/swagger-ui.html`.

## API Endpoints
- **GET /GET/projects**: Get all projects.
- **GET /GET/projects/{projectId}**: Get project by ID.
- **PUT /PUT/projects/{projectId}**: Update an existing project.
- **POST /POST/projects**: Create a new project.
- **DELETE /DELETE/{projectId}**: Delete a project by ID.

## Documentation
API documentation is generated using Swagger. You can access the Swagger UI to explore and interact with the APIs. The Swagger UI is available at `http://localhost:8080/swagger-ui.html`.



