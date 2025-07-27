package com.bookstore.bookstore_api.model;

import jakarta.persistence.*;
import java.util.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates ID
    private Long id;

    private String title;

    // Set up ManyToOne relationship with Author
    @ManyToOne
    @JoinColumn(name = "author_id") // This column becomes the FK
    private Author author;

    // Getters and Setters (or use Lombok if you prefer)

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
