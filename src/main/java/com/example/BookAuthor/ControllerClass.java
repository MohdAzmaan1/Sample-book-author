package com.example.BookAuthor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ControllerClass {

    @Autowired
    ServiceClass serviceClass;

    @PostMapping("/add-book")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        return new ResponseEntity<>(serviceClass.addBook(book), HttpStatus.CREATED);
    }

    @PostMapping("/add-author")
    public ResponseEntity<Author> addAuthor(@RequestBody Author author){
        return new ResponseEntity<>(serviceClass.addAuthor(author), HttpStatus.CREATED);
    }

    @GetMapping("/get-author-with-highest-pages")
    public ResponseEntity<String> getAuthorWithHighestPages(){
        return new ResponseEntity<>(serviceClass.getAuthorWithHighestPages(), HttpStatus.FOUND);
    }

    @PutMapping("/update-book-page/{name}/{page}")
    public ResponseEntity<Book> updateBookPage(@PathVariable String name, @PathVariable int page){
        return new ResponseEntity<>(serviceClass.updateBookPage(name, page), HttpStatus.ACCEPTED);
    }
}
