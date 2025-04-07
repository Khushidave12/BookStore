package com.example.BookStore.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.BookStore.Entity.MyBookList;
@Repository
public interface MyBookListRepo extends JpaRepository<MyBookList,Long>{

    
}