package introducing_classes.entities;

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
}
