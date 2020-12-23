/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabriel
 */

import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> books;
    
    public Library() {
        
        this.books =  new ArrayList<Book>();
    }
    
    public void addBook(Book book) {
        this.books.add(book);
    }
    
    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        
        ArrayList<Book> results = new ArrayList<Book>();
        
        for (Book book : this.books) {
            if (StringUtils.included(book.title(), title)) {
                results.add(book);
            }
        }
        
        return results;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        
        ArrayList<Book> results = new ArrayList<Book>();
        
        for (Book book : this.books) {
            if (StringUtils.included(book.publisher(), publisher)) {
                results.add(book);
            }
        }
        
        return results;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        
        ArrayList<Book> results = new ArrayList<Book>();
        
        for (Book book : this.books) {
            if (book.year()  == year) {
                results.add(book);
            }
        }
        
        return results;
    }
}
