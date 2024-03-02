package StatePattern;

public class Account {

    private String accountNumber;
    Double balance;
    private AccountState accountState;

    public Account(String accountNumber, Double balance) {

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountState = new ActivateState();

    }

    public String getaccountNumber() {
        return accountNumber;
    }
    public void setaccountNumber(String accountNumber) {

        this.accountNumber = accountNumber;

    }

    public Double getbalance() {
        return balance;
    }

    public void setbalance(Double balance) {

        this.balance = balance;

    }

    public void deposit(Double depositAmount) {

        accountState.deposit(depositAmount, this);

    }


    public void withdraw(Double withdrawAmount) {

        accountState.withdraw(withdrawAmount, this);

    }

    public void activate() {

        accountState.activate(this);

    }

    public void suspend() {

        accountState.suspend(this);

    }

    public void close() {

        accountState.close(this);

    }

    public String toString() {

        System.out.println("Account Number: " + accountNumber + "\nBalance: " + balance);

        return null;

    }

    public void setaccountState(AccountState accountState) {

        this.accountState = accountState;

    }

}
