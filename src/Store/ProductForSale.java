package Store;

public abstract class ProductForSale {
    private String type, description;
    private double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    public String getType() {
        return this.type;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public double getSalesPrice(int quantity) {
        return this.price * quantity;
    }

    public abstract void showDetails();
}
