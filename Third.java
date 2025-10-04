import java.util.Scanner;

// Лаутермильх Арсений ИТ-2 Лабораторная №1
class Third {

    public static void main(String[] args) {
        Third processor = new Third();

        processor.inputForListNums();
        processor.inputForChet();
        processor.inputForNumLen();
        processor.inputForSquare();
        processor.inputForRightTriangle();
    }

    // Задача 1
    // Числа подряд.
    // Дана сигнатура метода: public String listNums (int x);
    // Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны все числа от 0 до x (включительно).
    // Пример: x=5; результат: "0 1 2 3 4 5"
    // Алгоритм решения
    public String listNums(int x) {
        String result = "";
        for (int i = 0; i <= x; i++) {
            result += i;
            if (i < x) {
                result += " ";
            }
        }
        return result;
    }

    // Задача 2
    // Четные числа.
    // Дана сигнатура метода: public String chet (int x);
    // Необходимо реализовать метод таким образом, чтобы он возвращал строку, в которой будут записаны
    // все четные числа от 0 до x (включительно).
    // Пример: x=9; результат: "0 2 4 6 8"
    // Алгоритм решения
    public String chet(int x) {
        String result = "";

        for (int i = 0; i <= x; i += 2) {
            result += i;
            if (i+2 <= x) {
                result += " ";
            }
        }
        return result;
    }

    // Задача 3
    // Длина числа.
    // Дана сигнатура метода: public int numLen (long x);
    // Необходимо реализовать метод таким образом, чтобы он возвращал количество знаков в числе x.
    // Пример: x=12567; результат: 5
    // Алгоритм решения
    public int numLen(long x) {
        if (x == 0) {
            return 1;
        }

        int count = 0;
        for (long num = Math.abs(x); num > 0; num /= 10) {
            count++;
        }
        return count;
    }

    // Задача 4
    // Квадрат.
    // Дана сигнатура метода: public void square (int x);
    // Необходимо реализовать метод таким образом, чтобы он выводил на экран квадрат из символов '*' размером х,
    // у которого х символов в ряд и х символов в высоту.
    // Пример 1: x=2; результат:  
    // **
    // **
    // Пример 2: x=4; результат:
    // ****
    // ****
    // ****
    // ****
    // Алгоритм решения
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    // Задача 5
    // Правый треугольник.
    // Дана сигнатура метода: public void rightTriangle (int x);
    // Необходимо реализовать метод таким образом, чтобы он выводил на экран
    // треугольник из символов '*' у которого х символов в высоту, а количество
    // символов в ряду совпадает с номером строки, при этом треугольник выровнен по правому краю.
    // Пример 1: x=3; результат:
    //   *
    //  **
    // ***
    // Пример 2: x=4; результат:
    //    *
    //   **
    //  ***
    // ****
    // Алгоритм решения
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    private void inputForListNums() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");

        int number = 0;
        boolean valid = false;


        while (!valid) {
            try {
                System.out.print("Введите целое число: ");
                number = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }
        String result = listNums(number);
        System.out.println("Числа до " + number + ": " + result);
    }

    private void inputForChet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 2");

        int number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите целое число: ");
                number = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }
        String result = chet(number);
        System.out.println("Четные числа до " + number + ": " + result);
    }

    private void inputForNumLen() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 3");


        long number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите число: ");
                number = scanner.nextLong();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }

        int result = numLen(number);
        System.out.println("Количество знаков в числе: " + result);
    }


    private void inputForSquare() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 4");

        int size = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите размер(> 0): ");
                size = scanner.nextInt();
                if (size > 0) {
                    valid = true;
                } else {
                    System.out.println("Вы ввели некорректное число! Попробуйте снова");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }

        System.out.println("Получившийся квадрат:");
        square(size);
    }

    private void inputForRightTriangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 5");
        int high = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите высоту(> 0): ");
                high = scanner.nextInt();
                if (high > 0) {
                    valid = true;
                } else {
                    System.out.println("Вы ввели некорректное число! Попробуйте снова");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }
        System.out.println("Получившийся треугольник:");
        rightTriangle(high);
    }
}