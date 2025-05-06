#  Simple Expense Tracker – Spring Boot Application

This is a minimal Expense Tracker application built using **Java 21** and **Spring Boot**. It allows users to manage a list of expenses by creating, reading, updating, and deleting (CRUD) expense records. The app uses a **PostgreSQL database** for persistence and follows the **Spring MVC architecture**.

## 🛠️ Tools & Technologies

- **Java 21**
- **Spring Boot**
- **Spring MVC**
- **Spring Data JPA**
- **PostgreSQL**
- **Lombok**
- **Maven**

## 🧱 Architecture

This project follows the **Spring MVC (Model-View-Controller)** architecture:

- **Model**: Represents the data structure (Expense entity)
- **Controller**: Handles HTTP requests and maps them to service calls
- **Service**: Contains business logic
- **Repository**: Interface for database interaction using Spring Data JPA
