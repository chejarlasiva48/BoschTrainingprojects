package com.bosch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.model.Book;
import com.bosch.service.BookService;


//api for books
@RestController
@RequestMapping("/admin/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/view")
    public List<Book> viewBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/add")
    public void addBook(@RequestBody Book book) {
        bookService.addNewBook(book);
    }

    @DeleteMapping("/remove/{id}")
    public void removeBook(@PathVariable Long id) {
        bookService.removeBook(id);
    }

    @PutMapping("/update/{id}/{price}")
    public void updateBookPrice(@PathVariable Long id, @PathVariable int price) {
        bookService.updateBookPrice(id, price);
    }
}