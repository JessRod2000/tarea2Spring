package com.computo.demo2.model.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema="test", name = "author")
public class Author {
    @Id
    @Column(name = "id_author")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAuthor;

    @Column(name = "name_autor")
    private String nameAutor;

    @Column(name = "last_name_autor")
    private String lastNameAutor;

    @ManyToMany(mappedBy = "authors")
    private List<Book> books = new ArrayList<>();

    public void setNameAuthor(String name) {
        nameAutor = name;
    }
    public void setLastNameAuthor(String lastName) {
        lastNameAutor = lastName;
    }
}
