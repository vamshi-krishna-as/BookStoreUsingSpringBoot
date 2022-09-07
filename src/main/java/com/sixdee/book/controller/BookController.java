package com.sixdee.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@GetMapping("/viewBooks")
	public java.util.List<Book> getBook() 
	{
		return repo.findAll();
	}
	
	@RequestMapping("/getBooksByAuthor")
	public List<Book> getBooksByAuthor(@RequestParam String authorName) 
	{
		return  repo.findByAuthorName(authorName);
	
	}
	
	@RequestMapping("/getBooksById")
	public Optional<Book> getBooksById(@RequestParam("bookId") int bookId)
	{
		return repo.findById(bookId);
	}
	
	@RequestMapping("/getBooksByGenre")
	public List<Book> getBooksByGenre(@RequestParam String bookGenre) 
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
