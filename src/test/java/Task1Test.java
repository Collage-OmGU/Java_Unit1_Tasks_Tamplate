import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

public class Task1Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    @Order(1)
    @DisplayName("Task 1: Test with number 42")
    void testPrintNumber() throws IOException {
        String input = "42";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task1.printNumber();
        assertTrue(outContent.toString().contains("42"),
                "⛔ Test Failed! Expected output to contain '42'");
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }
}