package com.demo4.model.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "rental_items")
public class RentalItem {
    @EmbeddedId
    private RentalItemId  id ;

    @ManyToOne
    // mapping to the name of PK column in inverse side
    @JoinColumn(name = "rental_id")
    // mapping to the name of PK field in @Embeddable
    @MapsId("rentalId")
    private Rental rental ;

    @ManyToOne
    @JoinColumn(name = "book_id")
    @MapsId("bookId")
    private Book book ;

    @Column(name = "daily_price", nullable = true)
    private BigDecimal dailyPrice ;
    @Column(name = "days_rented", nullable = true)
    private int daysRented ;

}
