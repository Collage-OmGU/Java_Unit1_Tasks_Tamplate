import org.junit.jupiter.api.*;
import java.io.*;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

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

    // Task 1 Test
    @Test
    @Order(1)
    @DisplayName("1. Вывод введенного числа")
    void testTask1() {
        String input = "42";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task1.printNumber();
        assertTrue(outContent.toString().contains("42"),
                "Ожидался вывод введенного числа 42");
    }

    // Task 2 Test
    @Test
    @Order(2)
    @DisplayName("2. Сумма двух чисел")
    void testTask2() {
        String input = "5\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task2.sumOfTwoNumbers();
        assertTrue(outContent.toString().contains("15"),
                "Ожидалась сумма 5 и 10 = 15");
    }

    // Task 3 Test
    @Test
    @Order(3)
    @DisplayName("3. Среднее арифметическое трех чисел")
    void testTask3() {
        String input = "10\n20\n30";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task3.averageOfThreeNumbers();
        assertTrue(outContent.toString().contains("20.0"),
                "Ожидалось среднее (10+20+30)/3 = 20.0");
    }

    // Task 4 Test
    @Test
    @Order(4)
    @DisplayName("4. Площадь прямоугольника")
    void testTask4() {
        String input = "5.5\n10.2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task4.rectangleArea();
        assertTrue(outContent.toString().contains("56.1"),
                "Ожидалась площадь 5.5*10.2 = 56.1");
    }

    // Task 5 Test
    @Test
    @Order(5)
    @DisplayName("5. Проверка на четность")
    void testTask5() {
        String input = "8";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task5.checkEvenOrOdd();
        assertTrue(outContent.toString().toLowerCase().contains("четное"),
                "Число 8 должно быть четным");
    }

    // Task 6 Test
    @Test
    @Order(6)
    @DisplayName("6. Вычисление факториала")
    void testTask6() {
        String input = "5";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task6.factorial();
        assertTrue(outContent.toString().contains("120"),
                "Факториал 5 должен быть 120");
    }

    // Task 7 Test
    @Test
    @Order(7)
    @DisplayName("7. Проверка на простое число")
    void testTask7() {
        String input = "17";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task7.checkPrime();
        assertTrue(outContent.toString().toLowerCase().contains("простое"),
                "Число 17 должно быть простым");
    }

    // Task 8 Test
    @Test
    @Order(8)
    @DisplayName("8. Таблица умножения")
    void testTask8() {
        String input = "7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task8.multiplicationTable();
        String output = outContent.toString();
        assertAll(
                () -> assertTrue(output.contains("7 * 1 = 7")),
                () -> assertTrue(output.contains("7 * 10 = 70"))
                );
    }

    // Task 9 Test
    @Test
    @Order(9)
    @DisplayName("9. Бинарное представление")
    void testTask9() {
        String input = "10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task9.binaryRepresentation();
        assertTrue(outContent.toString().contains("1010"),
                "Число 10 в бинарном виде: 1010");
    }

    // Task 10 Test
    @Test
    @Order(10)
    @DisplayName("10. Максимальное из трех чисел")
    void testTask10() {
        String input = "5\n10\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task10.maxOfThreeNumbers();
        assertTrue(outContent.toString().contains("10"),
                "Максимальное из 5,10,3 должно быть 10");
    }

    // Task 11 Test
    @Test
    @Order(11)
    @DisplayName("11. Сумма чисел от 1 до N")
    void testTask11() {
        String input = "10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task11.sumUpToN();
        assertTrue(outContent.toString().contains("55"),
                "Сумма чисел от 1 до 10 должна быть 55");
    }

    // Task 12 Test
    @Test
    @Order(12)
    @DisplayName("12. Проверка на палиндром")
    void testTask12() {
        String input = "12321";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task12.checkPalindrome();
        assertTrue(outContent.toString().toLowerCase().contains("палиндром"),
                "Число 12321 должно быть палиндромом");
    }

    // Task 13 Test
    @Test
    @Order(13)
    @DisplayName("13. Квадратный корень")
    void testTask13() {
        String input = "25";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task13.squareRoot();
        assertTrue(outContent.toString().contains("5.0"),
                "Квадратный корень из 25 должен быть 5.0");
    }

    // Task 14 Test
    @Test
    @Order(14)
    @DisplayName("14. Сумма цифр числа")
    void testTask14() {
        String input = "12345";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task14.sumOfDigits();
        assertTrue(outContent.toString().contains("15"),
                "Сумма цифр 12345 должна быть 15");
    }

    // Task 15 Test
    @Test
    @Order(15)
    @DisplayName("15. Переворот числа")
    void testTask15() {
        String input = "12345";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task15.reverseNumber();
        assertTrue(outContent.toString().contains("54321"),
                "Перевернутое число 12345 должно быть 54321");
    }

    // Task 16 Test
    @Test
    @Order(16)
    @DisplayName("16. Проверка на совершенное число")
    void testTask16() {
        String input = "28";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task16.checkPerfectNumber();
        assertTrue(outContent.toString().toLowerCase().contains("совершенное"),
                "Число 28 должно быть совершенным");
    }

    // Task 17 Test
    @Test
    @Order(17)
    @DisplayName("17. Нахождение НОД")
    void testTask17() {
        String input = "54\n24";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task17.gcd();
        assertTrue(outContent.toString().contains("6"),
                "НОД чисел 54 и 24 должен быть 6");
    }

    // Task 18 Test
    @Test
    @Order(18)
    @DisplayName("18. Минимальное из двух чисел")
    void testTask18() {
        String input = "15\n10";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task18.minOfTwoNumbers();
        assertTrue(outContent.toString().contains("10"),
                "Минимальное из 15 и 10 должно быть 10");
    }

    // Task 19 Test
    @Test
    @Order(19)
    @DisplayName("19. Смена знака числа")
    void testTask19() {
        String input = "42";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task19.changeSign();
        assertTrue(outContent.toString().contains("-42"),
                "Противоположное число для 42 должно быть -42");
    }

    // Task 20 Test
    @Test
    @Order(20)
    @DisplayName("20. Угадай число (мок-тест)")
    void testTask20() {
        String input = "50\n75\n63\n69\n66";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task20.guessNumber();
        assertTrue(outContent.toString().toLowerCase().contains("угадали"),
                "Должно быть сообщение об успешном угадывании");
    }

    // Task 21 Test (упрощенный)
    @Test
    @Order(21)
    @DisplayName("21. Умножение матриц")
    void testTask21() {
        String input = "2\n2\n2\n2\n1\n2\n3\n4\n1\n0\n0\n1";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task21.matrixMultiplication();
        String output = outContent.toString();
        assertAll(
                () -> assertTrue(output.contains("1 2")),
                () -> assertTrue(output.contains("3 4"))
        );
    }

    // Task 22 Test
    @Test
    @Order(22)
    @DisplayName("22. Числа Фибоначчи")
    void testTask22() {
        String input = "7";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task22.fibonacciSequence();
        String output = outContent.toString();
        assertTrue(output.contains("0 1 1 2 3 5 8"),
                "Первые 7 чисел Фибоначчи: 0 1 1 2 3 5 8");
    }

    // Task 23 Test
    @Test
    @Order(23)
    @DisplayName("23. Сортировка массива")
    void testTask23() {
        String input = "5\n5\n3\n8\n1\n2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task23.sortArray();
        assertTrue(outContent.toString().contains("1 2 3 5 8"),
                "Отсортированный массив должен быть [1, 2, 3, 5, 8]");
    }

    // Task 24 Test
    @Test
    @Order(24)
    @DisplayName("24. Сумма арифметической прогрессии")
    void testTask24() {
        String input = "5\n2\n3";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task24.arithmeticProgressionSum();
        assertTrue(outContent.toString().contains("40"),
                "Сумма 5 членов прогрессии с a1=2 и d=3 должна быть 40");
    }

    // Task 25 Test
    @Test
    @Order(25)
    @DisplayName("25. Угадай число с попытками")
    void testTask25() {
        String input = "50\n25\n37\n43\n40\n42";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task25.guessNumberWithAttempts();
        assertTrue(outContent.toString().toLowerCase().contains("попыток"),
                "Должно отображаться количество оставшихся попыток");
    }

    // Task 26 Test
    @Test
    @Order(26)
    @DisplayName("26. Подсчет четных/нечетных цифр")
    void testTask26() {
        String input = "123456";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task26.countEvenAndOddDigits();
        String output = outContent.toString();
        assertAll(
                () -> assertTrue(output.contains("Четных: 3")),
                () -> assertTrue(output.contains("Нечетных: 3"))
        );
    }

    // Task 27 Test
    @Test
    @Order(27)
    @DisplayName("27. Циклический сдвиг массива")
    void testTask27() {
        String input = "5\n1\n2\n3\n4\n5\n2";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        StudentTasks.Task27.rotateArray();
        assertTrue(outContent.toString().contains("4 5 1 2 3"),
                "Массив [1,2,3,4,5] после сдвига на 2: [4,5,1,2,3]");
    }
}