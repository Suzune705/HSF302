package com.demo4.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "publishers")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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
