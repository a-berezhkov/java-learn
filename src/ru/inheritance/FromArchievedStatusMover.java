package ru.inheritance;

public class FromArchievedStatusMover extends BookMover {


   @Override
    public void moveToStatus(Book book, Status status) {
        if (book.status == Status.ARCHIVED) {
            book.status = Status.AVAILABLE;
            System.out.println("Статус изменен. Тещий статус: " +  book.status);
        } else {
            System.out.println("Статус Не изменен. Тещий статус: " +  book.status);
        }
    }

}
