package ru.antowka.patterns.abstractFactory.entities;

/**
 * Сущность ToolPanel
 */
public interface ToolPanel {

    /**
     * Метод показывает панель
     *
     * @return
     */
    String showPanel();

    /**
     * Метод скрывает панель
     *
     * @return
     */
    String hidePanel();
}
