package POO.Exercicios.Acelerar_Carro;

import java.util.Scanner;

public class CarroMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CarroModelo cm = new CarroModelo();         // Criado uma única instância
        CarroController cc = new CarroController(cm); // Passada para a controller

        int opcao;

        do {
            System.out.println("\nSelecione sua opção:");
            System.out.println("1. Cadastrar informações");
            System.out.println("2. Ver informações");
            System.out.println("3. Acelerar");
            System.out.println("4. Frear");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    cc.cadastrarInfo();
                    break;
                case 2:
                    cc.mostrarInfo();
                    break;
                case 3:
                    cc.acelerar(30);
                    System.out.println("Velocidade atual: " + cm.velocidade + " km/h");
                    break;
                case 4:
                    cc.frear(10); 
                    System.out.println("Velocidade atual: " + cm.velocidade + " km/h");
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        sc.close();
    }
}
