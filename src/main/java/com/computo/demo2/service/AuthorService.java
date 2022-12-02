package com.computo.demo2.service;

import com.computo.demo2.model.entity.Author;

import java.util.List;

public interface AuthorService{
    List<Author> findAllAuthors();
}
