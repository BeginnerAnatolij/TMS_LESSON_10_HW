package Lesson10.Task5;

public class Main {
    public static void main(String[] args) {
        BMW m5 = new BMW("M5", "BMW", 2012, "black", 25_000);
        Audi a7 = new Audi("A7", "Audi", 2015, "white", 40_000);
        Jaguar fType = new Jaguar("fType", "Jaguar", 2018, "red", 80_000);
        Garage garage = new Garage();
        garage.parking(m5, 4);
        garage.parking(a7, 1);
        garage.checkOut(m5, 1);
        garage.checkOut(a7, 1);
        garage.amount("BMW");
        garage.amount("Audi");
        System.out.println(m5 + "/" + a7);


    }
}
