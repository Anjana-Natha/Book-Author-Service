package com.ust.BookInfo.repository;

import com.ust.BookInfo.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<Book,Long> {
    List<Book> findByAuthorId(int authorId);
}
