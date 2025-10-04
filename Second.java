import java.util.Scanner;

// Лаутермильх Арсений ИТ-2 Лабораторная №1
// Задание 1
class Second {

    public static void main(String[] args) {
        Second processor = new Second();

        processor.inputForAbs();
        processor.inputForIs35();
        processor.inputForMax3();
        processor.inputForSum2();
        processor.inputForDay();
    }

    // Задача 1
    // Модуль числа.
    // Дана сигнатура метода: public int abs (int x);
    // Необходимо реализовать метод таким образом, чтобы он возвращал модуль числа х (если оно было положительным,
    // то таким и остается, если он было отрицательным – то необходимо вернуть его без знака минус).
    // Пример 1: x=5; результат: 5
    // Пример 2: x=-3; результат: 3
    // Алгоритм решения
    public int abs(int x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
    }

    // Задача 2
    // Тридцать пять.
    // Дана сигнатура метода: public bool is35 (int x);
    // Необходимо реализовать метод таким образом, чтобы он возвращал true, если
    // число x делится нацело на 3 или 5. При этом, если оно делится и на 3, и на 5, то вернуть надо false.
    // Пример 1: x=5; результат: true
    // Пример 2: x=8; результат: false
    // Пример 3: x=15; результат: false
    // Алгоритм решения
    public boolean is35(int x) {
        boolean div3 = (x%3 == 0);
        boolean div5 = (x%5 == 0);
        if (div3 || div5) {
            return !(div3 && div5);
        } else {
            return false;
        }
    }

    // Задача 3
    // Тройной максимум.
    // Дана сигнатура метода: public int max3 (int x, int y, int z);
    // Необходимо реализовать метод таким образом, чтобы он возвращал максимальное из трех полученных методом чисел.
    // Пример 1: x=5 y=7 z=7; результат: 7
    // Пример 2: x=8 y=-1 z=4; результат: 8
    // Алгоритм решения
    public int max3(int x, int y, int z) {
        int mx = x;
        if (y>mx) {
            mx = y;
        }
        if (z>mx) {
            mx = z;
        }
        return mx;
    }

    // Задача 4
    // Двойная сумма.
    // Дана сигнатура метода: public int sum2 (int x, int y);
    // Необходимо реализовать метод таким образом, чтобы он возвращал сумму
    // чисел x и y. Однако, если сумма попадает в диапазон от 10 до 19, то надо вернуть число 20.
    // Пример 1: x=5 y=7; результат: 20
    // Пример 2: x=8 y=-1; результат: 7
    // Алгоритм решения
    public int sum2(int x, int y) {
        if (10<=(x + y) && (x + y) <= 19) {
            return 20;
        } else {
            return (x + y);
        }
    }

    // Задача 5
    // День недели.
    // Дана сигнатура метода: public String day (int x);
    // Метод принимает число x, обозначающее день недели. Необходимо реализовать метод таким образом,
    // чтобы он возвращал строку, которая будет обозначать текущий день недели,
    // где 1- это понедельник, а 7 – воскресенье. Если число не от 1 до 7 то верните текст "это не день недели".
    // Пример: x=5; результат: "пятница"
    // Алгоритм решения
    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    private void inputForAbs() {
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

        int result = abs(number);
        System.out.println("Модуль равен: " + result);
    }

    private void inputForIs35() {
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

        boolean result = is35(number);
        System.out.println("Результат деления: " + result);
    }

    private void inputForMax3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 3");

        int x = 0, y = 0, z = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите x: ");
                x = scanner.nextInt();
                System.out.print("Введите y: ");
                y = scanner.nextInt();
                System.out.print("Введите z: ");
                z = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }

        int result = max3(x, y, z);
        System.out.println("Максимальное из чисел: " + result);
    }

    private void inputForSum2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 4");

        int x = 0, y = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите x: ");
                x = scanner.nextInt();
                System.out.print("Введите y: ");
                y = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }

        int result = sum2(x, y);
        System.out.println("Результат суммы равен: " + result);
    }

    private void inputForDay() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 5");

        int number = 0;
        boolean valid = false;

        while (!valid) {
            try {
                System.out.print("Введите день недели: ");
                number = scanner.nextInt();
                if ((1 <= number) && (number <= 7)) {
                    valid = true;
                } else {
                    System.out.println("Вы ввели некорректное число! Попробуйте снова");
                }
            } catch (Exception e) {
                System.out.println("Вы ввели некорректное число! Попробуйте снова");
                scanner.nextLine();
            }
        }

        String result = day(number);
        System.out.println("Имя недели с номером " + number + ": " + result);
    }
}