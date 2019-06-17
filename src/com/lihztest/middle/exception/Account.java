package com.lihztest.middle.exception;

public class Account {

    double balance;

    public Account() {
        balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }
    public void deposit(double d){
        balance += d;
    }
    public void withdraw(double d) throws OverdraftException {
        balance -= d;
        if(this.balance < 0)
        {
            throw new OverdraftException("balace have already overdraft!", balance);
        }
    }

    public static void main(String[] args) {
        Account account =  new Account();
        account.deposit(1);
        account.deposit(45.9);
        try {
            account.withdraw(100);
        } catch (OverdraftException e) {
            System.out.println(e.getMessage()+e.getDeficit());
            e.printStackTrace();
        }
    }
}

class OverdraftException extends  Exception{
    private double deficit;

    public OverdraftException(String message, double deficit) {
        super(message);
        this.deficit = deficit;
    }
    public double getDeficit()
    {
        return deficit;
    }
}
