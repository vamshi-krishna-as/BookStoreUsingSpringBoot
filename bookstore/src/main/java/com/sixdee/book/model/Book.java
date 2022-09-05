package com.sixdee.book.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book 
{
	@Id
	private int bookId;
	private String bookName;
	private String authorName;
	private String bookGenre;
	private double bookPrice;
	
	public int getBookId() 
	{
		return bookId;
	}
	
	public void setBookId(int bookId) 
	{
		this.bookId = bookId;
	}
	
	public String getBookName()
	{
		return bookName;
	}
	
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
	}
	
	public String getAuthorName() 
	{
		return authorName;
	}
	
	public void setAuthorName(String authorName) 
	{
		this.authorName = authorName;
	}
	
	public String getBookGenre() 
	{
		return bookGenre;
	}
	
	public void setBookGenre(String bookGenre) 
	{
		this.bookGenre = bookGenre;
	}
	
	public double getBookPrice()
	{
		return bookPrice;
	}
	
	public void setBookPrice(double bookPrice) 
	{
		this.bookPrice = bookPrice;
	}
	
	@Override
	public String toString() 
	{
		return "Book Details : \nbookId = " + bookId + "\nbookName = " + bookName + "\nauthorName = " + authorName + "\nbookGenre = "
				+ bookGenre + "\nbookPrice = " + bookPrice;
	}
	
	
}
