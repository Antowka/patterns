package ru.antowka.patterns.fabricMethod;

/**
 * Интерфейс гаража, который выпускает машины, является Maker-ом
 */
public interface Garage {

    /**
     * Метод создает объект автомобиля
     *
     * @return
     */
    Car getCar();
}
