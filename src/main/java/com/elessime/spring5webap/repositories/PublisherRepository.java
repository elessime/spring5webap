package com.elessime.spring5webap.repositories;

import com.elessime.spring5webap.Publisher;

import org.springframework.data.repository.CrudRepository;


public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
