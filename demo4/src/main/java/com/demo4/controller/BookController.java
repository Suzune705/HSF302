package com.demo4.controller;


import com.demo4.model.dto.response.BookResponse;
import com.demo4.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService ;

    @GetMapping("/book")
    public String showBook(Model model){
        List<BookResponse> bookResponseList = bookService.getBook() ;
        model.addAttribute("bookList", bookResponseList);
        return "book";
    }
}
