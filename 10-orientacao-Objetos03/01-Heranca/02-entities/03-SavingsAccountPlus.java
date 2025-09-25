package entities;

public class SavingsAccountPlus extends SavingsAccount {

    /*o final que esta no metodo da classe SavingsAccount não deixa a classe
    SavingsAccountPlus sobrepor esse metodo*/
    @Override
    public void withdraw(double amount) {
        balance -= amount + 2.0;
    }

}
