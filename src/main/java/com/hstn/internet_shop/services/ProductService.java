package com.hstn.internet_shop.services;

import com.hstn.internet_shop.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new Product(++ID, "PlayStation 5", "Description PL 5", 67000, "Moscow", "Kolia"));
        products.add(new Product(++ID, "Iphone 5", "Description iPhone 5", 7000, "Piter", "Vasia"));
        products.add(new Product(++ID, "Car", "Mazda", 120000, "Tokio", "Nakamoto"));
    }

    public List<Product> listProducts() {
        return products;
    }

    public void saveProduct(Product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(Long id) {
        products.removeIf(product -> product.getId() == id);
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


}
