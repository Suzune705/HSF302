package com.demo4.service;

import com.demo4.mapper.AuthorMapper;
import com.demo4.model.dto.response.AuthorResponse;
import com.demo4.repository.AuthorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository ;
    private final AuthorMapper authorMapper ;
    public AuthorService(AuthorRepository authorRepository, AuthorMapper authorMapper ) {
        this.authorRepository = authorRepository ;
        this.authorMapper = authorMapper ;
    }

    public List<AuthorResponse> getAllAuthor(){
        return authorMapper.toAuthorResponse(authorRepository.findAll());
    }
}
