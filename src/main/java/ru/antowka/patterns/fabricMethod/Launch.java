package ru.antowka.patterns.fabricMethod;


import ru.antowka.patterns.fabricMethod.carMakerImpl.PassengerGarage;
import ru.antowka.patterns.fabricMethod.carMakerImpl.TrackGarage;

/**
 * Класс реализует запуск примера патерна
 */
public class Launch {

    private Garage garage;

    public Launch(String carType){


        if(carType.equals("Track")) { //запросили грузовик

            //Создение Maker-а для грузовиков
            garage = new TrackGarage();

        } else if(carType.equals("PassengerCar")) { //запросили легковушку

            //Создение Maker-а для легковушек
            garage = new PassengerGarage();

        } else { //неправильный тип авто

            throw new RuntimeException("Неверну указан тип авто: " + carType);
        }
    }

    /**
     * Метод возврашает Car в зависимости от типа Maker-а - гаража
     *
     * @return Car
     */
    public Car getCar(){
        return garage.getCar();
    }
}
