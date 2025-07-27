package com.bookstore.bookstore_api.controller;

import com.bookstore.bookstore_api.model.Author;
import com.bookstore.bookstore_api.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/authors")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    // ✅ POST: Add a new author
    @PostMapping
    public Author createAuthor(@RequestBody Author author) {
        return authorService.addAuthor(author);
    }

    // ✅ GET: Get all authors
    @GetMapping
    public List<Author> getAllAuthors() {
        return authorService.getAllAuthors();
    }

    // ✅ GET: Get author by ID
    @GetMapping("/{id}")
    public Optional<Author> getAuthorById(@PathVariable Long id) {
        return authorService.getAuthorById(id);
    }

    // ✅ DELETE: Delete author by ID
    @DeleteMapping("/{id}")
    public void deleteAuthor(@PathVariable Long id) {
        authorService.deleteAuthor(id);
    }
}
