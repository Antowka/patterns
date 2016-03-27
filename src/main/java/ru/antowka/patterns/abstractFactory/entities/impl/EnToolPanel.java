package ru.antowka.patterns.abstractFactory.entities.impl;

import ru.antowka.patterns.abstractFactory.entities.ToolPanel;

/**
 * Реализация панели инструментов в EN-локализации
 */
public class EnToolPanel implements ToolPanel {
    @Override
    public String showPanel() {
        return "Show ToolPanel";
    }

    @Override
    public String hidePanel() {
        return "Hide ToolPanel";
    }
}
