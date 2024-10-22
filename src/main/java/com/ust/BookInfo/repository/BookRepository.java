package com.ust.BookInfo.repository;

import com.ust.BookInfo.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
