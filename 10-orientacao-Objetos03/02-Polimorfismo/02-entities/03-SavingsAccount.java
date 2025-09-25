package entities;

public class SavingsAccount extends Account {

    private Integer interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Integer interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * (interestRate / 100);
    }

    @Override
    public final void withdraw(double amount) {
        balance -= amount;
    }

}
