public interface Shape {
    double getArea();
    default double getPerimeter() {
        return 0.0;
    }
    String getFillColor();
    String getBorderColor();
    void printInfo();
}
