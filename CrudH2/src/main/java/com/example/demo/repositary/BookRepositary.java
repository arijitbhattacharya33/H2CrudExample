package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.BookEntity;

@Repository
public interface BookRepositary 
        extends JpaRepository<BookEntity, Long> {
 
}