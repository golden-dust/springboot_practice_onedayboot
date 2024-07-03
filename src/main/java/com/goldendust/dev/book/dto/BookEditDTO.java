package com.goldendust.dev.book.dto;

import com.goldendust.dev.book.entity.Book;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class BookEditDTO {
	
	@NonNull
	@Positive
	private Integer bookId;
	
	@NonNull
	@NotBlank
	private String title;
	
	@NonNull
	@Min(1000)
	private Integer price;
	
	public Book fill(Book book) {
		book.setTitle(title);
		book.setPrice(price);
		return book;
	}
	
}
