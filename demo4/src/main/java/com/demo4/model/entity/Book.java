package com.demo4.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "books")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer id ;
    @Column(name = "book_title" , length = 200 , nullable = true)
    private String bookTitle ;
    @Column(name = "publishedYear", nullable = false)
    private int publishedYear ;
    @OneToMany(mappedBy = "book")
    private List<RentalItem> rentalItemList ;
    @ManyToMany(mappedBy = "bookList")
    private List<Tag> tagList ;
    @ManyToOne
    @JoinColumn(name = "publisher_id")
    private Publisher publisher ;
}
