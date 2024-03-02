package StatePattern;

public class SuspendState implements AccountState{

    @Override
    public void suspend(Account account) {

        System.out.println("Account is already suspended!");

    }

    @Override
    public void deposit(Double depositAmount, Account account) {

        System.out.println("Account is suspended!");

    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {

        System.out.println("Account is suspended!");

    }

    @Override
    public void activate(Account account) {

        System.out.println("Account is activated");
        account.setaccountState(new ActivateState());

    }

    @Override
    public void close(Account account) {

        System.out.println("Account is closed");
        account.setaccountState(new CloseState());

    }

}