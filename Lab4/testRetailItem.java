package Lab4;

public class testRetailItem {
    static int globalPrice = 50;
    public static void main(String[] args) {
        RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
        // RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
        // RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
        // System.out.println(RetailItem.isCheap(globalPrice));
        // globalPrice = 45;
        // CC test = new CC();
        // System.out.println(test.getW());
        System.out.println(item1.toString());
    }
}
