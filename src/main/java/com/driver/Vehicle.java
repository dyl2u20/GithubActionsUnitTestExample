package com.driver;

public class Vehicle {

    private int milesPerGallon;
    private double gallonsOfGas;
    private int odometer;

    public void go (int distance) {
        gallonsOfGas = gallonsOfGas - (distance/milesPerGallon);
        odometer += distance;
    }

    public int getMilesPerGallon() {
        return milesPerGallon;
    }

    public void setMilesPerGallon(int milesPerGallon) {
        this.milesPerGallon = milesPerGallon;
    }

    public double getGallonsOfGas() {
        return gallonsOfGas;
    }

    public void setGallonsOfGas(double gallonsOfGas) {
        this.gallonsOfGas = gallonsOfGas;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }


}
