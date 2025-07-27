package com.bookstore.bookstore_api.controller;

import com.bookstore.bookstore_api.model.Book;
import com.bookstore.bookstore_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController  // 💡 Tells Spring this class handles HTTP requests
@RequestMapping("/books")  // 💡 All URLs will start with /books
public class BookController {

    @Autowired
    private BookService bookService;

    // ✅ Add a new book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // ✅ Get all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // ✅ Get a book by ID
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // ✅ Delete a book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }
}
