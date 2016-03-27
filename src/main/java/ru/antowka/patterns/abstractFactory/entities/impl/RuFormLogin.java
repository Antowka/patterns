package ru.antowka.patterns.abstractFactory.entities.impl;

import ru.antowka.patterns.abstractFactory.entities.FormLogin;

/**
 * Реализация формы авторизации с RU-окализацией
 */
public class RuFormLogin implements FormLogin {
    @Override
    public String showForm() {
        return "Показать форму авторизации";
    }

    @Override
    public String hideForm() {
        return "Скрыть форму авторизации";
    }
}
