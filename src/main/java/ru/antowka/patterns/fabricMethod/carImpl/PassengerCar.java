package ru.antowka.patterns.fabricMethod.carImpl;

import ru.antowka.patterns.fabricMethod.Car;

/**
 * Реализация пассажирского автомобиля
 */
public class PassengerCar implements Car{

    /**
     * Метод возвращает на сколько загруженная машина
     *
     * @return String
     */
    @Override
    public String showLoad() {
        return "4 passengers + cargo = 320kg";
    }
}
