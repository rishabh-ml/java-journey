package javafundamentals;

class Car2 {
    String model;
    int year;

    // Constructor to initialize the Car object
    Car2(String model, int year) {
        this.model = model;
        this.year = year;
    }
}

public class Object {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car2 myCar = new Car2("Honda", 2021);

        // Access and print the object's properties
        System.out.println("Car Model: " + myCar.model);
        System.out.println("Car Year: " + myCar.year);
    }
}
