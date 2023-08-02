package Store.Products;

import Store.ProductForSale;

public class Chocolate extends ProductForSale {
    private String brand;

    public Chocolate(String brand, String description, double price) {
        super("Chocolate", description, price);
        this.brand = brand;
    }

    public String getBrand() {
        return this.brand;
    }

    public void showDetails() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Description: " + this.getDescription());
        System.out.println("Price: " + this.getPrice());
    }
}