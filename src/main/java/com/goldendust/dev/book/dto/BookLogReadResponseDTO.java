package com.goldendust.dev.book.dto;

import com.goldendust.dev.book.entity.BookLog;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class BookLogReadResponseDTO {
	private Integer bookLogId;
	private Integer bookId;
	private String comment;
	private Integer page;
	
	private String displayComment;
	
	public BookLogReadResponseDTO fromBookLog(BookLog bookLog) {
		this.bookLogId = bookLog.getBookLogId();
		this.bookId = bookLog.getBook().getBookId();
		this.comment = bookLog.getComment();
		this.page = bookLog.getPage();
		
		this.displayComment = (this.page == null ? "" : "(p." + String.valueOf(this.page) + ".) ") + this.comment;
		
		return this;
	}
	
	public static BookLogReadResponseDTO BookLogFactory(BookLog bookLog) {
		BookLogReadResponseDTO bookLogReadResponseDTO = new BookLogReadResponseDTO();
		bookLogReadResponseDTO.fromBookLog(bookLog);
		return bookLogReadResponseDTO;
	}
}
