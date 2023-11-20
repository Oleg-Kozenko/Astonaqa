import java.util.*;

public class Collections {
    public static void main(String[] args) {
        String[] stringArray = {"Home", "Work", "Walk", "Homework", "Shape", "Rectangle", "Circle", "Work", "Job", "Collection", "Main", "Home", "Circle"};
        Map<String, Integer> map = new HashMap<>();
        for (String s : stringArray) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        System.out.println(map);
        PhoneList phoneList = new PhoneList();
        phoneList.add("Ivanov", "+78005553535");
        phoneList.add("Petrov", "89834314876");
        phoneList.add("Sidorov", "89882674876");
        phoneList.add("Petrova", "89885414855");
        phoneList.add("Petrov", "89882514121");
        phoneList.add("Petrov", "89882514876");
        phoneList.add("Petrenko", "89882512111");
        phoneList.set("Klimenko");
        phoneList.set("Petrov");
    }
}
class PhoneList {
    private Map<String, ArrayList<String>> Example;
    public PhoneList() {
        this.Example = new HashMap<>();
    }
    public void add(String surname, String number) {
        if (Example.containsKey(surname)) {
            Example.get(surname).add(number);
        } else {
            Example.put(surname, new ArrayList<String>(java.util.Collections.singleton(number)));
        }
    }
    public void set(String surname) {
        if (Example.containsKey(surname)) {
            System.out.println(surname + ": " + Example.get(surname));
        } else {
            System.out.println("В справочнике отсутствуют записи с фамилией " + surname);
        }
    }
}