package introducing_classes.entities;

import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private String license;
    private int year;

    public Car(String make, String model, String license, int year){
        this.make = make;
        this.model = model;
        this.license = license;
        this.year = year;
    }

    public Car(){
        this.make = "Default make";
        this.model = "Default model";
        this.license = "201D1234";
        this.year = 2020;
    }

    public String format(){
        return license + " - Make: " + make + ", model: " + model + " - Year: " + year;
    }

    public int calcAge(int currentYear){
        return currentYear - year;
    }

    public String toString(){
        return "Car{make=" + make + ", model=" + model + ", license=" + license + ", year=" + year + "}";
    }

//    public boolean equals(Object o) {
//        if(this == o){
//            return true;
//        }
//        if (o == null) {
//            return false;
//        }
//        if (!(o instanceof Car)) {
//            return false;
//        }
//
//        Car other = (Car) o;
//
//        if (!this.license.equals(other.license)){
//            return false;
//        }
//
//        return true;
//    }


    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Car car)) return false;

        return Objects.equals(license, car.license);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(license);
    }
}
