package product.test;

import product.dao.ProductStorage;
import product.dao.ProductStorageImpl;
import product.model.Product;

import static org.junit.jupiter.api.Assertions.*;

class ProductStorageTest {

    ProductStorage storage;
    Product[] product;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        storage = new ProductStorageImpl(5);
        product = new Product[4];
        product[0] = new Product("P001", "Wireless Mouse", "Electronics", 25.99, 150);
        product[1] = new Product("P002", "Organic Green Tea", "Groceries", 9.49, 300);
        product[2] = new Product("P003", "Running Shoes", "Sportswear", 79.99, 75);
        product[3] = new Product("P004", "Notebook A5", "Stationery", 2.50, 500);
        // Yeah, this Product parameters are AI generated its like 2:45 am and
        // there is no way I am making 5 products by myself. Thx for understanding <3
        for(int i = 0; i < product.length; i++) {
            storage.addProduct(product[i]);
        }

    }

    @org.junit.jupiter.api.Test
    void addProduct() {
        assertFalse(storage.addProduct(product[3]));
        Product product = new Product("P005", "Bluetooth Speaker", "Electronics", 45.00, 120);
        assertTrue(storage.addProduct(product));
        assertEquals(5,storage.size());
        product = new Product("P006", "LED Desk Lamp", "Home & Office", 34.75, 200);
        //Yeah-yeah, AI as well
        assertFalse(storage.addProduct(product));
    }

    @org.junit.jupiter.api.Test
    void removeProduct() {
        assertEquals(product[0], storage.removeProduct("P001"));
        assertEquals(3,storage.size());
        assertNull(storage.removeProduct("P006"));
        assertEquals(3,storage.size());
    }

    @org.junit.jupiter.api.Test
    void findProductByID() {
        assertEquals(product[2],storage.findProductByID("P003"));
        assertNull(storage.findProductByID("11111"));

    }

    @org.junit.jupiter.api.Test
    void findProductByName() {
        Product[] testProd = new Product[]{product[0]};
        assertArrayEquals(testProd,storage.findProductByName("Wireless Mouse"));

    }

    @org.junit.jupiter.api.Test
    void findProductByCategory() {
        Product[] testProd = new Product[]{product[0]};
        assertArrayEquals(testProd,storage.findProductByCategory("Electronics"));
    }

    @org.junit.jupiter.api.Test
    void findProductByPrice() {
        Product[] testProd = new Product[]{product[1],product[2]};
        assertArrayEquals(testProd,storage.findProductByPrice(25.99));
    }

    @org.junit.jupiter.api.Test
    void findProductByQuantity() {
        Product[] testProd = new Product[]{product[2]};
        assertArrayEquals(testProd,storage.findProductByQuantity(75,90));
    }
}