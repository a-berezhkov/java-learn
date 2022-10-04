package ru.abstract_task_2;

public class Main {

    public static void main(String[] args){
        SavingsAccount savingsAccount = new SavingsAccount(100);
        CreditAccount  creditAccount = new CreditAccount(1000);


        savingsAccount.transfer(creditAccount, 100);
        System.out.println(savingsAccount.getAmount());
        System.out.println(creditAccount.getAmount());

    }
}
