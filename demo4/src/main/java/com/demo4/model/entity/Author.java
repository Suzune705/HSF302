package com.demo4.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "authors")
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
