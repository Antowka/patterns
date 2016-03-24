package ru.antowka.patterns.prototype;

/**
 * Класс фабрики конфет :)
 *
 * Этот класс тестирует патерн - "Prototype"
 */
public class CandyFactory {

    private Candy candy;

    /**
     * Создание новой конфеты по средствам клонирования
     *
     * @return
     */
    public Candy makeCandy(){
        try {

            return (Candy) candy.clone();

        } catch (CloneNotSupportedException e) {

            e.printStackTrace();
        }

        return null;
    }


    /**
     * **************************** Getters and Setters ************************************************
     */

    public void setCandy(Candy candy) {
        this.candy = candy;
    }
}
