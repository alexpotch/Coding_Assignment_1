public class Main {
    public static void main(String[] args) {
        /*
        StandardAccount account = new StandardAccount(1, -100);
        account.Deposit(1000);
        double b = account.GetCurrentBalance();
        System.out.println("Current balance is " + b);
        double w = account.Withdraw(400);
        System.out.println("Withdrawn " + w);
        System.out.println("Current balance is " + account.GetCurrentBalance());
        double w2 = account.Withdraw(1000);
        System.out.println("Withdrawn " + w2);
        System.out.println("Current balance is " + account.GetCurrentBalance());
        */
        Bank b = new Bank();
        b.OpenAccount(new BasicAccount(1,100));
        b.OpenAccount(new StandardAccount(2,100));
        b.OpenAccount(new BasicAccount(3,100));
        b.OpenAccount(new PremiumAccount(4));
        System.out.println(b.GetAllAccounts());
        b.CloseAccount(1);
        System.out.println(b.GetAllAccounts());

    }
}