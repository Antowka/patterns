package ru.antowka.patterns.fabricMethod.carMakerImpl;

import ru.antowka.patterns.fabricMethod.Car;
import ru.antowka.patterns.fabricMethod.Garage;
import ru.antowka.patterns.fabricMethod.carImpl.PassengerCar;

/**
 * Класс занимается созданием объектов - пасажирских авто
 */
public class PassengerGarage implements Garage {

    /**
     * Создание объекта пассажирского автомобиля
     *
     * @return Car
     */
    @Override
    public Car getCar() {
        return new PassengerCar();
    }
}
