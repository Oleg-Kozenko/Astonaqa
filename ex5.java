import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        List<String> passwords = new ArrayList<>();
        String input = "a";
        while (!input.isEmpty()) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a password: ");
            input = scanner.nextLine();
            passwords.add(input);
        }
        passwords.stream().filter(s -> s.startsWith("f")).forEach(System.out::println);
    }
}
