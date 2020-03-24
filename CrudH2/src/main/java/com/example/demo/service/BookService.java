package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.BookEntity;
import com.example.demo.repositary.BookRepositary;

@Service
public class BookService {

	@Autowired
	BookRepositary repository;

	public List<BookEntity> getAllBooks() {
		List<BookEntity> bookList = repository.findAll();

		if (bookList.size() > 0) {
			return bookList;
		} else {
			return new ArrayList<BookEntity>();
		}
	}

	public BookEntity createOrUpdateEmployee(BookEntity entity) throws Exception {
		//Optional<BookEntity> book = repository.findById(entity.getId());
/*
		if (book.isPresent()) {
			BookEntity newEntity = book.get();
			newEntity.setBookName(entity.getBookName());
			newEntity.setPrice(entity.getPrice());
			newEntity = repository.save(newEntity);
			return newEntity;
		} else {*/
			entity = repository.save(entity);

			return entity;
		//}
	}
}
