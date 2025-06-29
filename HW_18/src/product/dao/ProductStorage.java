package product.dao;

import product.model.Product;

public interface ProductStorage {
    boolean addProduct(Product product);
    Product removeProduct(String id);
    Product findProductByID(String id);
    Product[] findProductByName(String name);
    Product[] findProductByCategory(String category);
    Product[] findProductByPrice(double min);
    Product[] findProductByQuantity(int min, int max);

    int size();
}
