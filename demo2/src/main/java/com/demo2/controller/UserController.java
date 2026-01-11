package com.demo2.controller;


import com.demo2.model.dto.response.UserResponse;
import com.demo2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService ;
    @GetMapping("/showuser")
     public String showInformationUser(Model model){
         List<UserResponse> userResponseList = userService.getAllUser();
         model.addAttribute("userResponseList", userResponseList); // same request.addAttribute :))
         return "user/user";
    }
}
