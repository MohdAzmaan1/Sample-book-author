package com.example.BookAuthor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class ServiceClass {

    @Autowired
    RepoClass repoClass;

    public Book addBook(Book book){
        return repoClass.addBook(book);
    }

    public Author addAuthor(Author author){
        return repoClass.addAuthor(author);
    }

    public String getAuthorWithHighestPages(){
        return repoClass.getAuthorWithHighestPages();
    }

    public Book updateBookPage(String name, int page){
        return repoClass.updateBookPage(name, page);
    }
}
