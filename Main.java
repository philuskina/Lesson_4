public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Красный", "Черный");
        Shape rectangle = new Rectangle(4, 7, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Серый");

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}