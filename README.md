# Veriton Bank 💳🏦

## Table of Contents
- [About 🚀](#about-)
- [Architecture Patterns 🧩](#architecture-patterns-)
  - [Service Discovery](#service-discovery)
  - [Centralized Configuration](#centralized-configuration)
  - [Distributed Tracing](#distributed-tracing)
  - [Event-driven Architecture](#event-driven-architecture)
  - [Database per Microservice](#database-per-microservice)
  - [Cache-aside Pattern](#cache-aside-pattern)
  - [Circuit Breaker](#circuit-breaker)
  - [Security Pattern](#security-pattern)
  - [Containerization](#containerization)
- [Microservices 📋](#microservices-)
  - [Account API](#account-api)
  - [Transaction API](#transaction-api)
  - [Asset Management API](#asset-management-api)
  - [Notification API](#notification-api)
  - [API Gateway](#api-gateway)
  - [Config Server](#config-server)
  - [Discovery Server](#discovery-server)
- [Clone and Use 🔨](#clone-and-use-)
  - [Build Applications](#build-applications)
  - [Run Locally](#run-locally)
  - [Run Using Docker](#run-using-docker)
- [Technologies Used 💡](#technologies-used-)
- [Manual Testing (Postman) 🧪](#manual-testing-postman-)

---

## About 🚀
Veriton Bank is a digital banking solution built using a microservices architecture with Spring Boot and Spring Cloud. It implements modern architectural patterns like service discovery, centralized configuration, distributed tracing, circuit breaker, caching, containerization, and event-driven communication. Each microservice is independent, scalable, and communicates through well-defined APIs to perform operations such as account creation, money transfers, asset management, and sending notifications.

## Architecture Patterns 🧩

### Service Discovery
All services register with the Discovery Server (Eureka). It enables dynamic service lookup without hardcoded URLs and provides built-in load balancing.

### Centralized Configuration
Config Server manages all microservice configurations from a single source and supports environment-specific files and runtime updates.

### Distributed Tracing
Zipkin collects and visualizes request traces across microservices to detect performance issues and identify bottlenecks.

### Event-driven Architecture
Notification API uses Kafka for asynchronous messaging. Services publish events; Notification API consumes and processes them independently.

### Database per Microservice
Each microservice uses its own database: Account API → MongoDB, Transaction API → PostgreSQL, Asset Management API → MySQL. This improves independence and scalability.

### Cache-aside Pattern
Caching enhances performance: Account API uses Redis Template; Asset and Transaction APIs use Spring Cache.

### Circuit Breaker
Resilience4J protects the system from cascading failures by opening circuits during slow or failed remote calls.

### Security Pattern
API Gateway handles authentication and authorization. Microservices follow secure coding practices and protect sensitive data.

### Containerization
All microservices run in Docker containers for consistent and portable deployments.

## Microservices 📋

### Account API
Manages customer accounts using MongoDB. Supports account creation, retrieval, deletion, balance details, and account history.

### Transaction API
Handles financial transactions and uses PostgreSQL. Coordinates with Account API and Asset Management API to validate funds and assets.

### Asset Management API
Uses MySQL to store and retrieve financial asset data such as stocks, bonds, and other instruments. Helps validate asset availability.

### Notification API
Sends email/SMS notifications using Kafka. Stateless and event-driven.

### API Gateway
Acts as a single entry point, routing all incoming requests while managing authentication and authorization.

### Config Server
Centralized configuration server providing externalized configs to all microservices.

### Discovery Server
Eureka-based service registry for enabling dynamic discovery among microservices.

## Clone and Use 🔨

### Build Applications
1. Start the config-server application.  
2. Start infrastructure services:  
   `docker-compose -f docker-compose-infrastructure-services.yml up -d`  
3. Build all applications except config-server:  
   `mvn clean install -pl !config-server`  
4. Build a specific application:  
   `mvn clean install -pl <module-name>`

### Run Locally
1. Install Java 21, Maven, and a suitable IDE.  
2. Clone the repository and navigate to the project directory.  
3. Start infrastructure services via Docker.  
4. Run each microservice individually (config-server must start first).

### Run Using Docker
Run all microservices:  
`docker-compose up -d`  
Stop all microservices:  
`docker-compose down`

## Technologies Used 💡
Java 21, Spring Boot, Spring Cloud, Docker, API Gateway, JPA, MongoDB, PostgreSQL, MySQL, Kafka, Auth0, Prometheus, Grafana, Zipkin, Redis, JUnit, Mockito, Postman.

## Manual Testing (Postman) 🧪
1. Install Postman.  
2. Import the Postman collection and environment from the `postman/` folder.  
3. Select the **Veriton Bank** environment.  
4. Run the **Authorization** request to generate tokens.  
5. Execute other API requests with required headers/parameters.  
6. Verify responses to validate functionality.
