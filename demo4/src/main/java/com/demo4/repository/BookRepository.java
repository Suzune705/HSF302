package com.demo4.repository;

import com.demo4.model.dto.response.BookResponse;
import com.demo4.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository  extends JpaRepository<Book , Long> {
    List<Book> findAll();
}
