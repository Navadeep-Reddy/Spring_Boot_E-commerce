package com.navadeep.WebApp.controller;

import com.navadeep.WebApp.model.Product;
import com.navadeep.WebApp.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    ProductService service;

    public ProductController(ProductService service){
        this.service = service;
    }

    @RequestMapping("/product")
    public List<Product> getService(){
        return service.getProducts();
    }

    @RequestMapping("/product/{prodId}")
    public Product getServiceById(@PathVariable int prodId){
        return service.getProducts()
                .stream()
                .filter(n -> n.getId() == prodId)
                .findFirst().orElse(new Product(-1, "Not Found", 0));
    }

    @PostMapping("/product/add")
    public void add(@RequestBody Product item){
        service.addProduct(item);

    }
}
