package com.example.BookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookStore.Entity.Book;
import com.example.BookStore.Repo.BookRepo;

@Service
public class BookService {
@Autowired
private BookRepo bookRepo;
    public void save(Book book){
         bookRepo.save(book);
    }
    public List<Book>getAllBook(){
return bookRepo.findAll();
    }
    public Book getBookbyId(Long id){
        
        return bookRepo.findById(id).get();
    }
    public void deleteById(Long id) {
		bookRepo.deleteById(id);
	}
}
