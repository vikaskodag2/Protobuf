package com.demo.service;

import com.demo.dto.AuthorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Service
public class AuthorRestService {

    @Autowired
    private WebClient webClient;

    public List<AuthorDTO> getAllAuthorFromRest() {
        long time = System.currentTimeMillis();
        AuthorDTO[] authorDTOS = webClient
                .get()
                .retrieve()
                .bodyToMono(AuthorDTO[].class)
                .block();

        System.out.println("Time taken to fetch the data via Rest: " + (System.currentTimeMillis() - time) + " ms");
        return Arrays.asList(authorDTOS);
    }
}
