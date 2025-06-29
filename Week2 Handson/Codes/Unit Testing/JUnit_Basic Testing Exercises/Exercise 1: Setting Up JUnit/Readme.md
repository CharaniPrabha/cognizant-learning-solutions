# Exercise-1: Setting Up JUnit

## 📘 Scenario
You need to set up JUnit in your Java project to start writing unit tests.

## 🎯 Objective
Add JUnit as a dependency in your Maven project using the `pom.xml` file.

## ⚙️ How to Run

1. Open this project in your IDE (Eclipse or IntelliJ IDEA).
2. Ensure the `pom.xml` file includes the following JUnit dependency:

    ```xml
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
    ```

3. Create a sample test file to verify the setup:

    ```java
    import org.junit.Test;
    import static org.junit.Assert.assertEquals;

    public class SampleTest {

        @Test
        public void testAddition() {
            int result = 2 + 3;
            assertEquals(5, result);
        }
    }
    ```

4. Right-click the test file and run it as **JUnit Test**.
5. If the test passes, your JUnit setup is successful! ✅

---



