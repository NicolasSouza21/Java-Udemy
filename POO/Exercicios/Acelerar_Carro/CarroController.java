package POO.Exercicios.Acelerar_Carro;

import java.util.Scanner;

public class CarroController {

    Scanner sc = new Scanner(System.in);
    CarroModelo cm = new CarroModelo();

    public void acelerar(){
        cm.velocidade += 30;

    }

    public void frear(){
        cm.velocidade -= 10;
    }

    public void cadastrarInfo(){
        System.out.println("Crie sue carro \n");
        System.out.println("Digite o modelo do seu carro");
        cm.modelo = sc.next();
        System.out.println("Digite a marca do seu carro");
        cm.marca = sc.next();
        System.out.println("Digite o ano do seu carro");
        cm.ano = sc.nextInt();

    }

    public void mostrarInfo(){
        System.out.println("O modelo do seu carro é " + cm.modelo);
        System.out.println("A marca do seu carro é " + cm.marca);
        System.out.println("O ano do seu carro é " + cm.ano);
        
    }
    
}
