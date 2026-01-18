package com.demo4.model.entity;


import jakarta.persistence.*;

import java.time.LocalDate;

@Table(name = "author_details")
@Entity
public class AuthorDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private Long id ;
    @Column(name = "biography", length = 500 , nullable = true)
    private String biography ;
    @Column(name = "birth_date", nullable = true)
    private LocalDate birthDate ;
    @OneToOne
    @JoinColumn(name = "author_id")
    private Author author ;
}
