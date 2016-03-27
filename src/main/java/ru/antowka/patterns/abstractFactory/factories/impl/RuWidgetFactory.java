package ru.antowka.patterns.abstractFactory.factories.impl;

import ru.antowka.patterns.abstractFactory.entities.FormLogin;
import ru.antowka.patterns.abstractFactory.entities.ToolPanel;
import ru.antowka.patterns.abstractFactory.entities.impl.RuFormLogin;
import ru.antowka.patterns.abstractFactory.entities.impl.RuToolPanel;
import ru.antowka.patterns.abstractFactory.factories.WidgetFactory;


/**
 * фабрика, которая создаёт виджеты для RU-локализации
 */
public class RuWidgetFactory implements WidgetFactory {

    @Override
    public ToolPanel getToolPanel() {
        return new RuToolPanel();
    }

    @Override
    public FormLogin getLoginForm() {
        return new RuFormLogin();
    }
}
