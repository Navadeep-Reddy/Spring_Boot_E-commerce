package com.navadeep.WebApp.service;

import com.navadeep.WebApp.model.Product;

import java.util.*;

public class ProductService {
    private List<Product> products = Arrays.asList(
            new Product(1, "Television", 10000),
            new Product(2, "Washing Machine", 12000)
            );

    public List<Product> getProducts(){
        return this.products;
    }
}
