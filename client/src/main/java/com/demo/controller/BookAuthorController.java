package com.demo.controller;

import com.demo.service.BookAuthorClientService;
import com.google.protobuf.Descriptors;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class BookAuthorController {

    @Autowired
    private BookAuthorClientService bookAuthorClientService;

    @GetMapping("/author/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getAuthor(@PathVariable(name = "id") String authorId) {
        return bookAuthorClientService.getAuthor(Integer.parseInt(authorId));
    }
}
