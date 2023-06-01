package com.retailsupermarket.retailsupermarket.repository;

import com.retailsupermarket.retailsupermarket.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {


    List<Product> findAllByOrderByNameAsc();
    @Query("select p from Product p where  p.supplier.id=:id")
    List<Product> getProductsBySupplierId(Integer id);
}
