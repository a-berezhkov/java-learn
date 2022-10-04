package ru.abstract_task_2;

public class CreditAccount extends Account {

    public CreditAccount(int amount) {

        this.amount = -amount;

    }


    @Override
    public void setAmount(int amount) {
        if (this.amount <= 0) {
            this.amount = amount;
        } else {
            System.out.println("Ошибка пополнения");
        }

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
