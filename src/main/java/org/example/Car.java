package org.example;

import java.util.Objects;

public class Car extends Vechile{
    private String brand;
    private String color;
    private int speed = 0;
    private int numberOfDoors;

    public Car(String manufacturer, String brand, String model, String color, int yearOfManufacture, int numberOfDoors) {
       super(manufacturer, model, yearOfManufacture);
       this.brand = brand;
       this.color = color;
       this.numberOfDoors = numberOfDoors;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void startCar() {
        System.out.println("The engine is on, you can drive now.");
    }

    public int accelerateCar(){
        this.speed++;
        return this.speed;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return speed == car.speed && numberOfDoors == car.numberOfDoors && Objects.equals(brand, car.brand) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), brand, color, speed, numberOfDoors);
    }

    @Override
    public String toString() {
        return "Car: " + super.toString() +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", numberOfDoors=" + numberOfDoors;
    }
}
