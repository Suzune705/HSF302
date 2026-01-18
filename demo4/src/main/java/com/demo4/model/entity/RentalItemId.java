package com.demo4.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.util.Objects;

@Embeddable
public class RentalItemId {
    @Column(name = "rental_id")
    private Long rentalId ;
    @Column(name = "book_id")
    private Long bookId ;

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RentalItemId that)) return false;
        return Objects.equals(rentalId, that.rentalId) && Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rentalId, bookId);
    }
}
