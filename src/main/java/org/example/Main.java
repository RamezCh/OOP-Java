package org.example;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", "C350", "Schwarz", 2025);
        BMW.startCar();
        System.out.println("The car running with a speed of " + BMW.accelerateCar());
        Person ramez = new Person("Ramez", "male", 25);
        ramez.introduce();
    }
}