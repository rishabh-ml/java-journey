package javafundamentals;

class Car {
    String model;
    int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
    }
}

public class Class {
    public static void main(String[] args) {
        Car myCar = new Car ("Toyota", 2020);
        myCar.displayInfo();
    }
}
