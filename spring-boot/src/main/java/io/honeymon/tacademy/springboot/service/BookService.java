package io.honeymon.tacademy.springboot.service;

import io.honeymon.tacademy.springboot.domain.Book;

import java.util.Optional;

public interface BookService {

	Optional<Book> findById(Long id);
	
	
	
}
