public class Main {

    public static void main(String[] args) {
        Basket basketInna = new Basket();
        basketInna.add("Молоко", 40, 1, 0.9);
        basketInna.add("Картофель", 8, 12, 1.4);
        basketInna.add("Шарики",5,5);
        basketInna.add("Пакет", 2);
        basketInna.print("Корзина Инны");
        System.out.println("Общий вес корзины " + basketInna.getItemsWeight());
        System.out.println("Общая стоимость товаров в корзине " + basketInna.getItemsPrice());
        System.out.println("Общее количество товаров в корзине " + basketInna.getItemsCount());
        System.out.println("\n");

        Basket basketArtem = new Basket();
        basketArtem.add("Конфеты", 160, 1, 0.6);
        basketArtem.add("Шоколад", 155, 1, 0.2);
        basketArtem.print("Корзина Артема");
        System.out.println("Общий вес корзины " + basketArtem.getItemsWeight());
        System.out.println("Общая стоимость товаров в корзине " + basketArtem.getItemsPrice());
        System.out.println("Общее количество товаров в корзине " + basketArtem.getItemsCount());
        System.out.println("\n");

        Basket basketFjodor = new Basket();
        basketFjodor.add("Циркуль", 15,1,0.1);
        basketFjodor.add("Альбом А4",65,2,0.5);
        basketFjodor.print("Корзина Фёдора");
        System.out.println("Общий вес корзины " + basketFjodor.getItemsWeight());
        System.out.println("Общая стоимость товаров в корзине " + basketFjodor.getItemsPrice());
        System.out.println("Общее количество товаров в корзине " + basketFjodor.getItemsCount());
        System.out.println("\n");

        System.out.println("--------------- ИТОГ ---------------\n");
        System.out.println("Количество корзин: " + Basket.getBasketsCount());
        System.out.println("Общий вес корзин " + Basket.getTotalItemsWeight());
        System.out.println("Общая стоимость всех товаров во всех корзинах: " + Basket.getTotalBasketsPrice());
        System.out.println("Общее число товаров всех корзинах: " + Basket.getTotalItemsCount());
        System.out.println("Средняя стоимость товаров: " + Basket.getAveragePrice() + " руб.");
        System.out.println("Средняя стоимость корзины: " + Basket.getAverageBasketPrice() + " руб.");
        System.out.println("\n");

        System.out.println("--------------- Очищаем корзину Артёма ---------------\n");
        basketArtem.clear();
        basketArtem.print("Корзина Артёма");
        System.out.println("\n");

        System.out.println("--------------- ИТОГ ---------------\n");
        System.out.println("Количество корзин: " + Basket.getBasketsCount());
        System.out.println("Общий вес корзин " + Basket.getTotalItemsWeight());
        System.out.println("Общая стоимость всех товаров во всех корзинах: " + Basket.getTotalBasketsPrice());
        System.out.println("Общее число товаров всех корзинах: " + Basket.getTotalItemsCount());
        System.out.println("Средняя стоимость товаров: " + Basket.getAveragePrice() + " руб.");
        System.out.println("Средняя стоимость корзины: " + Basket.getAverageBasketPrice() + " руб.");
    }
}
