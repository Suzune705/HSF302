package com.demo2.mapper;


import com.demo2.model.dto.response.UserResponse;
import com.demo2.model.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper {

    public static UserResponse toUserResponse(User user){
        return UserResponse.builder()
                .id(user.getUserID())
                .name(user.getName())
                .account(user.getAccount())
                .build();
    }
}
