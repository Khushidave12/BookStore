package com.example.BookStore.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="book")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name;
private String author;
private String price; 

public Book(){

}

public Book(Long id, String name, String author, String price) {
    id = id;
    this.name = name;
    this.author = author;
    this.price = price;
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getAuthor() {
    return author;
}

public void setAuthor(String author) {
    this.author = author;
}

public String getPrice() {
    return price;
}

public void setPrice(String price) {
    this.price = price;
}

}
