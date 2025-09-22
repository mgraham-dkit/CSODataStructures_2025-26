package introducing_classes.apps;

import introducing_classes.entities.Car;
import utils.InputUtils;

import java.util.Scanner;

public class CarDealer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Car car1 = new Car("Audi", "A5", "252-LH-829", 2025);
        Car car2 = new Car("VW", "EGolf", "202-D-6201", 2020);

        System.out.println("Please enter car make:");
        String make = input.nextLine();
        System.out.println("Please enter car model:");
        String model = input.nextLine();
        System.out.println("Please enter licence plate:");
        String licence = input.nextLine();
        int year = InputUtils.getValidInteger("Please enter car year:");
        Car car3 = new Car(make, model, licence, year);

        Car[] listing = {car1, car2, car3};

        for(Car c: listing){
            System.out.println(c.format());
        }

    }
}
