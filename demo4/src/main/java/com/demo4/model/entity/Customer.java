package com.demo4.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Long id ;
    @Column(name = "customer_name", length = 150 , nullable = false)
    private String customerName ;
    @Column(name = "phone" , length = 20 , nullable = true)
    private String phone ;
    @OneToMany(mappedBy = "customer")
    private List<Rental> rentalList ;
}
