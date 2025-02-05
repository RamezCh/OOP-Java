package org.example;

import java.util.Objects;

public class Motorcycle extends Vechile {
    private String type;
    private boolean isNew;
    private int numberOfWheels;

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, String type, boolean isNew, int numberOfWheels) {
        super(manufacturer, model, yearOfManufacture);
        this.type = type;
        this.isNew = isNew;
        this.numberOfWheels = numberOfWheels;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Motorcycle that = (Motorcycle) o;
        return isNew == that.isNew && numberOfWheels == that.numberOfWheels && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, isNew, numberOfWheels);
    }

    @Override
    public String toString() {
        return "Motorcycle { " +
                " type = '" + type + '\'' +
                ", isNew = " + isNew +
                ", numberOfWheels = " + numberOfWheels +
                ", manufacturer = '" + manufacturer + '\'' +
                ", model = '" + model + '\'' +
                ", yearOfManufacture = " + yearOfManufacture +
                '}';
    }
}
