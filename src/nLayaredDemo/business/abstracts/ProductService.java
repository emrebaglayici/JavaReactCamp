package nLayaredDemo.business.abstracts;

import nLayaredDemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void add(Product product);
    List<Product> getAll();
}
