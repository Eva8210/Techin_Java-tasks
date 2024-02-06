public class Debt {

    private double balance;
    private double interestRate;

    public Debt(double initialBalance, double initialIneterestRate) {
        balance = initialBalance;
        interestRate = initialIneterestRate;
    }
    public void printBalance(){
        System.out.println(balance);
    }
    public void waitOneYear() {
        balance = balance*interestRate;
    }
}
