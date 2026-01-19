package com.demo4.model.dto.response;


import com.demo4.model.entity.AuthorDetail;
import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorResponse {
    private String penName ;
    private String nationality ;
    private AuthorDetailResponse authorDetail ;
}
