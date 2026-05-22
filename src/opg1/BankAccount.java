package opg1;

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(double balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }


    public void deposit(double amount){
        this.balance += amount;
        if (amount <= 0){
            throw new IllegalArgumentException("Amount insufficient! Has to be over 0.");
        }
        System.out.println("Money was deposited: "+ amount +
                ", New account balance for " + getOwner() + " is: "+ this.balance + "kr");

    }


    public void withdraw(double amount){
        double newWithdrawAmount = amount - this.balance;

            if (amount > this.balance) {
                throw new IllegalArgumentException("Amount is over your account " +
                        "balance by: " + newWithdrawAmount +"kr. " + "Try again with more funds!");
            } else if (amount <= 0){
                throw new IllegalArgumentException("Amount insufficient! Has to be over 0.");
            }

        this.balance -= amount;
        System.out.println("Money was withdrawn: "+ amount +
                ", New account balance for " + getOwner() + " is: "+ this.balance + "kr");
    }


    public void transfer(BankAccount target, double amount){
        double newAmount = amount - this.balance;

            if (amount > this.balance) {
                throw new IllegalArgumentException("Amount is over your account " +
                        "balance by: " + newAmount +"kr. " + "Try again with more funds!");
            } else if (amount <= 0){
                throw new IllegalArgumentException("Amount insufficient! Has to be over 0.");
            }

        this.balance -= amount;
        target.balance += amount;
        System.out.println(amount +"kr succesfully transfered to "+ target);

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
