package com.sixdee.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sixdee.book.model.Book;
import com.sixdee.book.repository.BookRepo;


@RestController
public class BookController 
{
	@Autowired
	BookRepo repo;
	
	@PostMapping("/addBook")
	public int addBook(@RequestBody Book book)
	{
		repo.save(book);
		return 0;
	}
	
	@GetMapping("/getBooks")
	public java.util.List<Book> getBook() 
	{
		return repo.findAll();
	}
	
	@GetMapping("/getBooks/{auhtorName}")
	public List<Book> getBooksByAuthor(@PathVariable String authorName) 
	{
		return  repo.findByAuthorName(authorName);
	
	}
	
	@GetMapping("/getBooks/{bookGenre}")
	public List<Book> getBooksByGenre(@PathVariable String bookGenre) 
	{
		return repo.findByBookGenre(bookGenre);
	}
	
	@DeleteMapping("/deleteBook/{bookId}")
	public int deleteBook(@PathVariable("bookId") int bookId) 
	{
		repo.deleteById(bookId);
		return 0;
	}
}
