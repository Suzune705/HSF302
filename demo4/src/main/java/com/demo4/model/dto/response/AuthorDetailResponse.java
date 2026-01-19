package com.demo4.model.dto.response;

import com.demo4.model.entity.Author;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDetailResponse {
    private String biography ;
    private LocalDate birthDate ;
    private Author author ;
}
