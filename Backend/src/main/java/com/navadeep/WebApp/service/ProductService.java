package com.navadeep.WebApp.service;

import com.navadeep.WebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Stream;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(1, "Television", 10000),
            new Product(2, "Washing Machine", 12000)
            ));

    public List<Product> getProducts(){
        return this.products;
    }

    public void addProduct(Product newProduct){
        products.add(newProduct);
    }


    public void updateProduct(Product updatedProdcut){
        //finding index of product to be updated
        int index = products.stream()
                .filter(p -> p.getId() == updatedProdcut.getId())
                .map(p -> products.indexOf(p))
                .findFirst().get();

        products.set(index, updatedProdcut);
    }

    public void delete(int prodId){
        int index = products.stream()
                .filter(p -> p.getId() == prodId)
                .map(p -> products.indexOf(p))
                .findFirst().get();

        products.remove(index);
    }
}
