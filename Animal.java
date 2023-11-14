public class Animal {
    protected String name;
    protected int runlimit;
    protected int swimlimit;
    private static int count;
    public Animal() {
        count++;
    }
    public static int getCount() {
        return count;
    }
    public void run(int distance) {
        if (runlimit >= distance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " пробежал " + runlimit + " м.");
        }
    }
    public void swim(int distance) {
        if (swimlimit >= distance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " проплыл " + swimlimit + " м.");
        }
    }
}
class Cat extends Animal {
    private static int count;
    public Cat(String name) {
        this.name = name;
        super.runlimit = 200;
        count++;
    }
    public static int getcount() {
        return count;
    }
    @Override
    public void swim(int a) {
        System.out.println(name + " не проплыл, потому что коты не умеют плавать");
    }
}
class Dog extends Animal {
    private static int count;
    public static int getcount() {
        return count;
    }
    public Dog(String name) {
        this.name = name;
        super.runlimit = 500;
        super.swimlimit = 10;
        count++;
    }
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        Animal dog2 = new Dog("Бобик");
        cat1.swim(56);
        cat1.run(100);
        dog2.run(501);
        System.out.println("Всего животных создано:" + Animal.getCount());
        System.out.println("Котов создано:" + Cat.getcount());
        System.out.println("Собак создано:" + Cat.getcount());
    }
}

