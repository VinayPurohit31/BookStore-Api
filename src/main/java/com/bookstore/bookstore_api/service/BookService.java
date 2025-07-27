package com.bookstore.bookstore_api.service;

import com.bookstore.bookstore_api.model.Book;
import com.bookstore.bookstore_api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service  // 💡 Tells Spring this is a service component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // 📌 Add a new book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // 📌 Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // 📌 Get book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // 📌 Delete book by ID
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }
}
