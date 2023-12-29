
import java.util.Objects;
import java.util.Scanner;

public class TechnicalTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("1 Задание. Введите число большее, чем 7, чтобы увидеть 'Привет':");
        if (in.nextInt() > 7) System.out.println("Привет");
        System.out.print("2 Задание. Введите загаданное имя: ");
        String name = in.next();
        if (Objects.equals(name, "Вячеслав")) System.out.println("Привет, " + name);
        else System.out.println("Нет такого имени");
        System.out.print("3 Задание. Введите длину целочисленного массива:");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.print("Задайте элементы массива:");
        for (int i = 0; i < length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Элементы массива, кратные трём:");
        for (int num : arr) {
            if (num % 3 == 0) System.out.print(num + " ");
        }

    }
}
