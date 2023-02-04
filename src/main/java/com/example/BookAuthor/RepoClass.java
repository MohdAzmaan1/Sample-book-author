package com.example.BookAuthor;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepoClass {

    List<Book> bookList = new ArrayList<>();
    List<Author> authorList = new ArrayList<>();

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public Book addBook(Book book){
        bookList.add(book);
        return book;
    }

    public Author addAuthor(Author author){
        authorList.add(author);
        return author;
    }

    public String getAuthorWithHighestPages(){
        int page = Integer.MIN_VALUE;
        String name = "";
        for(Author author : authorList){
            if(author.getPages() > page){
                page = author.getPages();
                name = author.getName();
            }
        }
        return name;
    }

    public Book updateBookPage(String name, int page){
        for(Book book : bookList){
            if(book.getName().equals(name)){
                book.setPages(page);
                return book;
            }
        }
        return null;
    }
}
