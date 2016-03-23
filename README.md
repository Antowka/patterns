# Патерны

**Фабричный метод** — порождающий шаблон проектирования, предоставляющий подклассам интерфейс для создания экземпляров 
некоторого класса. В момент создания наследники могут определить, какой класс создавать. Иными словами, Фабрика делегирует 
создание объектов наследникам родительского класса. Это позволяет использовать в коде программы не специфические классы, 
а манипулировать абстрактными объектами на более высоком уровне.

Краткое описание: В примере используются продукт **Car** и конкретные реализации:

* Track 
* PassengerCar

Эти объекты инстанцируются(создаются) при помощи Creater-a **Garage**, который имеет конкретные реализации для каждого типа продукта:

* PassengerGarage
* TrackGarage

Клиент(Заказчик) имеет у себя объект **Garage** в конкретной реализации(**PassengerGarage** или **TrackGarage**), при вызове у объекта **Garage** метода **garage.getCar()** в зависимости от реализации **Garage** метод вернёт объекты **Track** или **PassengerCar**. Метод **garage.getCar()** и является фабричным.

Пример: https://github.com/Antowka/patterns/tree/master/src/main/java/ru/antowka/patterns/fabricMethod
