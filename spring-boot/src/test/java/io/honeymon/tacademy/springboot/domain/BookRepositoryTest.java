package io.honeymon.tacademy.springboot.domain;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BookRepositoryTest {

	@Autowired
	BookRepository reposityory;
	
	@Test
	public void testSave(){
		Book book = new Book();
		book.setName("boot-spring-boot");
		book.setIsbn10("0123456789");
		book.setIsbn13("0123456789012");
		
		
		Assert.assertTrue((book.isNew()));
		
		reposityory.save(book);
		
		Assert.assertFalse(book.isNew());
		
		
	}
	
	@Test
	public void testFindByNameLike(){
		Book book = new Book();
		book.setName("boot-spring-boot");
		book.setIsbn10("0123456789");
		book.setIsbn13("0123456789012");
		
		
		Assert.assertTrue((book.isNew()));
		
		reposityory.save(book);
		
		List<Book> books = reposityory.findByNameLike("boot%");
		
		Assert.assertTrue(books.isEmpty());
		
	}
}
