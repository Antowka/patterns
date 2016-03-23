package ru.antowka.patterns.fabricMethod.carMakerImpl;


import ru.antowka.patterns.fabricMethod.Car;
import ru.antowka.patterns.fabricMethod.Garage;
import ru.antowka.patterns.fabricMethod.carImpl.Track;

/**
 * Класс занимается созданием объектов - грузовых авто
 */
public class TrackGarage implements Garage {

    /**
     * Создание объекта грузового автомобиля
     *
     * @return Car
     */
    @Override
    public Car getCar() {
        return new Track();
    }
}
