package com.wayne.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wayne.domain.Book;
import com.wayne.domain.BookRepository;
import com.wayne.exception.BookNotFoundException;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public Book getBookById(Long id) {
		Book book = bookRepository.findOne(id);
		 if(book==null) {
	        	throw new BookNotFoundException("該書單不存在");
	        }
		return book;
	}

}
