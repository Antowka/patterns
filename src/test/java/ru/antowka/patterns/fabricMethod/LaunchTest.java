package ru.antowka.patterns.fabricMethod;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import ru.antowka.patterns.fabricMethod.carImpl.PassengerCar;
import ru.antowka.patterns.fabricMethod.carImpl.Track;


/**
 * Тестирование патерна - "Фабричный метод"
 */
@RunWith(MockitoJUnitRunner.class)
public class LaunchTest {

    /**
     * Проверка создания легкового авто с помощью фабричного метода
     *
     * @throws Exception
     */
    @Test
    public void testGetPassengerCar() throws Exception {


        Launch launch = new Launch("PassengerCar");
        Car car = launch.getCar();
        System.out.println(car.showLoad());

        Assert.assertTrue(car instanceof PassengerCar);
    }

    /**
     * Проверка создания грузового авто с помощью фабричного метода
     *
     * @throws Exception
     */
    @Test
    public void testGetTrackCar() throws Exception {

        Launch launch = new Launch("Track");
        Car track = launch.getCar();
        System.out.println(track.showLoad());

        Assert.assertTrue(track instanceof Track);
    }

    /**
     * Проверка создания несуществующего типа авто с помощью фабричного метода
     *
     * @throws Exception
     */
    @Test
    public void testGetWrongCar() throws Exception {

        try {
            new Launch("WrongTypeCar");
            Assert.assertTrue(false);
        } catch (RuntimeException e) {
            Assert.assertTrue(true);
        }
    }
}