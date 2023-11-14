public class Cats {
    public int hunger;
    public boolean fullness;
    public int number;

    public Cats(int number, int hunger) {
        this.hunger = hunger;
        this.number = number;
        fullness = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= hunger) {
            fullness = true;
            plate.setFood(plate.getFood() - hunger);
            hunger = 0;
            System.out.println("Кот" + number + " наелся, осталось " + plate.getFood() + " еды");
        } else {
            System.out.println("Кот" + number + " не стал есть, потому что мало еды :(");
        }
    }
    public static void main(String[] args) {
        Plate plate1 = new Plate(50);
        Cats[] cats = new Cats[5];
        cats[0] = new Cats(1, 15);
        cats[1] = new Cats(2, 10);
        cats[2] = new Cats(3, 5);
        cats[3] = new Cats(4, 25);
        cats[4] = new Cats(5, 20);
        for (int i = 0; i < cats.length; i++) {
            if ((plate1.getFood() < cats[i].hunger)) {
                plate1.addFood(10);
            }
            cats[i].eat(plate1);
        }
    }
}

class Plate {
    private int food;

    Plate(int food) {
        this.food = food;
    }

    void addFood(int foodplus) {
        food += foodplus;
        System.out.println("В тарелку насыпали " + foodplus + " еды");
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
