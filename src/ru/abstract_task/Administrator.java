package ru.abstract_task;

public interface Administrator {



    void findBook(Librarian labrarian);
    void giveBook(Reader reader);
    void alertReturn(Reader reader);
    String getName();


}
