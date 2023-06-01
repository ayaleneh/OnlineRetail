package com.retailsupermarket.retailsupermarket.controller;

import com.retailsupermarket.retailsupermarket.entity.Product;
import com.retailsupermarket.retailsupermarket.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/srmweb/api/product")

public class SupplierController {
    @Autowired
    SupplierService supplierService;

    @GetMapping("/get/supplier/{id}")
    public List<Product> getAllProductBySupplierId(@PathVariable Integer id){
       return supplierService.getProductBySupplierId(id);
    }
}
