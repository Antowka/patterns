package ru.antowka.patterns.abstractFactory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import ru.antowka.patterns.abstractFactory.entities.FormLogin;
import ru.antowka.patterns.abstractFactory.entities.ToolPanel;
import ru.antowka.patterns.abstractFactory.factories.WidgetFactory;
import ru.antowka.patterns.abstractFactory.factories.impl.EnWidgetFactory;
import ru.antowka.patterns.abstractFactory.factories.impl.RuWidgetFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Тестирования патерна "Абстрактоня Фабрика"
 *
 *  В тесте отображается использование патерна "Абстрактная фабрика",
 *
 *   1) При запуске теста инстанцируются 2 фабрики под разные локализации RU и EN с общим интефейсовм WidgetFactory
 *   2) Метод getFactoryByLocale(String locale) возвращает необходимую фабрику на основе локализации en/ru
 *   3) Метод showWidgets(String locale) из полученной фабрики обрабатывает widget-ы и отображает, не заботясь о их
 *   локализации в этом и заключается основной смысл патерна "Абстрактная фабрика", мы не зная конкретного продукта,
 *   а запрашиваем его у имеющейся фабрики в результате получаем продукт в соответствии фабрики.
 */
@RunWith(MockitoJUnitRunner.class)
public class WidgetTest {

    /**
     * Фабрика EN-локализации для виджетов
     */
    private WidgetFactory enWidgetFactory;

    /**
     * Фабрика RU-локализации для виджетов
     */
    private WidgetFactory ruWidgetFactory;

    @Before
    public void setUp(){

        //Инстанцируем фабрику для EN-локализации
        enWidgetFactory = new EnWidgetFactory();

        //Инстанцируем фабрику для RU-локализации
        ruWidgetFactory = new RuWidgetFactory();
    }

    /**
     * Метод возвращает фабрику виджетов в зависимости от локализации
     *
     * @param locale
     *
     * @return WidgetFactory
     */
    private WidgetFactory getFactoryByLocale(String locale){

        if(locale.equals("ru")) {

            return ruWidgetFactory;

        } else if(locale.equals("en")){

            return enWidgetFactory;

        } else {

            throw new RuntimeException("Wrong locale: " + locale);
        }
    }

    /**
     * Получени виджетов по локализации и их запуск для отображения
     *
     * @param locale
     * @return
     */
    private List<String> showWidgets(String locale) {

        //Получаем фабрику в соответствии локализации
        WidgetFactory widgetFactory = getFactoryByLocale(locale);

        //Получаем виджеты из фабрики
        ToolPanel toolPanel = widgetFactory.getToolPanel();
        FormLogin formLogin = widgetFactory.getLoginForm();

        String showPanel = toolPanel.showPanel();
        String showFormLogin = formLogin.showForm();

        System.out.println(showPanel);
        System.out.println(showFormLogin);

        List<String> result = new ArrayList<String>();

        result.add(showPanel);
        result.add(showFormLogin);;

        return result;
    }

    @Test
    public void checkEnLocale(){

        List<String> widgets = showWidgets("en");
        Assert.assertTrue(widgets.get(0).equals("Show ToolPanel") && widgets.get(1).equals("Show FormLogin"));
    }

    @Test
    public void checkRuLocale(){

        List<String> widgets = showWidgets("ru");
        Assert.assertTrue(widgets.get(0).equals("Показать панель инструментов") &&
                          widgets.get(1).equals("Показать форму авторизации"));
    }
}
