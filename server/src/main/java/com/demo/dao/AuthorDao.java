package com.demo.dao;

import com.demo.Author;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AuthorDao {
    List<Author> authorList;

    public AuthorDao() {
        authorList = new ArrayList<>();
        authorList.add(Author.newBuilder().setAuthorId(1).setBookId(1).setFirstName("Charles").setLastName("Dickens").setGender("male").build());
        authorList.add(Author.newBuilder().setAuthorId(2).setFirstName("William").setLastName("Shakespeare").setGender("male").build());
        authorList.add(Author.newBuilder().setAuthorId(3).setFirstName("JK").setLastName("Rowling").setGender("female").build());
        authorList.add(Author.newBuilder().setAuthorId(4).setFirstName("Virginia").setLastName("Woolf").setGender("female").build());
    }

    public List<Author> getAllAuthors() {
        return authorList;
    }

    public Optional<Author> getAuthorWithId(int id) {
        return authorList.stream()
                .filter(author -> id == author.getAuthorId())
                .findFirst();
    }
}
