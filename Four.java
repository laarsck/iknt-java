import java.util.Scanner;
import java.util.Arrays;

// Лаутермильх Арсений ИТ-2 Лабораторная №1
class Four {

    public static void main(String[] args) {
        Four processor = new Four();

        processor.inputForFindFirst();
        processor.inputForMaxAbs();
        processor.inputForAdd();
        processor.inputForReverseBack();
        processor.inputForFindAll();
    }

    // Задача 1
    // Поиск первого значения.
    // Дана сигнатура метода: public int findFirst (int[] arr, int x);
    // Необходимо реализовать метод таким образом, чтобы он возвращал индекс первого вхождения числа x в массив arr.
    // Если число не входит в массив – возвращается -1.
    // Пример: arr=[1,2,3,4,2,2,5], x=2; результат: 1
    // Алгоритм решения
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Задача 2
    // Поиск максимального.
    // Дана сигнатура метода: public int maxAbs (int[] arr);
    // Необходимо реализовать метод таким образом, чтобы он возвращал наибольшее по модулю (то есть без учета знака) значение массива arr.
    // Пример: arr=[1,-2,-7,4,2,2,5]; результат: -7
    // Алгоритм решения
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    // Задача 3
    // Добавление массива в массив.
    // Дана сигнатура метода: public int[] add (int[] arr, int[] ins, int pos);
    // Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, который будет содержать все элементы массива arr,
    // однако в позицию pos будут вставлены значения массива ins.
    // Пример: arr=[1,2,3,4,5], ins=[7,8,9], pos=3; результат: [1,2,3,7,8,9,4,5]
    // Алгоритм решения
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }
        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }
        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }
        return result;
    }


    // Задача 4
    // Возвратный реверс.
    // Дана сигнатура метода: public int[] reverseBack (int[] arr);
    // Необходимо реализовать метод таким образом, чтобы он возвращал новый массив, в котором значения массива arr записаны задом наперед.
    // Пример: arr=[1,2,3,4,5]; результат: [5,4,3,2,1]
    // Алгоритм решения
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Задача 5
    // Все вхождения.
    // Дана сигнатура метода: public int[] findAll (int[] arr, int x);
    // Необходимо реализовать метод таким образом, чтобы он возвращал новый массив,
    // в котором записаны индексы всех вхождений числа x в массив arr.
    // Пример: arr=[1,2,3,8,2,2,9], x=2; результат: [1,4,5]
    // Алгоритм решения
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index] = i;
                index++;
            }
        }
        return result;
    }


    private int[] inputArray(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);

        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        return arr;
    }

    private void inputForFindFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1");

        int[] arr = inputArray("Введите элементы массива(через пробел): ");
        System.out.print("Введите число для его поиска: ");
        int x = scanner.nextInt();
        int result = findFirst(arr, x);
        System.out.println("Индекс первого вхождения числа: " + result);
    }

    private void inputForMaxAbs() {
        System.out.println("Задание 2");
        int[] arr = inputArray("Введите элементы массива(через пробел): ");
        int result = maxAbs(arr);
        System.out.println("Наибольшее число: " + result);
    }

    private void inputForAdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 3");

        int[] arr = inputArray("Введите элементы массива(через пробел): ");
        int[] ins = inputArray("Введите элементы массива для вставки(через пробел): ");
        System.out.print("Введите номер для вставки: ");
        int pos = scanner.nextInt();
        int[] result = add(arr, ins, pos);
        System.out.println("Результат: " + Arrays.toString(result));
    }

    private void inputForReverseBack() {
        System.out.println("Задание 4");

        int[] arr = inputArray("Введите элементы массива(через пробел): ");
        int[] result = reverseBack(arr);
        System.out.println("Результат: " + Arrays.toString(result));
    }

    private void inputForFindAll() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 5");

        int[] arr = inputArray("Введите элементы массива(через пробел): ");
        System.out.print("Введите число для поиска: ");
        int x = scanner.nextInt();
        int[] result = findAll(arr, x);
        System.out.println("Индексы вхождений " + x + ": " + Arrays.toString(result));
    }
}