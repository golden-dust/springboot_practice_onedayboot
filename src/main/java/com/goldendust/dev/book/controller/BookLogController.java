package com.goldendust.dev.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.goldendust.dev.book.dto.BookLogCreateDTO;
import com.goldendust.dev.book.dto.BookLogCreateResponseDTO;
import com.goldendust.dev.book.service.BookLogService;

@RestController
@RequestMapping("/book-log")
public class BookLogController {
	
	@Autowired
	private BookLogService bookLogService;
	
	@PostMapping("/create")
	public ResponseEntity<BookLogCreateResponseDTO> insert(@RequestBody BookLogCreateDTO bookLogCreateDTO) {
		BookLogCreateResponseDTO bookLogCreateResponseDTO = this.bookLogService.insert(bookLogCreateDTO);
		return ResponseEntity.ok(bookLogCreateResponseDTO);
	}
}
