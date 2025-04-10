package com.example.BookStore.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.BookStore.Service.MyBookService;

@Controller
public class MyBookListController {
    @Autowired
    private MyBookService myBookService;
    @RequestMapping("/deleteMyList/{id}")
public String deleteMyList(@PathVariable("id")int id){
    myBookService.deleteByid(id);
    return "redirect:/my_books ";
}
}
