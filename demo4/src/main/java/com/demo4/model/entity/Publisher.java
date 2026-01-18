package com.demo4.model.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "publishers")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id")
    private Long id ;
    @Column(name = "publisher_name", length = 150 , nullable = false)
    private String publisherName ;
    @OneToMany(mappedBy = "publisher")
    private List<Book> bookList ;
}
