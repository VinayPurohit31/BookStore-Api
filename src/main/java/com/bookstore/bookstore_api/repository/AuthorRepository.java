package com.bookstore.bookstore_api.repository;

import com.bookstore.bookstore_api.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
    // Long = type of @Id field
}
