# Customer Account Microservice

This repository contains a microservice built using Spring Boot that handles customer account creation and updates. The microservice emits events for each of these actions using an event streaming platform (Kafka) and stores customer data in both a relational database (MySQL) and a NoSQL database (MongoDB).

## Table of Contents

- [Features](#features)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [API Documentation](#api-documentation)
- [Event Handling](#event-handling)
- [Dockerization](#dockerization)
- [Contributing](#contributing)
- [License](#license)

## Features

- Create and update customer accounts through RESTful APIs.
- Emit events for new account creation and updates using Kafka.
- Store customer data in both MySQL and MongoDB databases.

## Prerequisites

- Java 17
- Docker (for containerization)
- Apache Kafka (or RabbitMQ) set up and running
- MySQL and MongoDB instances set up and running

## Getting Started

1. Clone this repository:

   ```bash
   git clone https://github.com/zubairmujeeb/cust-service.git


1- cd customer-account-microservice
2- ./mvnw clean package
3- java -jar target/customer-account-microservice.jar


Configuration
Configure the application settings in src/main/resources/application.yml. Update database URLs, Kafka settings, etc., as needed.
API Documentation
The API documentation is generated using Swagger. Access it by navigating to: http://localhost:8080/swagger-ui.html
Event Handling
Events for new account creation and updates are emitted using Apache Kafka. Configure Kafka settings in the application.yml file.


Event Handling
Events for new account creation and updates are emitted using Apache Kafka. Configure Kafka settings in the application.yml file.
Dockerization
Build the Docker image:

bash
Copy code
docker build -t customer-account-microservice .
Run the Docker container:

bash
Copy code
docker run -p 8080:8080 customer-account-microservice