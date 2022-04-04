/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Hamdy
 */
public class Book {
    
    private String Author;
    private String name;
    private int pages ;
    public Book(String Author, String name, int pages) {
        this.Author = Author;
        this.name = name;
        this.pages = pages;
    }
    public String getAuthor(){
        return this.Author;
    }
    public String getName(){
        return this.name;
    }
    public int getPages(){
        return this.pages;
    }
    public String toString() {
        
        return getAuthor() + ", " + getName() + ", " + getPages() + " pages";
    }
    
}
