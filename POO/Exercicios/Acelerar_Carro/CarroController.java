package POO.Exercicios.Acelerar_Carro;

import java.util.Scanner;

public class CarroController {

    Scanner sc = new Scanner(System.in);
    CarroModelo cm;

    
    public CarroController(CarroModelo cm) {
        this.cm = cm;
    }

    public void acelerar(int km) {
        cm.velocidade += km;
    }

    public void frear(int km) {
        cm.velocidade -= km;
        if (cm.velocidade < 0) {
            cm.velocidade = 0;
        }
    }

    public void cadastrarInfo() {
        System.out.println("Crie seu carro \n");

        System.out.print("Digite o modelo do seu carro: ");
        cm.modelo = sc.next();

        System.out.print("Digite a marca do seu carro: ");
        cm.marca = sc.next();

        System.out.print("Digite o ano do seu carro: ");
        cm.ano = sc.nextInt();
    }

    public void mostrarInfo() {
        System.out.println("Modelo: " + cm.modelo);
        System.out.println("Marca: " + cm.marca);
        System.out.println("Ano: " + cm.ano);
        System.out.println("Velocidade atual: " + cm.velocidade + " km/h");
    }
}
