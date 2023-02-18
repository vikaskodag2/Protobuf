package com.demo.dao;

import com.demo.Author;
import com.demo.AuthorList;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.protobuf.util.JsonFormat;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;

@Component
public class AuthorDao {
    List<Author> authorList;

    public AuthorDao() throws IOException {
        loadAuthorsFromJson();
    }

    private void loadAuthorsFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream in = this.getClass().getClassLoader().getResourceAsStream("data.json");
        JsonNode jsonNode = mapper.readValue(in, JsonNode.class);
        String json = mapper.writeValueAsString(jsonNode);

        AuthorList authorListFromJson = fromJson(json);
        this.authorList = authorListFromJson.getAuthorsList();
        System.out.println("Added Authors from json: " + this.authorList.size());
    }

    public List<Author> getAllAuthors() {
        return authorList;
    }

    public Optional<Author> getAuthorWithId(int id) {
        return authorList.stream()
                .filter(author -> id == author.getAuthorId())
                .findFirst();
    }

    private AuthorList fromJson(String json) throws IOException {
        AuthorList.Builder structBuilder = AuthorList.newBuilder();
        JsonFormat.parser().ignoringUnknownFields().merge(json, structBuilder);
        return structBuilder.build();
    }
}
