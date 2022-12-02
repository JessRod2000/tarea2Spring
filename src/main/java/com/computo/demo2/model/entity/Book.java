package com.computo.demo2.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema="public",name = "book")
public class Book {
    @Id
    @Column(name = "id_book")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBook;

    @Column(name = "title")
    private String title;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "books_author",
            joinColumns = @JoinColumn(name = "FK_book", nullable = false),
            inverseJoinColumns = @JoinColumn(name="FK_author", nullable = false)
    )
    private List<Author> authors = new ArrayList<>();
    public void setTitle(String title) {
        this.title = title;
    }
}
