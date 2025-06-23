package Retangulo;
import java.util.Scanner;

public class RetanguloController {

    Retangulo rg = new Retangulo();
    Scanner sc = new Scanner(System.in);
    public void abrir(){
        System.out.println("Digite a altura do retângulo");
        rg.setAltura(sc.nextDouble());
        System.out.println("Digite o comprimento do retangulo");
        rg.setComprimento(sc.nextDouble());
        System.out.println("A área é " + rg.getArea());
        System.out.println("O perimetro é " + rg.getPerimetro());
        System.out.println("A diagonal é " + rg.getDiagonal());

        
    }



}
