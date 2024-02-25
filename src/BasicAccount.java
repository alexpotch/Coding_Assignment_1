public class BasicAccount extends Account{

    double withdrawalLimit;


    public BasicAccount(int accountNumber, double withdrawalLimit){
        super(accountNumber);
        if (withdrawalLimit < 0) {
            this.withdrawalLimit = 0;
        } else {
            this.withdrawalLimit = withdrawalLimit;
        }
    }

    public double Withdraw(double amount) {
        double actualWithdraw = Math.min(amount, this.withdrawalLimit);
        if (this.balance < actualWithdraw) {
            actualWithdraw = this.balance;
        }
        this.balance = this.balance - actualWithdraw;
        return actualWithdraw;
    }

}
