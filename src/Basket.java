public class Basket {
    private static int totalItemsCount;
    private static int totalBasketsPrice;
    private static double totalItemsWeight;
    private static int basketsCount;
    private int itemsCount;
    private int itemsPrice;
    private double itemsWeight;
    private String items = "Список товаров: ";
    private int limit = 1000000;


    public Basket() {
        increaseBasketsCount();
    }

    public Basket(int limit) {
        increaseBasketsCount();
        this.limit = limit;
    }

    private static int increaseTotalItemsCountBy(int count) {
        return totalItemsCount += count;
    }
    private static int countTotalBasketPrice(int price) {
        return totalBasketsPrice += price;
    }
    private static double increaseTotalItemsWeight(double weight) {
        return totalItemsWeight += weight;
    }
    public static double getAveragePrice() {
        return (double) Basket.totalBasketsPrice / Basket.totalItemsCount;
    }
    public static double getAverageBasketPrice() {
        return (double) Basket.totalBasketsPrice / Basket.basketsCount;
    }
    public static void increaseBasketsCount() {
        basketsCount++;
    }
    public static int getBasketsCount() {
        return basketsCount;
    }
    public static int getTotalItemsCount() {
        return Basket.totalItemsCount;
    }
    public static int getTotalBasketsPrice() {
        return Basket.totalBasketsPrice;
    }
    public static double getTotalItemsWeight() {
        return Basket.totalItemsWeight;
    }
    public int getItemsCount() {
        return itemsCount;
    }
    public double getItemsWeight() {
        return itemsWeight;
    }
    public int getItemsPrice() {
        return itemsPrice;
    }
    public boolean contains(String name) {
        return items.contains(name);
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }
    public void add(String name, int price, int count) {
        boolean error = contains(name);

        if (itemsPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " + count + " шт. - " + price + " руб.";
        itemsPrice = itemsPrice + count * price;
        itemsCount += count;
        countTotalBasketPrice(count * price);
        increaseTotalItemsCountBy(count);
    }

    public void add(String name, int price, int count, double weight) {
        add(name, price, count);
        itemsWeight += weight * count;
        increaseTotalItemsWeight(weight * count);
        items = items + " " + weight + " г.";
    }

    public void clear() {
        items = "";
        totalItemsCount -= itemsCount;
        itemsCount = 0;
        totalBasketsPrice -= itemsPrice;
        itemsPrice = 0;
        totalItemsWeight -= itemsWeight;
        itemsWeight = 0;
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
