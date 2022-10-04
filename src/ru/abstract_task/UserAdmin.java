package ru.abstract_task;

public class UserAdmin extends User implements Administrator {

    public UserAdmin(String name, String bookName) {
        super(name, bookName);
    }

    @Override
    public void findBook(Librarian labrarian) {
        System.out.println("Админ " + getName() + " взял почитать книгу у админа");
    }

    @Override
    public void giveBook(Reader reader) {
        System.out.println("Админ " + getName() + " взял почитать книгу у админа");
    }

    @Override
    public void alertReturn(Reader reader) {
        System.out.println("Админ " + getName() + "Обнаружил просрочку книги");

    }

    @Override
    public String getName() {
        return name;
    }
}
