package com.ust.BookInfo.controller;

import com.ust.BookInfo.model.Book;
import com.ust.BookInfo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;


    @PostMapping("/add")
    public Book addBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @GetMapping("/allbooks")
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @GetMapping("/bookbyid/{bid}")
    public Book getABooks(@PathVariable long bid) {
        return this.bookRepository.findById(bid).get();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable long id) {
        bookRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("author/{authorId}")
    public List<Book> getBooksByAuthorId(@PathVariable int authorId) {
        return bookRepository.findByAuthorId(authorId);
    }
}
