import java.util.*;

public class Ex123 {
    public static void main(String[] args) {
        System.out.println("1 задание. Количество четных чисел:" + generateRandomNumbers(15).stream().filter(s -> s % 2 == 0).count());
        List<String> strings = Arrays.asList("Highload", "High", "Load", "Highload");
        System.out.println("'High' встретилось в списке " + strings.stream().filter(s1 -> s1.equals("High")).count() + " раз");
        if (strings.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println("Первый элемент коллекции:" + strings.stream().findFirst().get());
            System.out.println("Последний элемент коллекции:" + strings.get(strings.size() - 1));
        }
        List<String> fs = Arrays.asList("f10", "f15", "f2", "f4", "f4");
        String[] newfs = fs.stream().sorted().toArray(String[]::new);
        for (int i = 0; i < newfs.length; i++) {
            System.out.println(newfs[i]);
        }
    }
    public static List<Integer> generateRandomNumbers(int numberOfNumbers) {
        Random random = new Random();
        List<Integer> randomNumberList = new ArrayList<>();
        for (int i = 0; i < numberOfNumbers; i++) {
            randomNumberList.add(random.nextInt(99));
        }
        return randomNumberList;
    }
}

