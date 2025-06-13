package POO.Exercicios.Banco;

public class BancoModel {
    String titular;
    int numeroConta;
    double saldo = 0;

    public BancoModel(String titular, int numeroConta, double saldo) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public BancoModel(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
    }

    public BancoModel(double saldo) {
        this.saldo = saldo;
    }

    

    


    

}
