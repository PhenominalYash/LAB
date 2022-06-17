package org.example;

import java.util.Scanner;
import org.apache.log4j.*;

public class LibraryMangaement extends BookInfo

{
    private static Logger log =Logger.getLogger("LibraryMangaement.class");
    Scanner scan = new Scanner(System.in);
    Scanner scanint = new Scanner(System.in);


    public LibraryMangaement() {
        super();
    }


    public void addBook()
        {

            log.info("Enter book details:  name,id,price");
              super.setBookName(scan.nextLine());


              super.setBookId(scan.nextInt());

              super.setBookPrice(scan.nextInt());
              log.info("Your detail are : " +BookInfo.getBookName() + " " +BookInfo.getBookId()+ " " +BookInfo.getBookPrice());
        }

        public void isssueBook ()
        {
            log.info("Enter book id,name,issueDate,Return date,Total Book Issued");
            super.setBookId(scanint.nextInt());
            super.setBookName(scan.nextLine());

            super.setIssueDate(scan.nextLine());
            super.setReturnDate(scan.nextLine());
            super.setTotalBookIssued(scanint.nextInt());



        }

        public void bookReturn()
        {
            log.info("Enter book name and book id");
            super.setReturnBookName(scan.nextLine());
            super.setBookNumber(scan.nextInt());
            if(getBookNumber()==getBookId())
            {
                log.info("Book Details");
                log.info("Book name = "+BookInfo.getBookName());
                log.info("Book id = "+BookInfo.getBookId());
                log.info("Issue Date = "+BookInfo.getIssueDate());
                log.info("Total number of book issue = "+BookInfo.getTotalBookIssued());
                log.info("Book return date = "+BookInfo.getReturnDate());
            }
            else
            {
                log.warn("Wrong id, please enter right id ");
            }


        }

        public void issueDetails()
    {
        log.info("issue Details");
        log.info("Book name = "+BookInfo.getBookName());
        log.info("Book id = "+BookInfo.getBookId());
        log.info("Issue Date = "+BookInfo.getIssueDate());
        log.info("Total number of book issue = "+BookInfo.getTotalBookIssued());
        log.info("Book return date = "+BookInfo.getReturnDate());
    }

    public void exit()
    {

        System.exit(0);

    }


    }



