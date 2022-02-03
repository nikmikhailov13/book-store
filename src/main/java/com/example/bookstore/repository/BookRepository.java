package com.example.bookstore.repository;

import com.example.bookstore.entity.Book;
import java.math.BigInteger;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, BigInteger> {

  Optional<Book> findBookByName(String name);
}
