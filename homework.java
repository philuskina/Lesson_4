import java.io.PrintStream;

public class homework {
    
    static PrintStream out = System.out;
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        isSumRange();
        printInt(0);
        isNumber(0);
        printConsole(10, "Текст");
        isYear(2024);
        invertArray();
        nullArray();
        multiplyArray();
        twoArray();
        oneArray(10, 5);
    }

    static void printThreeWords() {
        out.println("Orange");
        out.println("Banana");
        out.println("Apple");
    }

    static void checkSumSign() {
        int a = -5;
        int b = -10;
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    static void compareNumbers() {
        int a = 5;
        int b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    static boolean isSumRange() {
        int a = 100;
        int b = 10;
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("Сумма в диапазоне от 10 до 20");
            return true;
        } else {
            System.out.println("Сумма вне диапазона от 10 до 20");
            return false;

        }
    }

    static void printInt(int a) {
        if (a >= 0) {
            System.out.println("Положительное число: " + a);
        } else {
            System.out.println("Отрицательное число: " + a);
        }
    }

    static boolean isNumber(int a) {
        if (a < 0) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }

    static void printConsole(int a, String name) {
        for (int i = 0; i < a; i++) {
            System.out.println(name + " " + i);
        }
    }

    static boolean isYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год високосный");
            return true;
        } else {
            System.out.println("Год не високосный");
            return false;
        }
    }

    static void invertArray() {
        int[] arr = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

    static void nullArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
    }

    static void multiplyArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
                System.out.println(arr[i]);
            } else {
                System.out.println(arr[i]);
            }
        }
    }

    static void twoArray()
    {
        int size = 10;
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) 
        {
            for (int j = 0; j < size; j++) 
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
    
        }
    }
    static int[] oneArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println("Массив заполнен значением: " + initialValue);
        }
        return arr;
        
    }
}
