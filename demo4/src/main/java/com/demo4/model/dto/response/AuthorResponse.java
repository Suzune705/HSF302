package com.demo4.model.dto.response;


import lombok.*;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthorResponse {
    private String penName ;
    private String nationality ;
    private AuthorDetailResponse authorDetailResponse ;
}
