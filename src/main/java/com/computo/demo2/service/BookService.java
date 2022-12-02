package com.computo.demo2.service;

import com.computo.demo2.model.entity.Book;
import com.computo.demo2.model.pojo.dto.BookDTO;

import java.util.List;

public interface BookService {
    List<Book> findAllBooks();
    Book persist(BookDTO dto);
}
