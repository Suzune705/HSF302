package com.demo4.repository;

import com.demo4.model.entity.AuthorDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorDetailRepository extends JpaRepository<AuthorDetail , Long> {
    List<AuthorDetail> getAuthorDetailsById(Long id);
}
