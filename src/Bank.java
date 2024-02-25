import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Bank implements IBank {
    List<IAccount> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void OpenAccount(IAccount account) {
        accounts.add(account);
    }
    public void CloseAccount(int accountNumber) {
        for(IAccount a:this.accounts) {
            if (a.GetAccountNumber() == accountNumber) {
                if (a.GetCurrentBalance() >= 0) {
                    this.accounts.remove(a);
                } else {
                    System.out.println("The account is not closed due to debt");
                }
                return;
            }
        }
    }

    public List<IAccount> GetAllAccounts() {
        return accounts ;
    }

    public List<IAccount> GetAllAccountsInDebt() {
        //return accounts.stream().filter(account -> account.GetCurrentBalance() < 0).toList();
        List<IAccount> inDebtAccounts = new ArrayList<>();
        for (IAccount a : this.accounts) {
            if (a.GetCurrentBalance() < 0) {
                inDebtAccounts.add(a);
                }

            }
        return inDebtAccounts;
    }

    public List<IAccount> GetAllAccountsWithBalance(double balanceAbove) {
        //return accounts.stream().filter(account -> account.GetCurrentBalance() > balanceAbove).toList();

        List<IAccount> inBalanceAccounts = new ArrayList<>();
        for (IAccount a : this.accounts) {
            if (a.GetCurrentBalance() >= 0) {
                inBalanceAccounts.add(a);
            }

        }
        return inBalanceAccounts;
    }
}
