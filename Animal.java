public class Animal {
    protected String name;
    protected static int animalCount = 0;
    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    public void printInfo() {
        System.out.println("Имя животного: " + name);
    }
    public void run (int distance) {
        System.out.println(name + "пробежал " + distance + " метров!");
    }
    public void swim (int distance) {
        System.out.println(name + " проплыл" + distance + " метров!");
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}
class Dog extends Animal {
    private static int dogCount = 0;
    private static final int MAX_RUN = 500;
    private static final int MAX_SWIM = 10;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= MAX_SWIM) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private static final int MAX_RUN = 200;
    private boolean satiety = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.decreaseFood(foodAmount)) {
            satiety = true;
            System.out.println(name + " поел и теперь сыт!");
        } else {
            System.out.println(name + " не поел, еды недостаточно.");
        }
    }

    public boolean isSatiety() {
        return satiety;
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Bowl {
    private int food;

    public Bowl(int food) {
        this.food = Math.max(food, 0);
    }

    public boolean decreaseFood(int amount) {
        if (amount <= food) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
        }
    }

    public int getFood() {
        return food;
    }
}
class Main {
    public static void main(String[] args) {
        Dog dogBobik = new Dog("Бобик");
        Cat catMurzik = new Cat("Мурзик");
        Cat catBarsik = new Cat("Барсик");

        dogBobik.run(501);
        dogBobik.swim(8);
        catMurzik.run(250);
        catMurzik.swim(5);

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());

        Bowl bowl = new Bowl(15);
        Cat[] cats = {catMurzik, catBarsik};

        int[] appetites = {10, 5, 7};
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(bowl, appetites[i]);
        }

        System.out.println("Осталось еды в миске: " + bowl.getFood());

        for (Cat cat : cats) {
            System.out.println(cat.name + " сыт: " + (cat.isSatiety() ? "Да" : "Нет"));
        }

        bowl.addFood(20);
        System.out.println("Добавили еды, теперь в миске: " + bowl.getFood());
    }
}