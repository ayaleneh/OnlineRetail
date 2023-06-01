package com.retailsupermarket.retailsupermarket.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.List;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank
    private String name;

    @Column(name = "phone_number")
    private String contactPhone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "supplier",fetch = FetchType.EAGER)
    private List<Product> products;
}
