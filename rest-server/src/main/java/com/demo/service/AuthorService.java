package com.demo.service;

import com.demo.dao.AuthorDao;
import com.demo.dto.AuthorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    private AuthorDao authorDao;

    public List<AuthorDTO> getAllAuthors() {
        return authorDao.getAllAuthors();
    }
}
