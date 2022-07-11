
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here

        // Create accounts
        Account Matthew = new Account("Matthews account", 1000);
        Account Personal = new Account("My account", 0);

        // Money transfer
        Matthew.withdrawal(100.0);
        Personal.deposit(100.0);

        // Print accounts w/ toString() implementation
        System.out.println(Matthew);
        System.out.println(Personal);
    }
}
