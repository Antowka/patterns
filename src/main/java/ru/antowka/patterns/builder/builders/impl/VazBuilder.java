package ru.antowka.patterns.builder.builders.impl;

import ru.antowka.patterns.builder.builders.CarBuilder;
import ru.antowka.patterns.builder.enums.Transmission;

/**
 * Строитель для марки VAZ
 */
public class VazBuilder extends CarBuilder {

    /**
     * Установка марки авто
     *
     * @return
     */
    public void setMake() {
        car.setMake("VAZ");
    }

    /**
     * Установка типа КПП
     *
     * @return
     */
    public void setTransmission() {
        car.setTransmission(Transmission.MANUAL);
    }

    /**
     * Установка максимально допустимой скорости
     *
     * @return
     */
    public void setMaxSpeed() {
        car.setMaxSpeed(160);
    }
}
