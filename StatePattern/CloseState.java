package StatePattern;

public class CloseState implements AccountState{

    @Override
    public void close(Account account) {

        System.out.println("Account is closed!");

    }

    @Override
    public void deposit(Double depositAmount, Account account) {

        System.out.println("You cannot deposit on a closed account!");

    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {

        System.out.println("You cannot withdraw on a closed account!!");

    }

    @Override
    public void activate(Account account) {

        System.out.println("You cannot activate a closed account!");

    }

    @Override
    public void suspend(Account account) {

        System.out.println("You cannot suspend a closed account!");

    }

}