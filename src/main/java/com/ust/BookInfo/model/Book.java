package com.ust.BookInfo.model;


import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document

public class Book {


    private long bookId;
    private String bookName;
    private double bookPrice;
    private LocalDate publishedDate;
    private int authorId;

    public Book() {
    }

    public Book(long bookId, String bookName, double bookPrice, LocalDate publishedDate, int authorId) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.publishedDate = publishedDate;
        this.authorId = authorId;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(LocalDate publishedDate) {
        this.publishedDate = publishedDate;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}
