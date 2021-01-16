package com.elessime.spring5webap.repositories;

import com.elessime.spring5webap.Book;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
    
}
