
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
    
    public Money plus(Money added){
        int newEuros = this.euros + added.euros;
        int newCents = this.cents + added.cents;
        return new Money(newEuros, newCents);
    }
    
    public Money minus(Money decremented){
        int newEuros = this.euros - decremented.euros;
        int newCents;
        if((this.cents - decremented.cents) < 0){
            newEuros--;
            newCents = 100 - (decremented.cents - this.cents);
        } else {
            newCents = this.cents - decremented.cents;
        }
        if(newEuros < 0){
            return new Money(0,0);
        }
        return new Money(newEuros, newCents);
    }
    
    public boolean less(Money compared){
        if(this.euros < compared.euros){
            return true;
        } else if(this.euros == compared.euros && this.cents < compared.cents){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
