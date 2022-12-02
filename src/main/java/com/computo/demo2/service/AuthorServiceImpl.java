package com.computo.demo2.service;

import com.computo.demo2.model.entity.Author;
import com.computo.demo2.model.repository.AuthorRepository;
import com.computo.demo2.model.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public List<Author> findAllAuthors() {
        return authorRepository.findAll();
    }
}
