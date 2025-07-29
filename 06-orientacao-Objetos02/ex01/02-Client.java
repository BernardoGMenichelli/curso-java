package entities;

public class Client {

    private int numeroDaConta;
    private String nome;
    private double deposito;

    //Construtores
    public Client(String nome, int numeroDaConta) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
    }

    public Client(String nome, int numeroDaConta, double depositoInicial) {
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
        deposito(depositoInicial);
    }

    //encapsulamento
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getDeposito() {
        return deposito;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    //metodos
    public void deposito(double valorDepositado) {
        this.deposito += valorDepositado;
    }

    public void retirarValor(double valorRetirado) {
        this.deposito -= valorRetirado + 5.0;
    }

    public String toString() {
        return "Conta " + numeroDaConta + ", Titular da conta: " + nome + ", Saldo: R$ " + String.format("%.2f", deposito);
    }

}
