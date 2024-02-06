
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    public Money plus(Money addition) {
        int totalEuros = this.euros + addition.euros;
        int totalCentos = this.cents + addition.cents;
        Money newMoney = new Money(totalEuros, totalCentos);
        return newMoney;
    }
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros()) {
            return true;
        }
        if (this.euros == compared.euros()) {
            if (this.cents< compared.cents()){
                return true;
            }
        }
        return false;
    }
    public Money minus(Money decreaser) {
      int totalEuros = this.euros - decreaser.euros;
      int totalCents = this.cents - decreaser.cents;
      if (totalCents < 0) {
          totalCents = 100 - Math.abs(totalCents);
          totalEuros--;
      }
      Money newTotal = null;
      if(totalEuros <0) {
          newTotal = new Money(0,0);
          return newTotal;
      }
      newTotal = new Money(totalEuros,totalCents);
      return newTotal;

    }
}