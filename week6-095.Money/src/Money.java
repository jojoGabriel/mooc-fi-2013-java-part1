
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        int cents = this.cents + added.cents;
        int euros = this.euros + added.euros;
        return new Money(euros, cents);
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decremented) {
       
        if (decremented.euros > this.euros) {
            return new Money(0, 0);
        }
            
        int cents = this.cents;
        int euros = this.euros;
        
        if (this.cents < decremented.cents) {
            cents = cents + 100;
            euros = euros - 1;
        }
    
        cents = cents - decremented.cents;
        euros = euros - decremented.euros;
        
        if (euros < 0) {
            cents = 0;
            euros = 0;
        }
        
        return new Money(euros, cents);
    }

}
