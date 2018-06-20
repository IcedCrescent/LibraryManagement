/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Trung's PC
 */
public class LibraryManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        LibraryManager manager = new LibraryManager();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        flag: while (true) {
            System.out.println("-----Library management program------");
            System.out.println("1. Add a book");
            System.out.println("2. Remove a book");
            System.out.println("3. View all books");
            System.out.println("4. Find book by ID");
            System.out.println("5. Exit");
            System.out.print("Your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    manager.addBook();
                    break;
                case 2:
                    manager.removeBook();
                    break;
                case 3:
                    manager.viewAllBook();
                    break;
                case 4:
                    manager.findBook();
                    break;
                case 5:
                    break flag;
                default:
                    System.out.println("Invalid choice");
            }
        }

    }
    
}
