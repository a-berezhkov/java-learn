package ru.inheritance;

public class Main {

    public static void main(String[] args) {
        Book book = new Book("Название кинги", Status.AVAILABLE);

        for (Status from : Status.values()) {
            System.out.println("Статус откуда:" + from);
            for (Status to : Status.values()) {
                book.status = from;
                System.out.println("Статус куда:" + to);
                BookMover fromAvailableStatusMover = new FromAvailableStatusMover();
                fromAvailableStatusMover.moveToStatus(book, to);
                BookMover fromArchievedStatusMover = new FromArchievedStatusMover();
                fromArchievedStatusMover.moveToStatus(book, to);
                BookMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
                fromBorrowedStatusMover.moveToStatus(book, to);
                BookMover fromOverduedStatusMover = new FromOverduedStatusMover();
                fromOverduedStatusMover.moveToStatus(book, to);
            }
            System.out.println();
            }

        }
    }

