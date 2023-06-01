package com.retailsupermarket.retailsupermarket.service;

import com.retailsupermarket.retailsupermarket.entity.Product;
import com.retailsupermarket.retailsupermarket.repository.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Transactional
    public List<Product> getAllProducts(){
        return productRepository.findAllByOrderByNameAsc();
    }

}
