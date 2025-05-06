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

## ⚙️ Setup Instructions

1. Clone the Repository

 ```bash
 git clone https://github.com/the-november-man/expense-tracker.git
 cd expense-tracker
 ```
2. Configure PostgreSQL

 Make sure PostgreSQL is running and update the `application.properties` file in the `src/main/resources/` directory with your database credentials:

 ```properties
 spring.datasource.url=jdbc:postgresql://localhost:5432/expense_db
 spring.datasource.username=your_username
 spring.datasource.password=your_password

 spring.jpa.hibernate.ddl-auto=update
 spring.jpa.show-sql=true
 ```
3. Build and Run the Application

 ```bash
 ./mvnw spring-boot:run
 ```
---

## ✅ Requirements

- Java 21+
- Maven 3.8+
- PostgreSQL 12+
