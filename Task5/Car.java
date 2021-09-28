package Lesson10.Task5;

public abstract class Car {
    private String carModel;
    private String carBrand;
    private int carYear;
    private String carColour;
    private int carPrice;

    public Car(String carModel, String carBrand, int carYear, String carColour, int carPrice) {
        this.carModel = carModel;
        this.carBrand = carBrand;
        this.carYear = carYear;
        this.carColour = carColour;
        this.carPrice = carPrice;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public int getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(int carPrice) {
        this.carPrice = carPrice;
    }
}
