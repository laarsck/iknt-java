import java.util.Scanner;

// Лаутермильх Арсений ИТ-2 Лабораторная №1
// Задание 1
class First {

    public static void main(String[] args) {
        First processor = new First();

        processor.inputForFraction();
        processor.inputForCharToNum();
        processor.inputForIs2Digits();
        processor.inputForIsInRange();
        processor.inputForIsEqual();
    }

    // Задача 1
    // Дробная часть.
    // Дана сигнатура метода: public double fraction (double x);
    // Необходимо реализовать метод таким образом, чтобы он возвращал только дробную часть числа х. Подсказка: вещественное число может быть
    // преобразовано к целому путем отбрасывания дробной части.
    // Пример: x=5,25; результат: 0,25
    // Алгоритм решения
    public double fraction(double x) {
        return x - (int)x;
    }

    // Задача 2
    // Букву в число.
    // Дана сигнатура метода: public int charToNum (char x);
    // Метод принимает символ х, который представляет собой один из “0 1 2 3 4 5 6 7 8 9”. Необходимо реализовать метод таким образом, чтобы он преобразовывал
    // символ в соответствующее число. Подсказка: код символа ‘0’ — это число 48.
    // Пример: x=’3’; результат: 3
    // Алгоритм решения
    public int charToNum(char x) {
        return x - 48;
    }

    // Задача 3
    // Двузначное.
    // Дана сигнатура метода: public bool is2Digits (int x);
    // Необходимо реализовать метод таким образом, чтобы он принимал число x и возвращал true, если оно двузначное.
    // Пример 1: x=32; результат: true
    // Пример 2: x=516; результат: false
    // Алгоритм решения
    public boolean is2Digits(int x) {
        return 10<=x && x<=99;
    }

    // Задача 4
    // Диапазон.
    // Дана сигнатура метода: public bool isInRange (int a, int b, int num);
    // Метод принимает левую и правую границу (a и b) некоторого числового диапазона. Необходимо реализовать метод таким образом, чтобы он возвращал
    // true, если num входит в указанный диапазон (включая границы). Обратите внимание, что отношение a и b заранее неизвестно (неясно кто из них больше,
    // а кто меньше)
    // Пример 1: a=5 b=1 num=3; результат: true
    // Пример 2: a=2 b=15 num=33; результат: false
    // Алгоритм решения
    public boolean isInRange(int a, int b, int num) {
        return (a <= num && num <= b) || (b <= num && num <= a);
    }

    // Задача 5
    // Равенство.
    // Дана сигнатура метода: public bool isEqual(int a, int b, int c);
    // Необходимо реализовать метод таким образом, чтобы он возвращал true, если все три полученных методом числа равны
    // Пример 1: a=3 b=3 с=3; результат: true
    // Пример 2: a=2 b=15 с=2; результат: false
    // Алгоритм решения
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }


    private void inputForFraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");

        double number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите дробное число: ");
                number = scanner.nextDouble();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }

        double result = fraction(number);
        System.out.println("Результат преобразования: " + result);
    }


    private void inputForCharToNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 2");

        char digit = ' ';
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите цифру от 0 до 9: ");
                String input = scanner.nextLine().trim();
                if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                    digit = input.charAt(0);
                    valid = true;
                } else {
                    System.out.println("Вы ввели некорректное число! Попробуйте снова");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
            }
        }

        int result = charToNum(digit);
        System.out.println("Результат преобразования: " + result);
    }


    private void inputForIs2Digits() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 3");

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

        boolean result = is2Digits(number);
        System.out.println("Результат проверки на двузначность: " + result);
    }


    private void inputForIsInRange() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 4");

        int a = 0, b = 0, num = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите первую границу: ");
                a = scanner.nextInt();
                System.out.print("Введите вторую границу: ");
                b = scanner.nextInt();
                System.out.print("Введите число: ");
                num = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }

        boolean result = isInRange(a, b, num);
        System.out.println("Результат проверки: " + result);
    }


    private void inputForIsEqual() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 5");

        int a = 0, b = 0, c = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите a: ");
                a = scanner.nextInt();
                System.out.print("Введите b: ");
                b = scanner.nextInt();
                System.out.print("Введите c: ");
                c = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }

        boolean result = isEqual(a, b, c);
        System.out.println("Результат проверки чисел: " + result);
    }
}
