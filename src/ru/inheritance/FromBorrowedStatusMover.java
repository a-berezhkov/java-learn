package ru.inheritance;

public class FromBorrowedStatusMover extends BookMover {

    @Override
    public void moveToStatus(Book book, Status status){
        if (status == Status.OVERDUED || status == Status.ARCHIVED ){
            book.status = status;
            System.out.println("Статус изменен. Тещий статус: " +  book.status);
        } else {
            System.out.println("Статус Не изменен. Тещий статус: " +  book.status);
        }
    }
}
