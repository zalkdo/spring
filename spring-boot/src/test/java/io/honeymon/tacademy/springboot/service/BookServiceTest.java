package io.honeymon.tacademy.springboot.service;

import javax.management.RuntimeErrorException;

import io.honeymon.tacademy.springboot.domain.Book;
import io.honeymon.tacademy.springboot.domain.BookRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=WebEnvironment.NONE)
public class BookServiceTest {

	@Autowired
	BookService bookService;
	
/*	@Before
	public void setup(){
		BookRepository repository = new StubBookRepository();
		
	}*/
	
	@Test(expected=RuntimeException.class)
	public void testFindById(){
		Long id = 1L;
		bookService.findById(id).orElseThrow(() -> new RuntimeException("Not found"));
	}
	
	
}
