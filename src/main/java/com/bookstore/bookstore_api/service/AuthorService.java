package com.bookstore.bookstore_api.service;

import com.bookstore.bookstore_api.model.Author;
import com.bookstore.bookstore_api.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AuthorService {


    @Autowired
    private AuthorRepository authorRepository;

    // ✅ Add a new Author
    public Author addAuthor(Author author) {
        return authorRepository.save(author);  // This saves to the DB
    }

    // ✅ Get all authors
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    // ✅ Get one author by ID
    public Optional<Author> getAuthorById(Long id) {
        return authorRepository.findById(id);
    }

    // ✅ Delete an author by ID
    public void deleteAuthor(Long id) {
        authorRepository.deleteById(id);
    }
}
