package com.retailsupermarket.retailsupermarket.controller;

import com.retailsupermarket.retailsupermarket.entity.Product;
import com.retailsupermarket.retailsupermarket.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class productController {
    @Autowired
    private ProductService productService;
    @GetMapping("/")
    public List<Product> getAllProduct(){
        return productService.getAllProducts();
    }

}
