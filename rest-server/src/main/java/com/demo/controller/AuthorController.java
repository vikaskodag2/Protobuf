package com.demo.controller;

import com.demo.dto.AuthorDTO;
import com.demo.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @GetMapping("/authors")
    public ResponseEntity<List<AuthorDTO>> getAllAuthors() {
        return ResponseEntity.ok().body(authorService.getAllAuthors());
    }

}
