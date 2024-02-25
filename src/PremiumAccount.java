public class PremiumAccount extends Account{

    public PremiumAccount(int accountNumber) {
        super(accountNumber);
    }

    public double Withdraw(double amount) {
        this.balance -= amount;
        return amount;
    }
}
