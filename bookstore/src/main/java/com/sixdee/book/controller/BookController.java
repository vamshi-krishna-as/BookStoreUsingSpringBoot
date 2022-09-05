package com.sixdee.book.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.PushBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.sixdee.book.model.Book;
import com.sixdee.book.repository.BookRepo;


@RestController
public class BookController 
{
	@Autowired
	BookRepo repo;

	
	@RequestMapping("/")
	public String home() 
	{
		return "home.jsp";
	}
	
	@RequestMapping("/addBook")
	public String addBook(Book book)
	{
		repo.save(book);
		return "home.jsp";
	}
	
	@RequestMapping("/viewBooks")
	@ResponseBody
	public List<Book> viewBooks()
	{
		return repo.findAll();
	}
	
	@RequestMapping("/viewBookByAuthor")
	@ResponseBody
	public Book viewBookByAuthor(@RequestParam String authorName)
	{
		return repo.findByAuthorName(authorName);
	}
	
	@DeleteMapping("/alien/{aid}")
	public String deleteBook(@PathVariable int bookId)
	{
		Book b = repo.getOne(bookId);
		repo.delete(b);
		return "";
	}
	
	/*@RequestMapping("/deleteBooks")
	@ResponseBody
	public String deleteAlien(@RequestParam ("bookId") int bookId) {
	  Book b = repo.getById(bookId);
	  repo.delete(b);
	  return "home.jsp";
	}*/
}
