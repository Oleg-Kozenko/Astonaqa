import java.util.ArrayList;

public class Fruit {
    double weight;
    public Fruit(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }
    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        box1.add( new Apple());
        box1.add( new Apple());
        System.out.println("Вес первой коробки" + box1.getWeightBox());
        Box<Apple> box2 = new Box<>();
        box1.outToAnother(box2);
        System.out.println("Вес первой коробки после пересыпания" + box1.getWeightBox());
        System.out.println("Вес второй коробки после пересыпания" + box2.getWeightBox());
        box2.add( new Apple());
        Box<Orange> box3 = new Box<>();
        box3.add(new Orange());
        box3.add(new Orange());
        System.out.println("Вторая и третья коробка равны по весу: " + box3.compare(box2));
    }
}
class Apple extends Fruit {
    public Apple() {
        super(1);
    } // передаем вес яблока
}
class Orange extends Fruit {
    public Orange() {
        super(1.5);
    } //передаем вес апельсина
}
class Box<T extends Fruit> {
    ArrayList<T> fruitArrayList; //создаем ArrayList для хранения фруктов
    public Box() {
        fruitArrayList = new ArrayList<>();
    }
    public double getWeightBox() {// метод, вычисляющий вес коробки: тк у нас вес фиксированный, то мы просто перемножаем количество на вес одного объекта
        if (fruitArrayList.isEmpty()) {// есть проверка на пустоту
            return 0;
        }
        return fruitArrayList.size() * fruitArrayList.getFirst().getWeight();
    }
    public boolean compare(Box<?> another) {// сравнение веса коробок
        return this.getWeightBox() == another.getWeightBox();
    }
    public void add(T fruit) {// добавление фрукта в коробку
        fruitArrayList.add(fruit);
    }
    public void outToAnother(Box<T> another) {// высыпание всех фруктов из одного бокса в другой
        another.fruitArrayList.addAll(this.fruitArrayList);
        this.fruitArrayList.clear();
    }
}
