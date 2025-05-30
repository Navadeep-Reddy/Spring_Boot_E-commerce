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
        return service.getProductById(prodId);

    }

    @PostMapping("/product/add")
    public void add(@RequestBody Product item){
        service.addProduct(item);

    }

    @PutMapping("/product/update")
    public void update(@RequestBody Product item){
        service.updateProduct(item);
    }

    @DeleteMapping("/product/delete/{prodId}")
    public void delete(@PathVariable int prodId){
        service.delete(prodId);
    }

}
