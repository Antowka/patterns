package ru.antowka.patterns.builder.builders.impl;

import ru.antowka.patterns.builder.builders.CarBuilder;
import ru.antowka.patterns.builder.enums.Transmission;

/**
 * Строитель для марки UAZ
 */
public class UazBuilder extends CarBuilder {

    @Override
    public void setMake() {
        car.setMake("UAZ");
    }

    @Override
    public void setTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    @Override
    public void setMaxSpeed() {
        car.setMaxSpeed(120);
    }
}
