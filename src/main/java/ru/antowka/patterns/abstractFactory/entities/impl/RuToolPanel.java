package ru.antowka.patterns.abstractFactory.entities.impl;

import ru.antowka.patterns.abstractFactory.entities.ToolPanel;

/**
 * Реализация панели инструментов в RU-локализации
 */
public class RuToolPanel implements ToolPanel {
    @Override
    public String showPanel() {
        return "Показать панель инструментов";
    }

    @Override
    public String hidePanel() {
        return "Скрыть панель инструментов";
    }
}
