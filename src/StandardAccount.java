public class StandardAccount extends Account {
    double creditLimit;
    public StandardAccount(int accountNumber, double creditLimit) {
        super(accountNumber);
        if (creditLimit >= 0) {
            this.creditLimit = 0;
        } else {
            this.creditLimit = creditLimit;
        }
    }

    public double Withdraw(double amount) {
        double available = this.balance - this.creditLimit;
        if (amount <= available) {
            this.balance -= amount;
            return amount;
        } else {
            this.balance -= available;
            return available;
        }
    }

}
