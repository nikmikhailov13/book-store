package com.example.bookstore.controller;

import com.example.bookstore.entity.Book;
import com.example.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

  @Autowired
  private BookService bookService;

  @GetMapping("/books/{name}")
  public Book getBookByName(@PathVariable String name) {

    return bookService.findByName(name);
  }

  @GetMapping("/books/{name}/{author}")
  public void createBook(@PathVariable String name, @PathVariable String author) {
    bookService.createBook(name, author);
  }
}
