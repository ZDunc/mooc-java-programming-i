
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int newCents = this.cents + addition.cents;
        int newEuros = this.euros + addition.euros;

        if (newCents > 100) {
            newEuros++;
            newCents -= 100;
        }

        Money newMoney = new Money(newEuros, newCents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if(this.cents < compared.cents)
                return true;
            else
                return false;
        } else {
            return false;
        }
    }

    public boolean equals(Object compared) {
        if (this == compared)
            return true;

        if (! (compared instanceof Money))
            return false;

        Money temp = (Money) compared;

        if (this.cents == temp.cents &&
            this.euros == temp.euros )
            return true;
        else
            return false; 
    }

    public Money minus(Money decreaser) {
        if (decreaser.lessThan(this)) {
            int newCents = this.cents - decreaser.cents;
            int newEuros = this.euros - decreaser.euros;

            if(newCents < 0) {
                newEuros--;
                newCents += 100;
            }
            return new Money(newEuros, newCents);
        } else {
            return new Money(0,0);
        } 
    }
}
