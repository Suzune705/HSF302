package com.demo4.model.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Table(name = "rentals")
@Entity
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rental_id")
    private Long id ;
    @Column(name = "rental_date", nullable = false)
    private LocalDateTime rentalDate ;
    @Column(name = "return_date", nullable = false)
    private LocalDateTime returnDate ;
    @OneToMany(mappedBy = "rental")
    private List<RentalItem> rentalItemList ;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer ;
}
