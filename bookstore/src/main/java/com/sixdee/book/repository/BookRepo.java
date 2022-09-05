package com.sixdee.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.sixdee.book.model.Book;

import antlr.collections.List;

public interface BookRepo extends JpaRepository<Book, Integer>
{

	Book findByAuthorName(String authorName);
	
}
