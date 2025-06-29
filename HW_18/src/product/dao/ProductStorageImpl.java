package product.dao;

import product.model.Product;

import java.util.Objects;
import java.util.function.Predicate;

public class ProductStorageImpl implements ProductStorage{
    int size;
    Product[] products;

    public ProductStorageImpl(int capacity){products = new Product[capacity];}


    @Override
    public boolean addProduct(Product product) {
        if(product == null||
                size == products.length||
                findProductByID(product.getId())!=null){
            return false;
        }
        products[size]=product;
        size++;
        return true;
    }

    @Override
    public Product removeProduct(String id) {
        for (int i = 0; i < size; i++) {
            if(products[i].getId()==id){
                Product destroyed = products[i];
                products[i] = products[size-1];
                size--;
                products[size]=null;
                return destroyed;
            }

        }
        return null;
    }

    @Override
    public Product findProductByID(String id) {
        for (int i = 0; i < size; i++) {
            if(Objects.equals(products[i].getId(), id)){
                return products[i];
            }

        }
        return null;
    }

    @Override
    public Product[] findProductByName(String name) {
        return findProductByPredicate(p->p.getName().equals(name));
    }

    @Override
    public Product[] findProductByCategory(String category) {
        return findProductByPredicate(p->p.getCategory().equals(category));
    }

    @Override
    public Product[] findProductByPrice(double min) {
        return findProductByPredicate(p->p.getPrice()>=min);
    }

    @Override
    public Product[] findProductByQuantity(int min, int max) {
        return findProductByPredicate(p->p.getQuantity()>=min&&p.getQuantity()<=max);
    }

    public Product[] findProductByPredicate(Predicate<Product> predicate){
        int count =0;
        for (int i = 0; i < size; i++) {
            if(predicate.test(products[i])){
                count++;
            }

        }
        Product[] res = new Product[count];
        for (int i = 0, j=0; i < res.length; i++) {
            if(predicate.test(products[i])){
                res[j++]=products[i];
            }

        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }
}
