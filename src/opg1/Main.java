package opg1;

public class Main {
    public static void main(String[] args) {

        BankAccount nordeaKunde = new BankAccount(2000, "Peter pan");
        BankAccount danskeBankKunde = new BankAccount(1000, "Lucia C");

        nordeaKunde.bankMenu(nordeaKunde, danskeBankKunde);

        /*try {
            nordeaKunde.bankMenu(nordeaKunde, danskeBankKunde);
        } catch (IllegalArgumentException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }*/



    }

}

