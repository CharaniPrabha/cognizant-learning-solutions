# 📘 Spring Data JPA — Exercise 1: Quick Example

This exercise demonstrates how to build a Spring Boot application using **Spring Data JPA** to interact with a **MySQL** database and fetch records from a simple `country` table.

---

## 🎯 Objective

Build a Spring Boot application using Spring Data JPA to fetch country records from a MySQL database.

---

## 🛠️ Tools & Technologies

- Java 8+
- Spring Boot
- Spring Data JPA
- MySQL Server 8.0
- Eclipse IDE / IntelliJ
- Maven 3.6+
- MySQL Workbench (for testing DB)

---

## 📁 Project Setup

1. Visit [Spring Initializr](https://start.spring.io)
2. Set:
   - **Group**: `com.cognizant`
   - **Artifact**: `orm-learn`
3. Add Dependencies:
   - Spring Boot DevTools
   - Spring Data JPA
   - MySQL Driver
4. Click **Generate**, extract the zip, and import it into **Eclipse/IntelliJ** as a **Maven project**.

---

## 🗃️ Database Setup (MySQL)

```sql
CREATE DATABASE ormlearn;
USE ormlearn;

CREATE TABLE country (
  co_code VARCHAR(2) PRIMARY KEY,
  co_name VARCHAR(50)
);

INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');
  
