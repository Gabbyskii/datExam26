package opg1;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccount {

    private String owner;
    private double balance;
    private ArrayList<String> transactionHistory;
    private TextUI ui;

    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
        this.transactionHistory = new ArrayList<>();
        this.ui = new TextUI();
    }


    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount insufficient! Has to be over 0.");
        }
        this.balance += amount;
        transactionHistory.add("Deposit:  +" + amount + "kr  \nBalance: " + this.balance + "kr");
        System.out.println("Money was deposited: " + amount +
                " | New account balance for " + getOwner() + " is: " + this.balance + "kr");

    }


    public void withdraw(double amount) {
        double newWithdrawAmount = amount - this.balance;

        if (amount > this.balance) {
            throw new IllegalArgumentException("Amount is over your account " +
                    "balance by: " + newWithdrawAmount + "kr. " + "Try again with more funds!");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Amount insufficient! Has to be over 0.");
        }

        this.balance -= amount;
        transactionHistory.add("Withdrawal: -" + amount + "kr  \nBalance: " + this.balance + "kr");
        System.out.println("Money was withdrawn: " + amount +
                " | New account balance for " + getOwner() + " is: " + this.balance + "kr");
    }


    public void transfer(BankAccount target, double amount) {
        double newAmount = amount - this.balance;

        if (amount > this.balance) {
            throw new IllegalArgumentException("Amount is over your account " +
                    "balance by: " + newAmount + "kr. " + "Try again with more funds!");
        } else if (amount <= 0) {
            throw new IllegalArgumentException("Amount insufficient! Has to be over 0.");
        }

        this.balance -= amount;
        target.balance += amount;

        transactionHistory.add("Transfer: -" + amount + "kr to " + target.getOwner() +
                "\nBalance: " + this.balance + "kr");
        target.transactionHistory.add("Transfer: +" + amount + "kr from " +
                this.getOwner() + "\nBalance: " + target.balance + "kr");
        System.out.println(amount + "kr succesfully transfered to " + target);

    }


    public void getTransactionsHistory() {
        System.out.println("\n===Transaction History for " + owner + "===");
        for (int i = 0; i < transactionHistory.size(); i++) {
            System.out.println((i+1)+ ". "+ transactionHistory.get(i));
        }
        System.out.println("===End of history===");
    }

    public void bankMenu(BankAccount account, BankAccount target){
        boolean runs = true;

        while (runs){
            System.out.println("== Bank Transaction Menu ==");
            System.out.println("1. Deposit money.");
            System.out.println("2. Withdraw money.");
            System.out.println("3. Transfer money.");
            System.out.println("4. Exit menu.\n");

            String choice = ui.promptText("Choose: ");
            switch (choice) {
                    case "1" -> {
                        try {
                            double dep = ui.promptNum("Deposit amount: ");
                            account.deposit(dep);
                        } catch(IllegalArgumentException e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    case "2" -> {
                        try {
                            double wit = ui.promptNum("Withdraw amount: ");
                            account.withdraw(wit);
                        } catch (IllegalArgumentException e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    case "3" -> {
                        try {
                            double trans = ui.promptNum("Transfer amount: ");
                            account.transfer(target, trans);
                        } catch (IllegalArgumentException e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    case "4" -> {
                        try {
                            System.out.println("Exiting menu..");
                            account.getTransactionsHistory();
                            runs = false;
                        } catch (IllegalArgumentException e){
                            System.out.println("Error: " + e.getMessage());
                        }
                    }
                    default -> System.out.println("Invalid!");
                }
            }

        }



    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "Owner: " + owner;
    }



}
