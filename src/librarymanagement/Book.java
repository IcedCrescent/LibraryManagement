/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

/**
 *
 * @author Trung's PC
 */
public class Book {
    private int ID;
    private String title;
    private String author;
    private String publisher;

    public Book() {
    }

    public Book(int ID, String title, String author, String publisher) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public int getID() {
        return ID;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    @Override
    public String toString() {
        return String.format("ID: %d\n"
                + "Name: %s\n"
                + "Author: %s\n"
                + "Publisher: %s", ID, title, author, publisher); 
    }
    
    
}
