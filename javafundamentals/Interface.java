package javafundamentals;

interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Woof");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
    }
}
