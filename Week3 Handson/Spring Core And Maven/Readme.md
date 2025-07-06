Here is your formatted `README.md` file ready to upload to GitHub:

```markdown
# 📘 Spring Core (Maven) - Exercises 1, 2, and 4

This project contains hands-on exercises for setting up a basic Spring Framework application using Maven. It includes manual XML configuration and demonstrates Dependency Injection using Spring Core.

---

## ✅ Exercise 1: Configuring a Basic Spring Application

### 📌 Objective:
Create a simple Spring application to manage a library backend using XML configuration.

### 🧱 Structure:
- `com.library.repository.BookRepository`
- `com.library.service.BookService`
- `applicationContext.xml`

### ⚙ Steps:
1. Define beans in `applicationContext.xml`.
2. Create `BookRepository` with a simple `save()` method.
3. Inject `BookRepository` into `BookService` using **setter injection**.
4. Load Spring context in `LibraryManagementApplication` and call the service method.

### 🖥 Output:
```

BookService: Calling repository...
BookRepository: Saving book to DB...

````

---

## ✅ Exercise 2: Implementing Dependency Injection

### 📌 Objective:
Demonstrate how Spring performs **setter-based Dependency Injection** via XML.

### 🔄 Changes from Exercise 1:
Ensure `BookService` has a setter for `BookRepository`.  
Wire beans in `applicationContext.xml` like this:

```xml
<bean id="bookService" class="com.library.service.BookService">
    <property name="bookRepository" ref="bookRepository"/>
</bean>
````

### ✅ Output:

Spring will inject the `BookRepository` into `BookService` and invoke its method successfully.

---

## ✅ Exercise 4: Creating and Configuring a Maven Project

### 📌 Objective:

Set up a Maven-based Spring application with proper dependencies.

### 🔧 `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.3.22</version>
</dependency>
```

### 🛠 Tools:

* Java 8+
* Maven 3+
* IDE (Eclipse/IntelliJ)

### 📁 Project Structure:

```
LibraryManagement/
├── src/
│   ├── main/
│   │   ├── java/com/library/
│   │   │   ├── LibraryManagementApplication.java
│   │   │   ├── repository/BookRepository.java
│   │   │   └── service/BookService.java
│   │   └── resources/applicationContext.xml
├── pom.xml
```

---

## 💡 How to Run

1. Open the project in your IDE.
2. Ensure `applicationContext.xml` is on the classpath.
3. Run `LibraryManagementApplication.java`.
4. Verify output in the console (Bean loading and DI).

---

## 🧾 Summary

| Exercise | Topic                    | Highlights                       |
| -------- | ------------------------ | -------------------------------- |
| 1        | Spring XML Configuration | Define beans and test context    |
| 2        | Dependency Injection     | Setter injection using XML       |
| 4        | Maven Project Setup      | `pom.xml` config for Spring Core |

```


```
