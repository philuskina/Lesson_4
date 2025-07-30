public class park {
    public class Attraction {
        String name;
        String workingHours;
        double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Название аттракциона: " + name);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Цена: " + price + " руб.");
            System.out.println("-----------------------------");

        }
    }

    public static void main(String[] args) {
        park park = new park();
        Attraction[] attractions = new Attraction[3];
        attractions[0] = park.new Attraction("Американские горки", "10:00-18:00", 500.11);
        attractions[1] = park.new Attraction("Колесо обозрения", "12:00-20:00", 300.55);
        attractions[2] = park.new Attraction("Комната страха", "14:00-22:00", 400.99);
        for (Attraction attraction : attractions) {
            attraction.printInfo();
        }
    }
}
