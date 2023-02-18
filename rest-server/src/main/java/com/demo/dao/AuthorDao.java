package com.demo.dao;

import com.demo.dto.AuthorDTO;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

@Component
public class AuthorDao {
    List<AuthorDTO> authorList;

    public AuthorDao() throws IOException {
        loadAuthorsFromJson();
    }

    private void loadAuthorsFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("data.json");
        authorList = Arrays.asList(mapper.readValue(in, AuthorDTO[].class));
        System.out.println("Added Authors from json: " + this.authorList.size());
    }

    public List<AuthorDTO> getAllAuthors() {
        return this.authorList;
    }

}
