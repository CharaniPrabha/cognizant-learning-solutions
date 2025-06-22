# 📘 Project Exercises Implementation

This project includes implementations for the following exercises:

### ✅ Design Principles and Patterns

* **Exercise 1: Singleton Pattern**
* **Exercise 2: Factory Method Pattern**

### ✅ Data Structures and Algorithms

* **Exercise 2: E-commerce Platform Search Function**
* **Exercise 7: Financial Forecasting**

Each section contains **explanations, code logic, and actual output results**.

---

## 🧠 Exercise 1: Singleton Pattern ✅

**Scenario:**
A logging utility must ensure a single instance throughout the application lifecycle.

### 🔍 Sub-question Answers

* **What is Singleton?**
  A design pattern that restricts instantiation of a class to one object.

* **How is Singleton ensured?**

  * Private constructor
  * Static instance
  * `getInstance()` method
  * Optional exception check inside constructor

* **Why Singleton?**

  * Centralized logging
  * Resource optimization
  * Prevents multiple logger conflicts

### 🔨 Sample Output

```
![Screenshot 2025-06-20 204020](https://github.com/user-attachments/assets/fff53210-b64e-4134-a16f-b55c6a35234d)

```

---

## 🏗️ Exercise 2: Factory Method Pattern ✅

**Scenario:**
Create different types of documents (Word, PDF, Excel) using the Factory Method Pattern.

### 🔍 Sub-question Answers

* **What is the Factory Method Pattern?**
  A creational design pattern that delegates object creation to subclasses.

* **Why use it?**

  * Supports Open/Closed Principle
  * Makes the code extensible for future document types
  * Avoids direct instantiation in the main class

### 📘 How It Works

* `FactoryMethodPatternExample`: abstract base
* `WordDocument`, `PdfDocument`, `ExcelDocument`: concrete implementations
* `DocumentType`: abstract creator
* Each document type has its own factory class

### 🔨 Sample Output

![Screenshot 2025-06-20 204914](https://github.com/user-attachments/assets/dc63484e-224b-4a6e-ad58-cec7a36e3d57)

---

## 🛒 Exercise 2: E-commerce Platform Search Function ✅

**Scenario:**
Build a product search tool using linear and binary search techniques.

### 🔍 Sub-question Answers

* **Big O Notation Overview:**

  * Linear Search: `O(n)`
  * Binary Search: `O(log n)` – Requires sorted array

### 🛠️ Setup

* Created `Item` class with `id`, `name`, `type`
* Products collected via user input and stored in an array

### 🔎 Search Methods

* `searchByNameLinear()` – for simple scan
* `searchByNameBinary()` – for efficient search post-sorting

### 🔨 Sample Output

![Screenshot 2025-06-20 210229](https://github.com/user-attachments/assets/22e58735-7f2e-4077-8937-a603e6c26630)

### ⏱️ Time Complexity Analysis

* Linear Search: `O(n)`
* Binary Search: `O(log n)` *(on sorted data)*

---

## 📈 Exercise 7: Financial Forecasting ✅

**Scenario:**
Develop a forecasting tool that uses recursion and memoization to compute future values based on annual growth rates.

### 🔍 Sub-question Answers

* **What is recursion?**
  A method where the solution to a problem depends on solutions to smaller subproblems.

* **Why use memoization?**

  * Prevents redundant computations
  * Reduces exponential time to linear

### ⏱️ Time Complexity

* Without memoization: `O(2^n)`
* With memoization: `O(n)`

### 🔨 Sample Output

```
![Screenshot 2025-06-21 215934](https://github.com/user-attachments/assets/ce29524e-8171-43b2-8300-69b25807cfc3)

```

* **Optimization:** Memoization prevents redundant calculations and improves performance.

---

## 🧰 Technologies Used

* Java 8+
* OOP principles: Abstraction, Inheritance, Polymorphism
* Design Patterns: Singleton, Factory Method
* Algorithms:

  * Recursion & Memoization
  * Linear & Binary Search

---

## 💻 How to Run

```bash
# Singleton Pattern
javac Singleton.java
java Singleton

# Factory Method Pattern
javac FactoryMethod.java
java FactoryMethod

# E-commerce Search
javac Ecommercesearch.java
java Ecommercesearch

# Financial Forecasting
javac FinancialForecast.java
java FinancialForecast
```

---

## 📚 Summary

This submission demonstrates practical applications of:

* ✅ Singleton design for logging
* ✅ Factory Method for scalable document creation
* ✅ Search techniques using linear and binary algorithms
* ✅ Recursive forecasting with performance optimization through memoization

---
