package opg1;

public class Main {
    public static void main(String[] args) {

        BankAccount nordeaKunde = new BankAccount(2000, "Peter pan");
        BankAccount danskeBankKunde = new BankAccount(1000, "Lucia C");

        nordeaKunde.deposit(500);
        nordeaKunde.withdraw(100);
        System.out.println();

        try {
            nordeaKunde.transfer(danskeBankKunde, 2500);
        } catch (IllegalArgumentException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }





    }

}

