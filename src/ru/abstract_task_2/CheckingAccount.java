package ru.abstract_task_2;

public class CheckingAccount extends Account {
    public CheckingAccount(int amount) {
        this.amount = amount;

    }

    @Override
    public void pay(int amount) {
        setAmount(this.amount - amount);
    }

    @Override
    public void transfer(Account account, int amount) {
        setAmount(this.amount - amount);
        account.amount += amount;
    }

    @Override
    public void addMoney(int amount) {
        this.amount += amount;
    }
}
