package ru.abstract_task_2;

abstract class Account {

    protected int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        if (this.amount > 0) {
            this.amount = amount;
        } else {
            System.out.println("На счету не хватает средств");
        }

    }

    public abstract void pay(int amount);

    public abstract void transfer(Account account, int amount);

    public abstract void addMoney(int amount);

}
