package ru.antowka.patterns.builder;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import ru.antowka.patterns.builder.builders.impl.UazBuilder;
import ru.antowka.patterns.builder.builders.impl.VazBuilder;
import ru.antowka.patterns.builder.entities.Car;

/**
 * Использоваание паттерна Builder
 *
 * Весь процесс постройки управляется через распорядителя Director
 */
@RunWith(MockitoJUnitRunner.class)
public class TestBuilder {

    /**
     * Распорядитлеь постройки авто
     */
    private Director director;

    @Before
    public void setUp(){
        director = new Director();
    }

    /**
     * Тестирование в постройке авто VAZ
     */
    @Test
    public void testVazBuilder(){
        director.setCarBuilder(new VazBuilder());
        Car car = director.buildCar();

        System.out.println(car);

        Assert.assertEquals(car.getMake(), "VAZ");
    }

    /**
     * Тестирование в постройке авто UAZ
     */
    @Test
    public void testUazBuilder(){
        director.setCarBuilder(new UazBuilder());
        Car car = director.buildCar();

        System.out.println(car);

        Assert.assertEquals(car.getMake(), "UAZ");
    }
}
