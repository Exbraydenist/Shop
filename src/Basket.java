public class Basket {

    private int count = 0;
    private String items = "";
    private int totalItemsPrice;
    private int limit;
    private double totalWeight = 0;
    private static int itemsCount = 0;
    private static int totalBasketsPrice = 0;
    private static int basketsCount = 0;

    public Basket() {
        increaseBasketsCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalItemsPrice = totalPrice;
    }

    public int getCount() {
        return count;
    }

    private static void increaseBasketsCount(int count){ basketsCount = basketsCount + count; }
    public static void getBasketsCount(){ System.out.println(basketsCount); }

    private void increaseCount(int count) { this.count = this.count + count; }

    private static int countProductAmount(int count) { return itemsCount = itemsCount + count; }
    public static int getTotalAmountProduct() {
        System.out.print("Общее число продуктов всех корзин: ");
        return Basket.itemsCount;
    }
    private static int countTotalBasketPrice(int price) { return totalBasketsPrice = totalBasketsPrice + price; }
    public static int getTotalBasketsPrice(){
        System.out.print("Общая стоимость всех товарах во всех корзинах: ");
        return Basket.totalBasketsPrice;
    }

    public static double getAveragePrice() { return (double) totalBasketsPrice / itemsCount; }
    public static double getAverageBasketPrice() { return (double) totalBasketsPrice / basketsCount; }
    public void add(String name, int price) {
        add(name, price, 1);
    }
    public void add(String name, int price, int count) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalItemsPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
                count + " шт. - " + price + " руб.";
        totalItemsPrice = totalItemsPrice + count * price;
        countTotalBasketPrice(count * price);
        countProductAmount(count);
    }

    public void add(String name, int price, int count, double weight){
        add(name, price, count);
        totalWeight = totalWeight + weight;
        items = items + " " + weight + " г.";
    }

    public double getTotalProductWeight(){
        System.out.println("Общий вес корзины " + totalWeight);
        return totalWeight;
    }
    private void clear() {
        items = "";
        totalItemsPrice = 0;
    }

    public int getTotalProductPrice() {
        System.out.println("Общая стоимость товаров в корзине " + totalItemsPrice);
        return totalItemsPrice;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }
}
