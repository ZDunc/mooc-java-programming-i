public class PaymentCard {
    private double balance;

    public PaymentCard(double initialBalance) {
        balance = initialBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }

    public void eatAffordably() {
        if (balance < 2.60) {
            return;
        }

        if (balance > 0) {
            balance -= 2.60;

            if (balance < 0)
                balance = 0.0;
        }
            
    }

    public void eatHeartily() {
        if (balance < 4.60)
            return;
        
        if (balance > 0) {
            balance -= 4.60;

            if (balance < 0)
                balance = 0.0;
        }
        
    }

    public void addMoney(double amount) {
        if (amount < 0)
            return;

        if (balance + amount <= 150)
            balance+= amount;
        else
            balance = 150.0;
    }
}
