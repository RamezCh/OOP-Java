package org.example;

public class Car {
    String brand;
    String model;
    String color;
    int yearOfManufacture;
    int speed = 0;

    public Car(String brand, String model, String color, int yearOfManufacture) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void startCar() {
        System.out.println("The engine is on, you can drive now.");
    }

    public int accelerateCar(){
        this.speed++;
        return this.speed;
    }



}
