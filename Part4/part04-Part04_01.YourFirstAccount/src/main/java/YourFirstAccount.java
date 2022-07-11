
public class YourFirstAccount {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // Write your program here

        // Construct & initialize account
        Account myAccount = new Account("Arto's account", 100.00);

        // Deposit money and print balance
        myAccount.deposit(20.0);
        System.out.println(myAccount);
    }
}
