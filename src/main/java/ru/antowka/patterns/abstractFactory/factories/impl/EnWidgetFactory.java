package ru.antowka.patterns.abstractFactory.factories.impl;

import ru.antowka.patterns.abstractFactory.entities.FormLogin;
import ru.antowka.patterns.abstractFactory.entities.ToolPanel;
import ru.antowka.patterns.abstractFactory.entities.impl.EnFormLogin;
import ru.antowka.patterns.abstractFactory.entities.impl.EnToolPanel;
import ru.antowka.patterns.abstractFactory.factories.WidgetFactory;


/**
 * фабрика, которая создаёт виджеты для EN-локализации
 */
public class EnWidgetFactory implements WidgetFactory {

    @Override
    public ToolPanel getToolPanel() {
        return new EnToolPanel();
    }

    @Override
    public FormLogin getLoginForm() {
        return new EnFormLogin();
    }
}
