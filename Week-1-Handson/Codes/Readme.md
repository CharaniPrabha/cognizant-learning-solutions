This project includes implementations for the following exercises:
-Design Principles and Patterns
  ✅ Exercise 1: Singleton Pattern
  ✅ Exercise 2: Factory Method Pattern
-Data Structures and Algorithms 
  ✅ Exercise 2: E-commerce Platform Search Function
  ✅ Exercise 7: Financial Forecasting

Each section contains explanations, code logic, and actual output results.

🧠 Exercise 1: Singleton Pattern
  ✅ Scenario:
      A logging utility must ensure a single instance throughout the application lifecycle.

  🔍 Sub-question Answers:
    What is Singleton?
      A design pattern that restricts instantiation of a class to one object.
    How is Singleton ensured?
      Private constructor
      Static instance
      getInstance() method
      Optional exception check inside constructor
    Why Singleton?
      Centralized logging
      Resource optimization
      Prevents multiple logger conflicts
    🔨 Sample Output:
        ![Exercise-1-Singleton Pattern Output](https://github.com/user-attachments/assets/af4a395f-3a87-464f-b02a-4d2422a86393)

🏗️ Exercise 2: Factory Method Pattern
    ✅ Scenario:
        Create different types of documents (Word, PDF, Excel) using the Factory Method Pattern.

    🔍 Sub-question Answers:
    What is the Factory Method Pattern?
        A creational design pattern that delegates object creation to subclasses.
    Why use it?
        Supports Open/Closed Principle
        Makes the code extensible for future document types
        Avoids direct instantiation in main class
    How it works:  
        FactoryMethodPatternExample: abstract base
        WordDocument, PdfDocument, ExcelDocument: concrete implementations
        documenttype: abstract creator
        Each document type has a factory class
    🔨 Sample Output:
        ![Exercise-2-Factory Method Pattern Output](https://github.com/user-attachments/assets/cc289128-2509-46fc-9b2c-c4724ac6870e)

🛒 Exercise 2: E-commerce Platform Search Function
    ✅ Scenario:
        Build a product search tool using linear and binary search techniques.
        
    🔍 Sub-question Answers:
        Big O Notation Overview:
          Linear Search: O(n)
          Binary Search: O(log n) – Requires sorted array
    Setup:
          Created Item class with id, name, type
          Products collected via user input and stored in array
    Search Methods:
          searchByNameLinear() for simple scan
          searchByNameBinary() for efficient search post-sorting
    🔨 Sample Output:
          ![Exercise-2-E-commerce Platform Search Function Output](https://github.com/user-attachments/assets/4419143d-9769-4ed9-8819-55c28203c6fa)
    Time Complexity Analysis:
          - Linear Search: O(n)
          - Binary Search: O(log n) [on sorted data]
📈 Exercise 7: Financial Forecasting
      ✅ Scenario:
          Develop a forecasting tool that uses recursion and memoization to compute future values based on annual growth rates.
      🔍 Sub-question Answers:
      What is recursion?
          A method where the solution to a problem depends on solutions to smaller subproblems.
      Why use memoization?
          Prevents redundant computations
          Reduces exponential time to linear
          Time Complexity:
              Without memoization: O(2^n)
              With memoization: O(n)
      🔨 Sample Output:
          ![Exercise-7-Financial Forecasting Output](https://github.com/user-attachments/assets/f63e28a4-6fab-470c-a06c-77f830cfdc27)
      
      Time Complexity: O(n) due to memoized recursion.
      Optimization: Memoization prevents redundant calculations and improves performance.
      
🧰 Technologies Used
Java 8+
OOP principles: abstraction, inheritance, polymorphism
Design Patterns: Singleton, Factory Method
Recursion and memoization
Linear and binary search algorithms

💻 How to Run
javac Singleton.java
java Singleton

javac FactoryMethod.java     # For Factory Method
java FactoryMethod

javac Ecommercesearch.java
java Ecommercesearch

javac FinancialForecast.java
java FinancialForecast

📚 Summary
This submission demonstrates practical applications of:
  Singleton design for logging
  Factory Method for scalable document creation
  Search techniques using linear and binary algorithms
