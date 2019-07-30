package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.book.dao.BookDao;
import com.book.model.Book;


@Service
public class BookService {
	

	@Autowired
	BookDao bookDao;
	
	public Book create(Book book) throws Exception {
		Book b = null;
		 try {
			b= bookDao.create(book);
		} catch (Exception e) {
			
//			 TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
		}
		return b;
	}
	public List<Book> getAllBook(){
		return bookDao.getAll();
		
	}
	
	
	public Optional <Book> getByBookName (String bookName) {
		 return bookDao.getByBookName(bookName);
	}
	
	public void delete(Long bookid) {
		bookDao.delete(bookid);
	}
		
	public void update(Book book) {
		bookDao.update(book);
	}
	

}
