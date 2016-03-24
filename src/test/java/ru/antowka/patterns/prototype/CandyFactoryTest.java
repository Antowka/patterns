package ru.antowka.patterns.prototype;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Тестирование патерна - "Prototype"
 */
@RunWith(MockitoJUnitRunner.class)
public class CandyFactoryTest {

    CandyFactory candyFactory;

    @Before
    public void setUp() {
        candyFactory = new CandyFactory();
    }

    @Test
    public void testMakeCandy() throws Exception {

        //Образец конфеты для фабрики клонирования
        Candy candyModel = new Candy();
        candyModel.setColor("Green");
        candyModel.setExtender("Mint");

        //Устанавливаем образец в фабрику
        candyFactory.setCandy(candyModel);

        Candy candy1 = candyFactory.makeCandy();
        Candy candy2 = candyFactory.makeCandy();
        Candy candy3 = candyFactory.makeCandy();

        //Все вполученные конфеты из фабрики являются разными объектами с одинаковыми характеристиками
        Assert.assertTrue(candyModel != candy1 && candy1 != candy2 && candy2 != candy3);
    }
}