package com.retailsupermarket.retailsupermarket.repository;

import com.retailsupermarket.retailsupermarket.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepo extends JpaRepository<Supplier,Integer> {

}
