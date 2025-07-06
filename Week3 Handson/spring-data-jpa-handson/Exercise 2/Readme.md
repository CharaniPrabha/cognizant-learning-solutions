---
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

1. Visit [https://start.spring.io](https://start.spring.io)
2. Fill in:
   - **Group**: `com.cognizant`
   - **Artifact**: `orm-learn`
3. Add Dependencies:
   - Spring Boot DevTools
   - Spring Data JPA
   - MySQL Driver
4. Click **Generate**, then extract and import the project into **Eclipse/IntelliJ** as a **Maven project**.

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
````

---

## ⚙️ application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ormlearn
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=validate
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

logging.level.org.hibernate.SQL=trace
logging.level.org.hibernate.type.descriptor.sql=trace
```

---

## 🧩 Java Classes

### 1. `Country.java` (Entity)

```java
@Entity
@Table(name = "country")
public class Country {

    @Id
    @Column(name = "co_code")
    private String code;

    @Column(name = "co_name")
    private String name;

    // Getters, Setters, toString()
}
```

---

### 2. `CountryRepository.java`

```java
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
```

---

### 3. `CountryService.java`

```java
@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }
}
```

---

### 4. `OrmLearnApplication.java`

```java
@SpringBootApplication
public class OrmLearnApplication {

    private static CountryService countryService;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        testGetAllCountries();
    }

    private static void testGetAllCountries() {
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("Countries: {}", countries);
        LOGGER.info("End");
    }
}
```

---

## ✅ Sample Output

```
INFO  Start  
DEBUG Countries: [Country [code=IN, name=India], Country [code=US, name=United States of America]]  
INFO  End
```

---

## 📂 Folder Structure

```
orm-learn/
├── src/
│   ├── main/
│   │   ├── java/com/cognizant/ormlearn/
│   │   │   ├── model/Country.java
│   │   │   ├── repository/CountryRepository.java
│   │   │   ├── service/CountryService.java
│   │   │   └── OrmLearnApplication.java
│   └── resources/
│       └── application.properties
├── pom.xml
```

---

## 💡 Notes

* Use `@Transactional` to enable Spring’s transaction management.
* Set `spring.jpa.hibernate.ddl-auto=validate` to ensure the table already exists in MySQL.
* Use JPA annotations like `@Entity`, `@Id`, and `@Column` for ORM mapping.

---

## 📌 Conclusion

This exercise shows a complete flow of how **Spring Boot + Spring Data JPA** connects to a MySQL database and fetches data with minimal code and setup.

```

```
