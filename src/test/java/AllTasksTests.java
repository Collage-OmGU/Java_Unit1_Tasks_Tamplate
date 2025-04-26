import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class AllTasksTests {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        System.setIn(originalIn);
        outContent.reset();
    }

    // Task 1
    @Test
    @Order(1)
    @DisplayName("Task 1: Вывод числа")
    void testTask1() {
        String input = "42";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task1.printNumber();
        assertTrue(outContent.toString().contains("42"),
                "⛔ Test Failed! Ожидался вывод числа 42");
    }

    // Task 2
    @Test
    @Order(2)
    @DisplayName("Task 2: Сумма двух чисел")
    void testTask2() {
        String input = "5\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task2.sumOfTwoNumbers();
        assertTrue(outContent.toString().contains("15"),
                "⛔ Test Failed! Ожидалась сумма 15");
    }

    // Task 3
    @Test
    @Order(3)
    @DisplayName("Task 3: Среднее арифметическое")
    void testTask3() {
        String input = "10\n20\n30";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task3.averageOfThreeNumbers();
        assertTrue(outContent.toString().contains("20.0"),
                "⛔ Test Failed! Ожидалось среднее 20.0");
    }

    // Task 4
    @Test
    @Order(4)
    @DisplayName("Task 4: Площадь прямоугольника")
    void testTask4() {
        String input = "5\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task4.rectangleArea();
        assertTrue(outContent.toString().contains("50.0"),
                "⛔ Test Failed! Ожидалась площадь 50.0");
    }

    // Task 5
    @Test
    @Order(5)
    @DisplayName("Task 5: Проверка четности")
    void testTask5() {
        String input = "7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task5.checkEvenOrOdd();
        assertTrue(outContent.toString().contains("нечетное"),
                "⛔ Test Failed! Ожидалось 'нечетное'");
    }

    // Task 6
    @Test
    @Order(6)
    @DisplayName("Task 6: Факториал")
    void testTask6() {
        String input = "5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task6.factorial();
        assertTrue(outContent.toString().contains("120"),
                "⛔ Test Failed! Ожидался факториал 120");
    }

    // Task 7
    @Test
    @Order(7)
    @DisplayName("Task 7: Простое число")
    void testTask7() {
        String input = "13";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task7.checkPrime();
        assertTrue(outContent.toString().contains("Простое"),
                "⛔ Test Failed! 13 должно быть простым");
    }

    // Task 8
    @Test
    @Order(8)
    @DisplayName("Task 8: Таблица умножения")
    void testTask8() {
        String input = "7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task8.multiplicationTable();
        assertTrue(outContent.toString().contains("7 * 10 = 70"),
                "⛔ Test Failed! Неверная таблица умножения");
    }

    // Task 9
    @Test
    @Order(9)
    @DisplayName("Task 9: Бинарное представление")
    void testTask9() {
        String input = "10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task9.binaryRepresentation();
        assertTrue(outContent.toString().contains("1010"),
                "⛔ Test Failed! Ожидалось 1010");
    }

    // Task 10
    @Test
    @Order(10)
    @DisplayName("Task 10: Максимум из трех чисел")
    void testTask10() {
        String input = "5\n10\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task10.maxOfThreeNumbers();
        assertTrue(outContent.toString().contains("10"),
                "⛔ Test Failed! Ожидался максимум 10");
    }

    // Task 11
    @Test
    @Order(11)
    @DisplayName("Task 11: Сумма до N")
    void testTask11() {
        String input = "5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task11.sumUpToN();
        assertTrue(outContent.toString().contains("15"),
                "⛔ Test Failed! Ожидалась сумма 15");
    }

    // Task 12
    @Test
    @Order(12)
    @DisplayName("Task 12: Палиндром")
    void testTask12() {
        String input = "121";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task12.checkPalindrome();
        assertTrue(outContent.toString().contains("Палиндром"),
                "⛔ Test Failed! 121 должен быть палиндромом");
    }

    // Task 13
    @Test
    @Order(13)
    @DisplayName("Task 13: Квадратный корень")
    void testTask13() {
        String input = "25";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task13.squareRoot();
        assertTrue(outContent.toString().contains("5.0"),
                "⛔ Test Failed! Ожидался корень 5.0");
    }

    // Task 14
    @Test
    @Order(14)
    @DisplayName("Task 14: Сумма цифр")
    void testTask14() {
        String input = "123";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task14.sumOfDigits();
        assertTrue(outContent.toString().contains("6"),
                "⛔ Test Failed! Ожидалась сумма 6");
    }

    // Task 15
    @Test
    @Order(15)
    @DisplayName("Task 15: Переворот числа")
    void testTask15() {
        String input = "123";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task15.reverseNumber();
        assertTrue(outContent.toString().contains("321"),
                "⛔ Test Failed! Ожидалось 321");
    }

    // Task 16
    @Test
    @Order(16)
    @DisplayName("Task 16: Совершенное число")
    void testTask16() {
        String input = "6";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task16.checkPerfectNumber();
        assertTrue(outContent.toString().contains("Совершенное"),
                "⛔ Test Failed! 6 должно быть совершенным");
    }

    // Task 17
    @Test
    @Order(17)
    @DisplayName("Task 17: НОД")
    void testTask17() {
        String input = "12\n18";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task17.gcd();
        assertTrue(outContent.toString().contains("6"),
                "⛔ Test Failed! НОД(12,18) должен быть 6");
    }

    // Task 18
    @Test
    @Order(18)
    @DisplayName("Task 18: Минимум из двух чисел")
    void testTask18() {
        String input = "5\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task18.minOfTwoNumbers();
        assertTrue(outContent.toString().contains("5"),
                "⛔ Test Failed! Ожидался минимум 5");
    }

    // Task 19
    @Test
    @Order(19)
    @DisplayName("Task 19: Смена знака")
    void testTask19() {
        String input = "7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task19.changeSign();
        assertTrue(outContent.toString().contains("-7"),
                "⛔ Test Failed! Ожидалось -7");
    }

    // Task 20
    @Test
    @Order(20)
    @DisplayName("Task 20: Угадай число")
    void testTask20() {
        String input = "50\n75\n63\n69\n66\n67";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task20.guessNumber();
        assertTrue(outContent.toString().contains("угадали"),
                "⛔ Test Failed! Число должно быть угадано");
    }

    // Task 21
    @Test
    @Order(21)
    @DisplayName("Task 21: Умножение матриц")
    void testTask21() {
        String input = "2\n3\n3\n2\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task21.matrixMultiplication();
        assertTrue(outContent.toString().contains("58 64"),
                "⛔ Test Failed! Неверный результат умножения матриц");
    }

    // Task 22
    @Test
    @Order(22)
    @DisplayName("Task 22: Числа Фибоначчи")
    void testTask22() {
        String input = "5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task22.fibonacciSequence();
        String output = outContent.toString();
        assertTrue(output.contains("0 1 1 2 3"),
                "⛔ Test Failed! Ожидались первые 5 чисел Фибоначчи");
    }

    // Task 23
    @Test
    @Order(23)
    @DisplayName("Task 23: Сортировка массива")
    void testTask23() {
        String input = "4\n5\n3\n8\n1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task23.sortArray();
        assertTrue(outContent.toString().contains("[1, 3, 5, 8]"),
                "⛔ Test Failed! Массив не отсортирован");
    }

    // Task 24
    @Test
    @Order(24)
    @DisplayName("Task 24: Сумма арифм. прогрессии")
    void testTask24() {
        String input = "1\n2\n5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task24.arithmeticProgressionSum();
        assertTrue(outContent.toString().contains("25"),
                "⛔ Test Failed! Ожидалась сумма 25");
    }

    // Task 25
    @Test
    @Order(25)
    @DisplayName("Task 25: Угадай число с попытками")
    void testTask25() {
        String input = "50\n75\n63\n69\n66\n67";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task25.guessNumberWithAttempts();
        assertTrue(outContent.toString().contains("угадали"),
                "⛔ Test Failed! Число должно быть угадано");
    }

    // Task 26
    @Test
    @Order(26)
    @DisplayName("Task 26: Четные/нечетные цифры")
    void testTask26() {
        String input = "12345";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task26.countEvenAndOddDigits();
        String output = outContent.toString();
        assertTrue(output.contains("Четных: 2") && output.contains("Нечетных: 3"),
                "⛔ Test Failed! Неверный подсчет цифр");
    }

    // Task 27
    @Test
    @Order(27)
    @DisplayName("Task 27: Поворот массива")
    void testTask27() {
        String input = "5\n1\n2\n3\n4\n5\n2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        StudentTasks.Task27.rotateArray();
        assertTrue(outContent.toString().contains("[4, 5, 1, 2, 3]"),
                "⛔ Test Failed! Неверный поворот массива");
    }
}