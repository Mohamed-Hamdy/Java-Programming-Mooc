/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohamed Hamdy
 */
public class Book implements Packable {
    String author , bookName;
    double weight;
    
    public Book(String author, String bookName, double weight) {
        this.author = author;
        this.bookName = bookName;
        this.weight = weight;
    }

    @Override
    public double weight() {
        return this.weight;
        
    }
    public String getAuthor(){
        return this.author;
    }
    public String getbookName(){
        return this.bookName;
    }
    @Override
    public String toString(){
        return getAuthor() + ": " + getbookName(); 
    }
    
}
