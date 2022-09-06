package com.sixdee.book.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sixdee.book.model.Book;


public interface BookRepo extends JpaRepository<Book, Integer>
{

	public List<Book> findByBookGenre(String bookGenre);

	public List<Book> findByAuthorName(String authorName);

}
