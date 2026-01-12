# Introduction to Spring Framework and IoC Container

## Overview
This project demonstrates Spring Framework's Dependency Injection (DI) and Inversion of Control (IoC) concepts through a simple notification service example.

## Key Concepts Demonstrated

### 1. Dependency Injection
- Constructor-based injection in `NotificationManager`
- Dependencies are provided by Spring container rather than created manually

### 2. IoC Container
- `ApplicationContext` manages bean lifecycle
- Configuration-based bean definition using `@Configuration`

### 3. Bean Configuration
- `@Bean` annotation for explicit bean creation
- `@Qualifier` for selecting specific beans when multiple implementations exist

### 4. Project Structure
- **NotificationService**: Interface defining the contract
- **EmailNotificationService**: Email implementation
- **SmsNotificationService**: SMS implementation
- **NotificationManager**: Consumer that depends on NotificationService
- **BeanConfig**: Spring configuration class defining beans
- **Main**: Entry point that bootstraps the Spring context

## Running the Project
```bash
mvn clean compile
mvn exec:java -Dexec.mainClass="com.demo.Main"
```

## Dependencies
- Spring Context 6.2.11