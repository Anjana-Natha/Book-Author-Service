package com.ust.BookInfo.controller;

import com.ust.BookInfo.model.Book;
import com.ust.BookInfo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/book")
@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping("/add")
   public Book addBook(Book book){
        return bookRepository.save(book);
   }

   @GetMapping("/allbooks")
    public ResponseEntity<?> getAllBooks(){
        return ResponseEntity.ok(bookRepository.findAll());
   }

   @GetMapping("/bookbyid")
    public ResponseEntity<?> getBookById(long id){
        return ResponseEntity.ok(bookRepository.findById(id));
   }

   @DeleteMapping("/delete")
    public ResponseEntity<Book> deleteBook(long id){
        bookRepository.deleteById(id);
        return ResponseEntity.ok().build();
   }
}
