package com.example.BookStore.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mybook")
public class MyBookList {
    @Id
private Long id;
private String name;
private String author;
private String price;
public MyBookList(){

}
public MyBookList(Long id, String name, String author, String price) {
    this.id = id;
    this.name = name;
    this.author = author;
    this.price = price;
}
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
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
