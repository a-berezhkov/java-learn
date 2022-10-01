package ru.inheritance;

public class Book {


    private String  bookName;
    public Status status;

    public Book(String bookName, Status status){
        this.bookName = bookName;
        this.status = status;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

}
