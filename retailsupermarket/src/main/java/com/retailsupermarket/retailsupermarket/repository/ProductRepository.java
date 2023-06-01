package com.retailsupermarket.retailsupermarket.repository;

import com.retailsupermarket.retailsupermarket.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {


    @Query("SELECT p FROM Product p JOIN FETCH p.supplier")
    List<Product> getAllProductWithSupplierDetail();
    @Query("select p from Product p where  p.supplier.id=:id")
    List<Product> getProductsBySupplierId(Integer id);
}
