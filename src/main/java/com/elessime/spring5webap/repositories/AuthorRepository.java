package com.elessime.spring5webap.repositories;

import com.elessime.spring5webap.Author;

import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
    
}
