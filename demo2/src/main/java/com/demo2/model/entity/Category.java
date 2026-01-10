package com.demo2.model.entity;

import com.demo2.enums.BookType;
import jakarta.persistence.*;

import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "category", schema = "suzune")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private int categoryID ;
   // categories : the field name in java
    @ManyToMany(mappedBy = "categories")
    private Set<Book> books ;
}
