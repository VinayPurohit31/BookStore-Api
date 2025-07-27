package com.bookstore.bookstore_api.controller;

import com.bookstore.bookstore_api.model.Author;
import com.bookstore.bookstore_api.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }
}
