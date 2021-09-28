package Lesson10.Task5;

public class Audi extends Car {

    public Audi(String carModel,
                String carBrand,
                int carYear,
                String carColour,
                int carPrice) {
        super(carBrand, carColour, carPrice, carModel, carYear);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
