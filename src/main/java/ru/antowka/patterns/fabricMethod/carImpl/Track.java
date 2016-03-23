package ru.antowka.patterns.fabricMethod.carImpl;

import ru.antowka.patterns.fabricMethod.Car;

/**
 * Реализация грузового автомобиля
 */
public class Track implements Car {

    @Override
    public String showLoad() {
        return "1 driver + bricks = 11 tons";
    }
}
