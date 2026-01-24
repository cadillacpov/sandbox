package day5;

class Car {
    String make;
    String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Car Information: " + make + " " + model);
    }
}

public class CarDemo {
    public static void main(String[] args) {
        // Creating two different car objects
        Car car1 = new Car("Toyota", "Camry");
        Car car2 = new Car("Tesla", "Model 3");

        car1.displayInfo();
        car2.displayInfo();
    }
}