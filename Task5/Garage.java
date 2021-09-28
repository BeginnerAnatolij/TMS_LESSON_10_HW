package Lesson10.Task5;

import java.util.HashMap;

public class Garage {
    HashMap<Car, Integer> garage = new HashMap<>();

    public void parking(Car car, int a) {
        if (!garage.containsKey(car)) {
            garage.put(car, a);
        } else {
            garage.replace(car, garage.get(car) + a);
        }
        System.out.println(a + " " + car.getCarModel() + " " + car.getCarBrand() + " parked");
    }

    public void checkOut(Car car, int a) {
        if (garage.containsKey(car)) {
            garage.replace(car, garage.get(car) - a);
            System.out.println(a + " " + car.getCarModel() + " " + car.getCarBrand() + " set out");
        } else {
            garage.replace(car, 0);
        }
    }

    public void amount(String car) {
        int amountCarInGarage = 0;
        for (HashMap.Entry<Car, Integer> item : garage.entrySet()) {
            if (item.getKey().getCarModel().equals(car)) {
                amountCarInGarage += item.getValue();
            }
        }
        System.out.println("in garage " + amountCarInGarage + " " + car);

    }
}
