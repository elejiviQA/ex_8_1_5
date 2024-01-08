package org.ot5usk.utils;

import java.util.List;

public class ProductsOfCategory {

    private List<String> productsOfCategory;

    public ProductsOfCategory(String categoryName) {
        //switch case or delete this garbage code
        if (categoryName.equals("Электроника")) {
            productsOfCategory = productsOfElectronic();
        }
    }

    public List<String> get() {
        return productsOfCategory;
    }

    private static List<String> productsOfElectronic() {
        return List.of("""
                Автоэлектроника и навигация
                Гарнитуры и наушники
                Детская электроника
                Игровые консоли и игры
                Кабели и зарядные устройства
                Музыка и видео
                Ноутбуки и компьютеры
                Офисная техника
                Развлечения и гаджеты
                Сетевое оборудование
                Системы безопасности
                Смартфоны и телефоны
                Смарт-часы и браслеты
                Солнечные электростанции и комплектующие
                ТВ, Аудио, Фото, Видео техника
                Торговое оборудование
                Умный дом
                Электротранспорт и аксессуары""".split("\n"));
    }
}
