package ru.antowka.patterns.abstractFactory.entities;

/**
 * Сущность формы авторизации
 */
public interface FormLogin {

    /**
     * Метод показывает форму
     *
     * @return
     */
    String showForm();

    /**
     * Метод скрывает форму
     *
     * @return
     */
    String hideForm();
}
