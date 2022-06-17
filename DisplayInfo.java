package org.example;

import java.util.Scanner;
import org.apache.log4j.*;

public class DisplayInfo
{
    private static Logger log2 = Logger.getLogger("DisplayInfo.class");
    public static void main(String[] args) {
        char option;
        do {


            System.out.println("Enter your choice");
            System.out.println("Press 1. Add a book");
            System.out.println("Press 2. Issue a book");
            System.out.println("Press 3. Return a book");
            System.out.println("Press 4. Print issue details");
            System.out.println("Press 0. to exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    LibraryMangaement addBook = new LibraryMangaement();
                    addBook.addBook();
                    break;
                case 2:
                    LibraryMangaement issue = new LibraryMangaement();
                    issue.isssueBook();
                    break;
                case 3:
                    LibraryMangaement returnBook = new LibraryMangaement();
                    returnBook.bookReturn();
                    break;
                case 4:
                    LibraryMangaement issuedBook = new LibraryMangaement();
                    issuedBook.issueDetails();
                    break;
                case 0:
                    LibraryMangaement close = new LibraryMangaement();
                    close.exit();
                    break;
                default:
                    log2.error("Invalid number");

            }
            log2.info("Do you want to continue Y/N");
            option = sc.next().charAt(0);
        }while(option=='Y');
        if(option=='N')
        {
            LibraryMangaement op = new LibraryMangaement();
            op.exit();
        }





        }
    }

