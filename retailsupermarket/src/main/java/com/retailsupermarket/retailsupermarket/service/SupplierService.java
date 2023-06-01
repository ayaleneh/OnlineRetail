package com.retailsupermarket.retailsupermarket.service;

import com.retailsupermarket.retailsupermarket.entity.Product;
import com.retailsupermarket.retailsupermarket.repository.ProductRepository;
import com.retailsupermarket.retailsupermarket.repository.SupplierRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {
    @Autowired
    SupplierRepo supplierRepo;
    @Autowired
    ProductRepository productRepository;

    public List<Product> getProductBySupplierId(Integer id){
        return productRepository.getProductsBySupplierId(id);
    }
}
