package ru.antowka.patterns.builder.builders;

import ru.antowka.patterns.builder.entities.Car;

/**
 * Абстрактный строитель для авто
 */
public abstract class CarBuilder {

    protected Car car;

    /**
     * Истанцируем авто
     */
    public void createCar() {
        car = new Car();
    }

    /**
     * Установка призводителя
     */
    public abstract void setMake();

    /**
     * Установка типа КПП
     */
    public abstract void setTransmission();

    /**
     * Установка максимальной скорости
     */
    public abstract void setMaxSpeed();

    /**
     * Getter для авто
     *
     * @return
     */
    public Car getCar(){
        return car;
    }
}
