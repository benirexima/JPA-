package com.book.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;

import com.book.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long>
{
	@Async
	@Query("SELECT b FROM  book where b.bookName= :bookName")
	Optional<Book> findByBookname(@Param("bookName")String bookname);
}