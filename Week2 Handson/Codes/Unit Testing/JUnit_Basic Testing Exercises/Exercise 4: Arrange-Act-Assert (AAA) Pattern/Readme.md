
# Exercise 4: Arrange-Act-Assert (AAA) Pattern, Test Fixtures, Setup and Teardown Methods in JUnit

## 📘 Scenario
You need to organize your unit tests using the **Arrange-Act-Assert (AAA)** pattern and apply proper **setup and teardown** methods to ensure consistent and isolated test executions.

---

## 🎯 Objectives

- Structure tests following the **AAA (Arrange-Act-Assert)** pattern.
- Use `@Before` and `@After` annotations to manage setup and cleanup tasks.
- Write maintainable and clean unit test cases for the `Calculator` class.

---

## 📂 Project Structure

```

/project-root
│
├── Calculator.java
└── CalculatorTest.java

````

---

## 📄 Sample Files

### ✅ Calculator.java

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
````

### 🧪 CalculatorTest.java

```java
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        // Arrange: Initialize Calculator before each test
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    @After
    public void tearDown() {
        // Cleanup after each test
        calculator = null;
        System.out.println("Teardown completed.");
    }

    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(10, 5);

        // Assert
        assertEquals(15, result);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiply(4, 5);
        assertEquals(20, result);
    }

    @Test
    public void testDivision() {
        int result = calculator.divide(20, 5);
        assertEquals(4, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivisionByZero() {
        calculator.divide(10, 0);
    }
}
```

---

## ⚙️ How to Run (Without Maven)

1. Open your Java project in Eclipse or IntelliJ.
2. Add **JUnit 4** to the build path:

   * Eclipse: `Right-click Project → Build Path → Add Libraries → JUnit → JUnit 4`
   * IntelliJ: `Project Structure → Modules → Dependencies → Add JUnit 4`
3. Place `Calculator.java` in `src/` and `CalculatorTest.java` in your test folder or same package.
4. Right-click `CalculatorTest.java` → **Run As > JUnit Test**
5. Observe console output and ensure all tests pass.

---

## ✅ Expected Output

```
Setup completed.
Teardown completed.
Setup completed.
Teardown completed.
...
Tests run: 5, Failures: 0, Errors: 0, Skipped: 0
```

---

## 📝 Notes

* `@Before` ensures a fresh `Calculator` instance before each test.
* `@After` cleans up to avoid state leakage.
* Using AAA structure increases clarity and test readability.

```


```
