package com.demo4.controller;

import com.demo4.model.dto.response.AuthorResponse;
import com.demo4.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService ;
    @GetMapping("/author")
    public String showAuthor(Model model ){
        List<AuthorResponse> list = authorService.getAllAuthor();
        model.addAttribute("list", list);
        return "author";
    }
}
