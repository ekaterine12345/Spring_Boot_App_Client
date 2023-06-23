package com.example.spring_boot_app_client.controller;

import com.example.spring_boot_app_client.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }



    @GetMapping("/api/book")
    public String getBook(){
      return this.bookService.getBook();
    }
}
