package com.wayne.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wayne.domain.Book;
import com.wayne.service.BookService;

@Controller
@RequestMapping("/books")
public class BookController {

	private final Logger logger = LoggerFactory.getLogger(BookController.class);

	@Autowired
	private BookService bookService;

	@GetMapping("/{id}")
	public String getBook(@PathVariable Long id, Model model) {
		Book book = bookService.getBookById(id);
		model.addAttribute("book", book);
		return "book";
	}

	
}
