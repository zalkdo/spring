package io.honeymon.tacademy.springboot.domain;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Book extends AbstractPersistable<Long> {

	private String name;
	private String isbn13;
	private String isbn10;
	
	

}
