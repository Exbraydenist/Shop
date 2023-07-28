public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Молоко", 40, 1, 0.93);
        basket.add("Картофель", 8, 12, 1.43);
        basket.add("Шарики",5,5);
        basket.add("Пакет", 2);

        basket.print("Ваша корзина");
        basket.getTotalWeight();
        basket.getTotalPrice();

    }
}
