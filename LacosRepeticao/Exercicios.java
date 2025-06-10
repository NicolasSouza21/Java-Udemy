package LacosRepeticao;
import java.util.*;

public class Exercicios {

    Scanner sc = new Scanner(System.in);

    public void contagem(){
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        System.out.println("Os números seguintes são \n");


        for (int i = 1; i <= n; System.out.println(i++)) {
            
        }


    }

    public void somaDeNumeros(){
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        int soma =+ n;
        

        while (n != 0 ) {
            
            soma += n;
            System.out.println("Adicione outro");
            n = sc.nextInt();
            


            

        
            
        }
        System.out.println("O valor total é " + soma);



    }

    public void validarSenha(){
        String senha, senhaDigitada;
        System.out.println("Digite sua senha");
        senha = sc.next();
        do {
            System.out.println("Digite sua senha anterior");
            senhaDigitada = sc.next();
            
        } while (!senhaDigitada.equals(senha));
        System.out.println("Bem-vindo!");
    }
    
    public void contarUm(){
     int n = 10;
     for (int i = 0; i <= n; System.out.println(i++)) {
        
     }


    }

    public void tabuada(){
        int n;
        System.out.println("Digite um número \n");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            int mutltiplicacao = i * n;
            System.out.println("\n" + mutltiplicacao + "\n");
            
        }
    }

    public void somarCinco(){
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        int soma = n;

        for (int i = 1; i < 5; i++) {

            
            System.out.println("Digite outro número");
            n = sc.nextInt();
            soma += n;

            
        }System.out.println("A soma deu " + soma);
        


    }

    public void menosUm(){
        int n;
        System.out.println("Digite um número");
        n = sc.nextInt();
        while (n != 0) {
            
            System.out.println(n - 1);
            
            
        }

    }
}
