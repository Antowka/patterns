package ru.antowka.patterns.builder;

import ru.antowka.patterns.builder.builders.CarBuilder;
import ru.antowka.patterns.builder.entities.Car;

/**
 * Класс распорядитель, занимается управлением процесса постройки объекта
 */
public class Director {

    /**
     * Сыылка на конкретного строителя
     */
    private CarBuilder carBuilder;

    /**
     * Метод устанавливает строителя в распорядителя
     *
     * @param carBuilder
     */
    public void setCarBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    /**
     * Запуск процесса постройки авто
     *
     * @return
     */
    public Car buildCar(){

        //Постройка машины
        carBuilder.createCar();
        carBuilder.setMake();
        carBuilder.setTransmission();
        carBuilder.setMaxSpeed();

        return carBuilder.getCar();
    }
}
