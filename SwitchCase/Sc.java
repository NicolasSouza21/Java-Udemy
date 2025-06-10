package SwitchCase;
import java.util.Scanner;

public class Sc {

    public Scanner sc = new Scanner(System.in);

    public void cadastro(){
        String opcao;
        System.out.println("Selecione uma opção \n" +
                            "1 - Cadastrar usuário \n" +
                            "2 - Deletar usuario \n" +
                            "3 - Atualizar Dados \n" +
                            "4 - Sair");
        opcao = sc.next();

        switch (opcao) {
            case "1":
            System.out.println(" Você cadastrou um usuário");
                break;
            case "2":
            System.out.println("Você deletou um usuário");
            break;
            case "3":
            System.out.println("Você deletou um usuário");
            break;
            case "4":
            System.out.println("Adeus");
            break;
        
            default:
            System.out.println("Valor desconhecido");
                break;
        }


    }

    public void diaSemana(){
        System.out.println("Digite um número de 1 a 7 para mostrar o dia da semana");
        int opcao;
        opcao = sc.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("Domingo");
                
                break;
            case 2:
            System.out.println("Segunda-feira");
            break;
            case 3:
            System.out.println("Terça-Feira");
            break;
            case 4:
            System.out.println("Quarte-feira");
            break;
            case 5:
            System.out.println("Quinta-feira");
            break;
            case 6:
            System.out.println("Sexta-feira");
            break;
            case 7:
            System.out.println("Sábado");
        
            default:
            System.out.println("Valor desconhecido");
                break;
        }
    }

    public void Calculadora(){
        int operacao;
        double v1, v2;
        System.out.println("Digite o primeiro valor");
        v1 = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        v2 = sc.nextDouble();
        System.out.println("Selecione a operação \n" +
                            "1 - Adição \n" +
                            "2 - Subtração \n" +
                            "3 - Multiplicação \n" +
                            "4 - Divisão");
        operacao = sc.nextInt();

        switch (operacao) {
            case 1:
            double soma = v1 +v2;
            System.out.println("A soma dos valores é " + soma);
            
                
                break;

            case 2:
            double sub = v1 - v2;
            System.out.println("A subtração dos valores é " + sub);
            break;
            case 3:
            double divisao = v1 / v2;
            if (v2 == 0) {
                System.out.println("não é possivel realizar a conta");
                
            }else{
                System.out.println("O resultado da divisão é " + divisao);
            }
            break;
            case 4:
            double mult = v1 *v2;
            System.out.println("O produto da multiplicação é " +mult);

        
            default:
                break;
        }

    }

    



}