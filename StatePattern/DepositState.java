package StatePattern;

public class DepositState implements AccountState{

    @Override
    public void activate(Account account) {

        System.out.println("Account is already activated!");

    }

    @Override
    public void deposit(Double depositAmount, Account account) {

        account.setbalance(account.getbalance() + depositAmount);
        account.toString();

    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {

        account.setbalance(account.getbalance() - withdrawAmount);
        account.toString();

    }

    @Override
    public void suspend(Account account) {

        System.out.println("Account is suspended!");
        account.setaccountState(new SuspendState());

    }

    @Override
    public void close(Account account) {



    }

}

