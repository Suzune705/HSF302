package com.suzune.demo3.model;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id ;

    @Column(name = "order_date", nullable = true)
    private LocalDateTime orderDate ;

    @Column(name = "customer_name", length = 150 , nullable = false)
    private String customerName ;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> orderItemList ;
}
