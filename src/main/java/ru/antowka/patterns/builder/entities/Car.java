package ru.antowka.patterns.builder.entities;

import ru.antowka.patterns.builder.enums.Transmission;

/**
 * Класс автомобиль является - является ПРОДУКТОМ
 */
public class Car {

    private String make;

    private Transmission transmission;

    private int maxSpeed;

    public void setMake(String make) {
        this.make = make;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getMake() {
        return make;
    }

    public String toString(){
        return "Make: " + make + "; Transmission: " + transmission + "; Max Speed: " + maxSpeed;
    }
}
