package com.example.springboothttpmethods.service;

import com.example.springboothttpmethods.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
//assume singleton is ok here
@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> findAll() {
        return productList;
    }

}
