public abstract class Account implements IAccount {
    int accountNumber;
    double balance;

    Account(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void Deposit(double amount) {
        balance += amount;
    }

    public double GetCurrentBalance() {
        return balance;
    }

    public int GetAccountNumber() {
        return accountNumber;
    }
}
