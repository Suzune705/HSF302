package com.demo4.service;

import com.demo4.mapper.AuthorMapper;
import com.demo4.model.dto.response.AuthorResponse;
import com.demo4.repository.AuthorRepository;
import org.hibernate.sql.exec.ExecutionException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository ;
    private final AuthorMapper authorMapper ;
    public AuthorService(AuthorRepository authorRepository, AuthorMapper authorMapper ) {
        this.authorRepository = authorRepository ;
        this.authorMapper = authorMapper ;
    }

    public List<AuthorResponse> getAllAuthor(){
        return authorMapper.toAuthorResponseList(authorRepository.findAll());
    }

    public AuthorResponse getAuthorByid(Long id){
        return authorMapper.toAuthorResponse(authorRepository.findById(id).orElseThrow( () -> new RuntimeException("not found")));
    }
}
