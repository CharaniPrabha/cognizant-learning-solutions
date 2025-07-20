````markdown
# 🏦 Microservices: Account, Loan, Discovery Server & API Gateway

## 📌 Objective

Build and run microservices for a simple banking application:

- ✅ Account Microservice  
- ✅ Loan Microservice  
- ✅ Eureka Discovery Server  
- ✅ API Gateway with Global Logging Filter  

---

## 1️⃣ Account Microservice

### ✅ Setup

- **Spring Initializr**: https://start.spring.io  
- **Group**: `com.cognizant`  
- **Artifact**: `account`  
- **Dependencies**:  
  - Spring Web  
  - Spring Boot DevTools  

### ✅ Controller Endpoint

```java
@GetMapping("/accounts/{number}")
public Map<String, Object> getAccountDetails(@PathVariable String number) {
    return Map.of(
        "number", number,
        "type", "savings",
        "balance", 234343
    );
}
````

### ✅ application.properties

```properties
server.port=8080
spring.application.name=account-service
eureka.client.service-url.defaultZone=http://localhost:8761/eureka
```

---

## 2️⃣ Loan Microservice

### ✅ Setup

* **Artifact**: `loan`
* **Dependencies**: Same as Account Microservice

### ✅ Controller Endpoint

```java
@GetMapping("/loans/{number}")
public Map<String, Object> getLoanDetails(@PathVariable String number) {
    return Map.of(
        "number", number,
        "type", "car",
        "loan", 400000,
        "emi", 3258,
        "tenure", 18
    );
}
```

### ✅ application.properties

```properties
server.port=8081
spring.application.name=loan-service
eureka.client.service-url.defaultZone=http://localhost:8761/eureka
```

---

## 3️⃣ Eureka Discovery Server

### ✅ Setup

* **Artifact**: `eureka-discovery-server`
* **Dependency**:

  * Spring Cloud Discovery → Eureka Server

### ✅ application.properties

```properties
server.port=8761
eureka.client.register-with-eureka=false
eureka.client.fetch-registry=false
logging.level.com.netflix.eureka=OFF
logging.level.com.netflix.discovery=OFF
```

### ✅ Main Class

```java
@EnableEurekaServer
@SpringBootApplication
public class EurekaDiscoveryServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaDiscoveryServerApplication.class, args);
    }
}
```

### ✅ Test URL

Visit: [http://localhost:8761](http://localhost:8761)

---

## 4️⃣ Register Microservices to Eureka

* Add `@EnableDiscoveryClient` to both **Account** and **Loan** services.
* Define `spring.application.name` in their respective `application.properties`.
* Verify in Eureka UI:
  `Instances currently registered with Eureka`

---

## 5️⃣ API Gateway

### ✅ Setup

* **Artifact**: `api-gateway`
* **Dependencies**:

  * Spring Cloud Gateway
  * Eureka Discovery Client

### ✅ application.properties

```properties
server.port=9090
spring.application.name=api-gateway
spring.cloud.gateway.discovery.locator.enabled=true
spring.cloud.gateway.discovery.locator.lower-case-service-id=true
eureka.client.service-url.defaultZone=http://localhost:8761/eureka
```

### ✅ Route Access Examples

* [http://localhost:9090/account-service/accounts/001](http://localhost:9090/account-service/accounts/001)
* [http://localhost:9090/loan-service/loans/H001](http://localhost:9090/loan-service/loans/H001)

---

## 6️⃣ Global Logging Filter

### ✅ LogFilter.java

```java
@Component
public class LogFilter implements GlobalFilter {

    private static final Logger logger = LoggerFactory.getLogger(LogFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("Incoming Request: {}", exchange.getRequest().getURI());
        return chain.filter(exchange);
    }
}
```

* Check the **API Gateway console logs** for each incoming request.

---

## ✅ Final Notes

* All services run independently on separate ports
* Services are dynamically registered with Eureka Discovery Server
* Requests are routed through Spring Cloud Gateway
* Global logging filter logs every incoming request
* Demonstrates the evolution from **Monolithic** to **Microservices**

```


