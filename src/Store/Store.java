package Store;

import Store.Products.Bread;
import Store.Products.Chocolate;
import Store.Products.Coke;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] products = new ProductForSale[3];
        products[0] = new Bread("Wonder", "White Bread", 1.99);
        products[1] = new Coke("Coca-Cola", "Coke Classic", 1.99);
        products[2] = new Chocolate("Hershey's", "Milk Chocolate", 1.99);
        listProducts(products);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product : products) {
            product.showDetails();
            System.out.println("--------------------");
        }
    }
}