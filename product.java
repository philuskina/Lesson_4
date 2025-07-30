public class product {
    private String name;
    private String productionDate;
    private String manufacturer;
    private String country;
    private double price;
    private boolean isBooked;

    public product(String name, String productionDate, String manufacturer, String country, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.country = country;
        this.price = price;
        this.isBooked = isBooked;
    }

    public void printInfo() {
       System.out.println("Название продукта: " + name);
       System.out.println("Дата производства: " + productionDate);
       System.out.println("Производитель: " + manufacturer);
       System.out.println("Страна происхождения: " + country);
       System.out.println("Цена: " + price + " руб.");
       System.out.println("Забронирован: " + (isBooked ? "Да" : "Нет"));
       System.out.println("-----------------------------");
    }

    public static void main(String[] args) {
        product [] productsArray = new product[5];
        productsArray[0] = new product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 85.599, true);
        productsArray[1] = new product("iPhone 16 Pro", "15.03.2025", "Apple Inc.", "USA", 98.999, false);
        productsArray[2] = new product("Xiaomi Mi 15", "10.01.2025", "Xiaomi", "China", 39.990, true);
        productsArray[3] = new product("Sony Xperia Z5", "20.04.2025", "Sony", "Japan", 76.929, false);
        productsArray[4] = new product("Nokia X50", "05.05.2025", "Nokia", "Finland", 67.799, true);
        for (product product : productsArray) {
            product.printInfo();
        }
    }
}