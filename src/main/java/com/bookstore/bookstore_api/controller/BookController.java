package com.bookstore.bookstore_api.controller;

import com.bookstore.bookstore_api.model.Book;
import com.bookstore.bookstore_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    // ✅ Add book
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return bookService.addBook(book);
    }

    // ✅ Get all books
    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    // ✅ Get book by ID
    @GetMapping("/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    // ✅ Delete book by ID
    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        bookService.deleteBook(id);
    }

    // ✅ Pagination + Sorting
    @GetMapping("/page")
    public Page<Book> getBooksPaginated(
            @PageableDefault(size = 5, sort = "title") Pageable pageable) {
        return bookService.getBooksPage(pageable);
    }

    // ✅ Filtering by title
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String title) {
        return bookService.searchBooksByTitle(title);
    }

    // ✅ Filter books by author name
    @GetMapping("/search-by-author")
    public List<Book> searchBooksByAuthor(@RequestParam String author) {
        return bookService.searchBooksByAuthorName(author);
    }

}
