package org.example;

import java.util.Objects;

public class Vechile {
    protected String manufacturer;
    protected String model;
    protected int yearOfManufacture;

    public Vechile(String manufacturer, String model, int yearOfManufacture) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vechile vechile = (Vechile) o;
        return yearOfManufacture == vechile.yearOfManufacture && Objects.equals(manufacturer, vechile.manufacturer) && Objects.equals(model, vechile.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, yearOfManufacture);
    }

    @Override
    public String toString() {
        return
                "manufacturer = '" + manufacturer + '\'' +
                ", model = '" + model + '\'' +
                ", yearOfManufacture = " + yearOfManufacture;
    }
}
