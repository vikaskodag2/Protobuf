package com.demo.controller;

import com.demo.dto.AuthorDTO;
import com.demo.service.AuthorRestService;
import com.demo.service.BookAuthorClientService;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
public class BookAuthorController {

    @Autowired
    private BookAuthorClientService bookAuthorClientService;

    @Autowired
    private AuthorRestService authorRestService;

    @GetMapping("/author/{id}")
    public Map<Descriptors.FieldDescriptor, Object> getAuthor(@PathVariable(name = "id") String authorId) {
        return bookAuthorClientService.getAuthor(Integer.parseInt(authorId));
    }

    @GetMapping("/authors/stream")
    public List<Map<Descriptors.FieldDescriptor, Object>> getAllAuthorStream() {
        try {
            return bookAuthorClientService.getAllAuthorStream();
        } catch (Exception ex) {
            System.out.println("Exception occurred: " + ex);
            return Collections.emptyList();
        }
    }


    @GetMapping(value = "/authors"
//            ,produces = {"application/x-protobuf"}
//            ,headers = {"Content-Type": mimetypes.PROTO, "Accept": mimetypes.PROTO}
    )
    public String getAllAuthor() throws InvalidProtocolBufferException {
        return bookAuthorClientService.getAllAuthor();
    }

    @GetMapping("/rest/authors")
    public List<AuthorDTO> getAllAuthorFromRest() {
        return authorRestService.getAllAuthorFromRest();
    }
}
