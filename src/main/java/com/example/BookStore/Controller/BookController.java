package com.example.BookStore.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.BookStore.Entity.Book;
import com.example.BookStore.Entity.MyBookList;
import com.example.BookStore.Service.BookService;
import com.example.BookStore.Service.MyBookService;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private MyBookService myBookService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String BookRegister() {
        return "BookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook() {
        List<Book> bookList = bookService.getAllBook();
        ModelAndView m = new ModelAndView("BookList");
        m.addObject("book", bookList);
        return m;
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book book) {
        bookService.save(book);
        return "redirect:/available_books";
    }

    @GetMapping("/my_books")
    public String getMyBooks(Model model) {
        List<MyBookList> list = myBookService.getAllMyBooks();
        model.addAttribute("book", list);
        return "MyBooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") long id) {
        Book book = bookService.getBookbyId(id);
        MyBookList myBookList = new MyBookList(book.getId(), book.getName(), book.getAuthor(), book.getPrice());
        myBookService.saveMybooks(myBookList);
        return "redirect:/my_books";
    }

    @RequestMapping("editBook/{id}")
    public String editBook(@PathVariable("id") Long id, Model model) {
        Book book = bookService.getBookbyId(id);
        model.addAttribute("books", book);
        return "BookEdit";
    }
}
