/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author Trung's PC
 */
public class LibraryManager {
    private ArrayList<Book> bookList;
    BufferedReader reader;

    public LibraryManager() {
        bookList = new ArrayList<>();
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public void addBook() throws IOException {
        while (true) {
            System.out.print("Enter book ID:");
            int id = -1;
            try {
                id = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("ID must be a number!");
                continue;
            }
            if (id < 0) {
                System.out.println("ID must be positive!");
                continue;
            }
            if (findByID(id) != -1) {
                System.out.println("ID already exist!");
                continue;
            }
            System.out.print("Enter book's title: ");
            String title = reader.readLine();
            System.out.print("Enter book's author: ");
            String author = reader.readLine();
            System.out.print("Enter book's publisher: ");
            String publisher = reader.readLine();
            bookList.add(new Book(id, title, author, publisher));
            System.out.println("A new book was added!");
            break;
        }
    }
    
    public void removeBook() throws IOException {
        System.out.print("Enter the ID of the book you want to remove: ");
        int id = 0;
        try {
            id = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Incorrect ID format!");
            return;
        }
        int index = findByID(id);
        if (index == -1) {
            System.out.println("Can't find any book with matching ID, aborting....");
            return;
        }
        bookList.remove(index);
        System.out.println("Book is removed");
    }
   
    public void viewAllBook() {
        System.out.println("There are " + bookList.size() + " books:");
        for (Book book : bookList) {
            System.out.println(book);
        }
    }
    
    public void findBook() throws IOException {
        System.out.print("Enter the ID of the book you want to find: ");
        int id = 0;
        try {
            id = Integer.parseInt(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println("Incorrect ID format!");
            return;
        }
        int index = findByID(id);
        if (index == -1) {
            System.out.println("Can't find any book with matching ID");
            return;
        }
        System.out.println(bookList.get(index));
    }
    
    private int findByID(int id) {
        for (Book book : bookList) {
            if (book.getID() == id) 
                return bookList.indexOf(book);
        }
        return -1;
    }
}
