package ru.antowka.patterns.abstractFactory.entities.impl;

import ru.antowka.patterns.abstractFactory.entities.FormLogin;

/**
 * Реализация формы авторизации с EN-окализацией
 */
public class EnFormLogin implements FormLogin {
    @Override
    public String showForm() {
        return "Show FormLogin";
    }

    @Override
    public String hideForm() {
        return "Hide FormLogin";
    }
}
