package com.suzune.demo3.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Table(name = "Products")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long id ;

    @Column(name = "product_name", length = 150, nullable = true)
    private String productName;
    @Column(name = "price", precision = 12, scale = 2, nullable = true)
    private BigDecimal price ;

    @OneToMany(mappedBy = "product")
    private List<OrderItem> orderItemList ;
}
