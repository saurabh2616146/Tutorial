package com.saurabh.collectionframework;

/**
 * Created by Saurabh on 24-04-2016.
 */
public class Car {

    private int registrationNumber;
    private String model;
    private int chasisNumber;

    public Car(int registrationNumber, String model, int chasisNumber) {
        this.registrationNumber = registrationNumber;
        this.model = model;
        this.chasisNumber = chasisNumber;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public int getChasisNumber() {
        return chasisNumber;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (registrationNumber != car.registrationNumber) return false;
        if (chasisNumber != car.chasisNumber) return false;
        return model != null ? model.equals(car.model) : car.model == null;

    }

    @Override
    public int hashCode() {
        int result = registrationNumber;
        //result = 31 * result + (model != null ? model.hashCode() : 0);
        //result = 31 * result + chasisNumber;
        return result;
    }
}
