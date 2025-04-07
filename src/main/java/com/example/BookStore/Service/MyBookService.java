package com.example.BookStore.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.BookStore.Entity.Book;
import com.example.BookStore.Entity.MyBookList;
import com.example.BookStore.Repo.MyBookListRepo;

@Service
public class MyBookService {
    @Autowired
    private MyBookListRepo myBookListRepo;
public void saveMybooks(MyBookList myBookList){
 myBookListRepo.save(myBookList);

}

public List<MyBookList>getAllMyBooks(){
    return myBookListRepo.findAll();
}
public void deleteByid(long id){
    myBookListRepo.deleteById(id);
}


}
