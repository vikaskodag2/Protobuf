package com.demo.dao;

import com.demo.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class BookDao {
    List<Book> bookList;

    public BookDao() {
        bookList = new ArrayList<>();
        bookList.add(Book.newBuilder().setBookId(1).setAuthorId(1).setTitle("Oliver Twist").setPrice(123.3f).setPages(100).build());
        bookList.add(Book.newBuilder().setBookId(2).setAuthorId(1).setTitle("A Christmas Carol").setPrice(223.3f).setPages(150).build());
        bookList.add(Book.newBuilder().setBookId(3).setAuthorId(2).setTitle("Hamlet").setPrice(723.3f).setPages(250).build());
        bookList.add(Book.newBuilder().setBookId(4).setAuthorId(3).setTitle("Harry Potter").setPrice(423.3f).setPages(350).build());
        bookList.add(Book.newBuilder().setBookId(5).setAuthorId(3).setTitle("The Casual Vacancy").setPrice(523.3f).setPages(450).build());
        bookList.add(Book.newBuilder().setBookId(6).setAuthorId(4).setTitle("Mrs. Dalloway").setPrice(623.3f).setPages(550).build());
    }
}
