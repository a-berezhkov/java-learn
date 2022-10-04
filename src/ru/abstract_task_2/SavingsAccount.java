package ru.abstract_task_2;

public class SavingsAccount extends Account {



    public SavingsAccount(int amount) {
        this.amount = amount;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Нельзя оплатить с сберегательного счета");

    }

    @Override
    public void transfer(Account account, int amount) {
        setAmount(this.amount - amount);
        account.amount += amount;
    }

    @Override
    public void addMoney(int amount) {
        setAmount(this.amount + amount);
    }
}
