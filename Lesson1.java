public class Lesson1 {
    public static void main(String[] args) {
        CheckSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void CheckSumSign() {
        int a = 2;
        int b = 3;

        if (a + b > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 102;
        if (value <= 0)
            System.out.println("Красный");
        else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }

    }


        static void compareNumbers() {
            int a = 12;
            int b = 23;
            if (a >= b) {
                System.out.println("a>=b");
            } else System.out.println("a<b");
        }




    }
