public class Main {

    public static void main(String[] args) {
        Basket basketInna = new Basket();
       basketInna.add("Молоко", 40, 1, 0.93);
       basketInna.add("Картофель", 8, 12, 1.43);
        basketInna.add("Шарики",5,5);
        basketInna.add("Пакет", 2);
        basketInna.print("Корзина Инны");
        basketInna.getTotalProductWeight();
        basketInna.getTotalProductPrice();
        System.out.println("\n");
        Basket basketArtem = new Basket();
        basketArtem.add("Контрацептивы", 160);
        basketArtem.add("Лубрикант", 155, 1, 0.2);
        basketArtem.print("Корзина Артема ");
        basketArtem.getTotalProductWeight();
        basketArtem.getTotalProductPrice();
        System.out.println("\n");
        System.out.println(Basket.getTotalBasketsPrice());
        System.out.println(Basket.getTotalAmountProduct());
        System.out.println("Средняя стоимость товаров: " + Basket.getAveragePrice() + " руб.");
        Basket.getBasketsCount();
        System.out.println("Средняя стоимость корзины: " + Basket.getAverageBasketPrice() + " руб.");
    }
}
