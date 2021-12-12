package main.java.by.bsuir.lab2.entity;

import main.java.by.bsuir.lab2.entity.characteristics.Color;

public class Kettle extends Appliance {
    private int powerConsumption;
    private double waterCapacity;
    private Color color;

    public Kettle() {
    }

    public Kettle(String name, double price, int powerConsumption, double waterCapacity, Color color) {
        super(name, price);
        this.powerConsumption = powerConsumption;
        this.waterCapacity = waterCapacity;
        this.color = color;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public double getWaterCapacity() {
        return waterCapacity;
    }

    public Color getColor() {
        return color;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public void setWaterCapacity(double waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Kettle\nName: " + name
                + ", Price: " + price
                + ", Power consumption: " + powerConsumption
                + ", Water capacity: " + waterCapacity
                + ", Color: " + color;
    }
}