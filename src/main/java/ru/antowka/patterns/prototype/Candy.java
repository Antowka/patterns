package ru.antowka.patterns.prototype;

/**
 * Класс конфета
 *
 * Класс реализует интерфейс Cloneable, для использования встроенного механихма клонирования объектов
 *
 * Паттерн позволяет создавать объекты с уже заполнеными полями, по образцу(прототипу), т.е. нет необходимости
 * после инстанцирования заполнять все поля нового объекта. Это удобно в случае, если требует такой же объект,
 * но с небольшими отличиями которые не сложно внести в новый объект.
 */
public class Candy implements Cloneable {

    //Цвет
    private String color;

    //Начинка
    private String extender;

    /**
     * Сам метод клонирования, он самый важный элемент патерна "Prototype"
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return (Candy)super.clone();
    }

    /**
     * **************************** Getters and Setters ************************************************
     */

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getExtender() {
        return extender;
    }

    public void setExtender(String extender) {
        this.extender = extender;
    }
}
