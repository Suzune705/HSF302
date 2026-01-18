package com.demo4.model.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long id ;
    @Column(name = "pen_name", length = 150 , nullable = false)
    private String penName ;
    @Column(name = "nationality", length = 100 , nullable = true)
    private String nationality ;
    @OneToOne(mappedBy = "author")
    private AuthorDetail authorDetail ;
}
