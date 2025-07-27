package com.bookstore.bookstore_api.service;

import com.bookstore.bookstore_api.model.Book;
import com.bookstore.bookstore_api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Add book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get book by ID
    public Optional<Book> getBookById(Long id) {
        return bookRepository.findById(id);
    }

    // Delete book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    // ✅ Get paginated and sorted books
    public Page<Book> getBooksPage(Pageable pageable) {
        return bookRepository.findAll(pageable);
    }

    // ✅ Search books by title (filtering)
    public List<Book> searchBooksByTitle(String title) {
        return bookRepository.findByTitleContainingIgnoreCase(title);
    }

    public List<Book> searchBooksByAuthorName(String authorName) {
        return bookRepository.findByAuthor_NameContainingIgnoreCase(authorName);
    }

}
