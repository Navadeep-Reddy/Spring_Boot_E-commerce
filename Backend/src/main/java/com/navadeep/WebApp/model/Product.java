package com.navadeep.WebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Product {

    @Id
    private int id;
    private String name;
    private int price;

    public Product() {
    }
}
