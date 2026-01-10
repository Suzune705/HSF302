package com.demo2.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Table(name = "book", schema = "suzune")
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookID;
    @ManyToMany
    // create relational table
    @JoinTable(
            // the name of relational table
            name = "book_category",
            // foreign key (book_id) references book(book_id)
            joinColumns = @JoinColumn(name = "book_id"),
            // foreign key ( category_id) references category(category_id)
            inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    private Set<Category> categories;

    @Column(name = "title", length = 50)
    private String title;
    @Column(name = "slug", length = 100)
    private String slug ;
    @Column(name = "author", length = 20)
    private String author;
    @Column(name = "quantity")
    private int quantity;
}
