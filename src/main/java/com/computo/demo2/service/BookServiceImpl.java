package com.computo.demo2.service;

import com.computo.demo2.model.entity.Book;
import com.computo.demo2.model.entity.Person;
import com.computo.demo2.model.pojo.dto.BookDTO;
import com.computo.demo2.model.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book persist(BookDTO dto) {
        Book entity = new Book();
        entity.setTitle(dto.getTitle());
        bookRepository.save(entity);
        return entity;
    }
}
