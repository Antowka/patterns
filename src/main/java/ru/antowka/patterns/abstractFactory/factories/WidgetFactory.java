package ru.antowka.patterns.abstractFactory.factories;

import ru.antowka.patterns.abstractFactory.entities.FormLogin;
import ru.antowka.patterns.abstractFactory.entities.ToolPanel;

/**
 * Интерфейс для фабрик, которые создают виджеты содержит ряд фабричных методв
 */
public interface WidgetFactory {

    /**
     * Метод возвращает панель инструментов - фабричный метод
     *
     * @return
     */
    ToolPanel getToolPanel();

    /**
     * Метод возвращает форму авторизации - фабричный метод
     *
     * @return
     */
    FormLogin getLoginForm();
}
