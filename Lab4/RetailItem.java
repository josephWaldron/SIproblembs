package Lab4;

public class RetailItem {
    String description; 
    int unitsOnHand;
    double price;

    public RetailItem(String description, int unitsOnHand, double price){
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isExpensive(){
        return(price > 100);
    }
}