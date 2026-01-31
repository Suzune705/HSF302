package com.demo4.mapper;


import com.demo4.model.dto.response.AuthorDetailResponse;
import com.demo4.model.dto.response.AuthorResponse;
import com.demo4.model.entity.Author;
import com.demo4.model.entity.AuthorDetail;
import org.jspecify.annotations.NonNull;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.stream.Collectors;

@Component // allow spring manage object rather than I have to manage it by manually creating object
public class AuthorMapper {

    public List<AuthorResponse> toAuthorResponseList(List<Author> authorList){
        return authorList.stream()
                .map(author -> AuthorResponse.builder()
                        .penName(author.getPenName())
                        .nationality(author.getNationality())
                        .authorDetailResponse(AuthorDetailResponse.builder()
                                .biography(author.getAuthorDetail().getBiography())
                                .birthDate(author.getAuthorDetail().getBirthDate())
                                .build()
                        )
                        .build()
                ).toList(); // can not be mutable
    }
    public AuthorResponse toAuthorResponse(Author author){
        AuthorResponse authorResponse = AuthorResponse.builder()
                .penName(author.getPenName())
                .nationality(author.getNationality())
                .build();
        return authorResponse ;
    }
}
