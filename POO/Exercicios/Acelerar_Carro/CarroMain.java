package POO.Exercicios.Acelerar_Carro;

import java.util.Scanner;

public class CarroMain {

    public static void main(String[] args) {

        CarroController cc = new CarroController();
        CarroModelo cm = new CarroModelo();

        Scanner sc = new Scanner(System.in);
        
       System.out.println("Selecione sua opção \n");
       int opcao;

       do {
        
         
        
       
       System.out.println("1. Cadastrar informações \n" +
                            "2. Ver informações \n " +
                            "3. Acelerar \n" +
                            "4. Frear \n " +
                            "5. Sair \n");
        opcao = sc.nextInt();

        if (opcao == 3) {
            cc.acelerar();
            System.out.println("Sua velocidade é " + cm.velocidade);

            
        }else if (opcao == 2){
            cc.mostrarInfo();


        }else if (opcao == 1) {
            cc.cadastrarInfo();
            
        }else if (opcao == 4){
            cc.frear();
            System.out.println("Sua velocidade é " + cm.velocidade);
        }


    }while (opcao != 5);
    
}
}
