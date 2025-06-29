
# Exercise-2: Using JUnit Assertions (Without Maven)

## 📘 Scenario
Write a unit test using various **JUnit assertions** to check the correctness of expressions and object states in a simple Java project.

## 🎯 Objective
Demonstrate the use of the following JUnit assertions:

- `assertEquals`
- `assertTrue`
- `assertFalse`
- `assertNull`
- `assertNotNull`

## 🧪 Sample Test Code

```java
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {
    @Test
    public void testAssertions() {
        // Assert that two values are equal
        assertEquals(5, 2 + 3);

        // Assert that a condition is true
        assertTrue(5 > 3);

        // Assert that a condition is false
        assertFalse(5 < 3);

        // Assert that an object is null
        assertNull(null);

        // Assert that an object is not null
        assertNotNull(new Object());
    }
}
````

## ✅ Expected Output

```
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
```

## ⚙️ How to Run (Without Maven)

1. Make sure **JUnit 4** is added to your project's **build path**:

   * In **Eclipse**: Right-click project → Build Path → Add Libraries → JUnit → JUnit 4.
   * In **IntelliJ**: Go to Project Structure → Modules → Dependencies → Click `+` and add JUnit 4.

2. Create a file named `AssertionsTest.java` in your `src` folder.

3. Paste the sample code into that file.

4. Right-click on the file and select **Run As > JUnit Test**.

5. If all assertions pass, the setup is complete.

---

## 📝 Notes

* This setup is ideal for beginners using IDE-based JUnit support without external build tools.
* You can now use similar assertions in other test classes to validate different logic.

```


```
