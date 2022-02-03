package com.example.bookstore.service;

import com.example.bookstore.entity.Book;
import com.example.bookstore.repository.BookRepository;
import java.math.BigInteger;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

  @Autowired
  private BookRepository bookRepository;

  public Book createBook(String name, String author) {
    Book book = new Book();
    book.setName(name);
    book.setAuthor(author);
    return bookRepository.save(book);
  }

  public Book findByName(String name) {

    Optional<Book> optional = bookRepository.findBookByName(name);

    return optional.orElseGet(() -> new Book(BigInteger.ZERO, "null", "null"));
  }
}
