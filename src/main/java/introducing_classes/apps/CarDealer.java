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

        // Using toString
        for(Car c: listing){
            System.out.println(c);
        }

        // Comparing objects
        Car car4 = new Car("Audi", "A5", "252-LH-829", 2025);
        if(car1 == car4){
            System.out.println("car1 and car4 are equal");
            System.out.println("car1 data: " + car1);
            System.out.println("car4 data: " + car4);
        }else{
            System.out.println("car1 and car4 are different");
            System.out.println("car1 data: " + car1);
            System.out.println("car4 data: " + car4);
        }

        System.out.println();

        if(car1.equals(car4)){
            System.out.println("car1 and car4 are equal");
            System.out.println("car1 data: " + car1);
            System.out.println("car4 data: " + car4);
        }else{
            System.out.println("car1 and car4 are different");
            System.out.println("car1 data: " + car1);
            System.out.println("car4 data: " + car4);
        }
    }
}
