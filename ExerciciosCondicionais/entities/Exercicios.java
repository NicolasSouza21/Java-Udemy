package entities;

import java.util.Scanner;

public class Exercicios {

    // Scanner para entrada de dados
    // Ao declarar a variável como static, ela passa a pertencer à classe Exercicios em si, e não a uma execução específica de um método.
    // Portanto, ela pode ser acessada por todos os métodos estáticos da classe sem a necessidade de criar uma nova instância do Scanner a cada vez.
    // Isso cria uma instância única que fica disponível para todos os outros membros estáticos da classe.
    private static final Scanner scanner = new Scanner(System.in);

    public static void ParOuImppar() {
        int numero;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }
    }

    public static void MaiorMenor() {
        int n1, n2;
        System.out.println("Digite um número: ");
        n1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        n2 = scanner.nextInt();
        if (n1 > n2) {
            System.out.println("O numero " + n1 + " é maior que " + n2);
        } else if (n1 < n2) {
            System.out.println("o numero " + n1 + " é menor que " + n2);
        } else {
            System.out.println("Os números são iguais.");
        }

    }

    public static void Voto() {
        int idade;
        System.out.println("Digite sua idade");
        idade = scanner.nextInt();
        if (idade < 16) {
            System.out.println("Você ainda não é obrigado a votar");
        } else if (idade >= 16 && idade < 18) {
            System.out.println("Você ja pode votar mas não é obrigatório");
        } else {
            System.out.println("Você é obrigado por lei a votar");
        }

    }

    public static void Imc() {
        double peso, altura;
        System.out.println("Digite seu peso");
        peso = scanner.nextDouble();
        System.out.println("Digite sua altura em metros");
        altura = scanner.nextDouble();
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Você está abaixo do peso");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Você está com o peso normal");
        } else if (imc > 25 && imc <= 29.9) {
            System.out.println("Você está com sobrepeso");
        } else {
            System.out.println("Você está com obesidade");
        }

    }

    public static void AumSal() {
        double salario;
        System.out.println("Digite o seu salário");
        salario = scanner.nextDouble();

        if (salario >= 1500) {
            salario = salario + (salario * 0.2);
            System.out.println("o seu salario atual é " + salario);
        } else if (salario > 1500 && salario <= 2499.99) {
            salario = salario + (salario * 0.15);
            System.out.println("o seu salario atual é de" + salario);

        } else if (salario >= 2500) {
            salario = salario + (salario * 0.1);
            System.out.println("o seu salario atual é " + salario);
        }

    }

    public static void Vali() {

        int dia, mes, ano;
        System.out.println("Digite um dia válido");
        dia = scanner.nextInt();

        if (dia != 0 && dia < 30) {
            System.out.println("Digite um mês");
            mes = scanner.nextInt();
            if (mes != 0 && mes <= 12) {
                System.out.println("Digite um ano");
                ano = scanner.nextInt();
                if (ano !=0 && ano <2030) {

                 System.out.println("O dia digitado foi " +dia + '/' +mes +"/" + ano);
                    
                } else {
                    System.out.println("Digite um ano válido");
                }
                }
                 else{
                    System.out.println("Digite um mes valido");


            };

        }else{
            System.out.println("Digite um dia válido");
        }

    }

    public static void main(String[] args) {
        //ParOuImppar();
        //MaiorMenor();
        //Voto();
        //Imc();
        //AumSal();
        Vali();
    }
}
