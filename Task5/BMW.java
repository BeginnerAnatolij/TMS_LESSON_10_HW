package Lesson10.Task5;

public class BMW extends Car {

    public BMW(String carModel,
               String carBrand,
               int carYear,
               String carColour,
               int carPrice) {
        super(carBrand, carColour, carPrice, carModel, carYear);
    }

    @Override
    public String getCarModel() {
        return super.getCarModel();
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
