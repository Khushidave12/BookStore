package com.example.BookStore.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookStore.Entity.Book;

@Repository
public interface BookRepo extends JpaRepository <Book,Long> {

}
