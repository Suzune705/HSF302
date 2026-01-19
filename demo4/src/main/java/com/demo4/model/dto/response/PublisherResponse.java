package com.demo4.model.dto.response;

import com.demo4.model.entity.Book;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PublisherResponse {
    private String publisherName ;
}
