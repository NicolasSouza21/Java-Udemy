package POO.Exercicios.Banco;

import java.util.Scanner;

public class BancoController {

    Scanner sc = new Scanner(System.in);
    BancoModel bm;

    public void cadastrarConta(BancoModel bm) {
        this.bm = bm;

    }

    public void abrir() {

        System.out.println("Bem vindo ao seu banco \n");
        System.out.println("\n Selecione algumas das opções");
        int opcao;

        do {

            System.out.println("Você deseja \n " +
                    "1. Cadastrar sua Conta \n " +
                    "2. Ver informações da sua conta \n" +
                    "3. Depositar algum valor \n" +
                    "4. Sacar valor \n" +
                    "5. Ver saldo \n" +
                    "6. Sair \n");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:

                    cadastrarConta();

                    break;
                case 2:

                    verInfo();
                    break;
                case 3:
                if (bm != null) {
                    deposito(0);
                    
                }else{
                    System.out.println("Cadastre sua conta primeiro");
                }

                   

                    break;
                case 4:
                if (bm != null) {
                    saque(0);
                    
                }else{
                    System.out.println("Cadastre sua conta primeiro");
                }
                    
                    break;
                case 5:
                if (bm != null) {
                    verSaldo(0);
                    
                }else{
                    System.out.println("Cadastre sua conta primeiro");
                }
                    

                default:
                    break;
            }

        } while (opcao != 6);

    }

    public void cadastrarConta() {

        System.out.println("Digite seu nome ");
        String titular = sc.next();
        System.out.println("Digite sua Agencia");
        int numeroConta = sc.nextInt();

        bm = new BancoModel(titular, numeroConta);

    }

    public void verInfo() {
        System.out.println("Nome:" + bm.titular);
        System.out.println("Agencia:" + bm.numeroConta);

    }

    public void deposito(double valorDeposito) {

        System.out.println("Quanto você deseja depositar ");
        valorDeposito = sc.nextDouble();
        bm.saldo += valorDeposito;
        
        
       

    }

    public void saque(double valorSaque) {

        System.out.println("Quanto você deseja sacar");
        valorSaque = sc.nextDouble();

        if (bm.saldo < valorSaque) {
            System.out.println("Saldo insuficiente");

            
            
        }if (bm.saldo > valorSaque) {

            
            
            bm.saldo -= valorSaque;
            
        }else{
            System.out.println("Digite um valor válido");
        
        }
       
        
    }

    public void verSaldo(int i) {
        System.out.println("Seu saldo é: " + bm.saldo);
    }

}
