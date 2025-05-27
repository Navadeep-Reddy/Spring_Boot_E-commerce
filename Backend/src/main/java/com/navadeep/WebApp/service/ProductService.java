package com.navadeep.WebApp.service;

import com.navadeep.WebApp.model.Product;
import com.navadeep.WebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Stream;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Product> getProducts(){
        return repo.findAll();
    }

    public void addProduct(Product newProduct){
        repo.save(newProduct);
    }


    public void updateProduct(Product updatedProdcut){

        //use the same save method for updating
        repo.save(updatedProdcut);
    }

    public void delete(int prodId){
        repo.deleteById(prodId);
    }

    public Product getProductById(int prodId){
        return repo.findById(prodId).get();
    }
}
