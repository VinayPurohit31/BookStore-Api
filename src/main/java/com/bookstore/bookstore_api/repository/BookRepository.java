package com.bookstore.bookstore_api.repository;

import com.bookstore.bookstore_api.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // ✅ For filtering by title (case-insensitive)
    List<Book> findByTitleContainingIgnoreCase(String title);
    List<Book> findByAuthor_NameContainingIgnoreCase(String name);

}
