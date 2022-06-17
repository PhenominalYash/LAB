package org.example;

public class BookInfo
{
    private static String bookName;
    private static int bookId;
    private static int bookPrice;
    private static int totalBookIssued;
    private static int bookNumber;
    private static String issueDate;
    private static String returnDate;
    private static String returnBookName;


    public BookInfo(String bookName, int bookId, int bookPrice, String issueDate, String returnDate, int totalBookIssued, String returnBookName, int bookNumber) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.bookPrice = bookPrice;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.totalBookIssued = totalBookIssued;
        this.returnBookName=returnBookName;
    }

    public BookInfo() {

    }


    public void setReturnBookName(String returnBookName) {
        this.returnBookName = returnBookName;
    }

    public static String getReturnBookName() {
        return returnBookName;
    }



    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public static int getBookNumber() {
        return bookNumber;
    }





    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setTotalBookIssued(int totalBookIssued) {
        this.totalBookIssued = totalBookIssued;
    }

    public static String getReturnDate() {
        return returnDate;
    }

    public static int getTotalBookIssued() {
        return totalBookIssued;
    }





    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public static String getBookName() {
        return bookName;
    }

    public static int getBookId() {
        return bookId;
    }

    public static int getBookPrice() {
        return bookPrice;
    }

    public static String getIssueDate() {
        return issueDate;
    }
}
