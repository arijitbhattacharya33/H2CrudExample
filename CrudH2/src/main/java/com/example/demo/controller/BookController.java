package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.BookEntity;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;

	@GetMapping("/books")
	public ResponseEntity<List<BookEntity>> getAllEmployees() {
		List<BookEntity> bookList = service.getAllBooks();
		return new ResponseEntity<List<BookEntity>>(bookList, new HttpHeaders(), HttpStatus.OK);
	}
	
	@PostMapping("/books")
    public ResponseEntity<BookEntity> createOrUpdateEmployee(@RequestBody BookEntity book)
                                                    throws Exception {
		BookEntity updated = service.createOrUpdateEmployee(book);
        return new ResponseEntity<BookEntity>(updated, new HttpHeaders(), HttpStatus.OK);
    }
}
