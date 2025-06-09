package entities;

import java.util.Scanner;

public class Teste{
    
    public Scanner sc = new Scanner(System.in);

    public  void positivoOuNegativo(){

        double v1;
        System.out.println("Digite o primiero valor");
        v1 = sc.nextDouble();

        if(v1 > 0){
            System.err.println("O número digitado é positivo");
        }else if(v1 < 0){
            System.err.println("O valor digitado é negativo");

        }
        
    }

    public void parOuImpar(){

        int v1;
        System.out.println("Digite um valor");
        v1 = sc.nextInt();
        if(v1 % 2 == 0){
            System.out.println("O valor é par");

        }else{
            System.out.println("O valor é impar");
        }
        sc.close();



    }

    public void moM(){
        int v1, v2;
        System.out.println("Digite o primeiro valor");
        v1 = sc.nextInt();
        System.out.println("Digite o segundo valor");
        v2 = sc.nextInt();

        if(v1 > v2){
            System.out.println("O primeiro valor é maior que o Segundo valor");
        }else if(v1 < v2){
            System.out.println("O segundo valor é maior");
        }

    }

    public void media(){
        double n1, n2;
        System.out.println("Digite a primeira nota");
        n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        n2 = sc.nextDouble();
        double media = (n1 + n2) /2;
        if(media >= 9){
            System.out.println("Sua media foi A");
        }else if(media >= 7 && media <9){
            System.out.println("Sua media foi B");
        }else if(media >= 5 && media < 7 ){
            System.out.println("Sua media foi C");
        }else{
            System.out.println("Você foi reprovado");
        }
    }

    public void anoBi(){
        int ano;
        System.out.println("Digite o ano");
        ano = sc.nextInt();

        if((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)){
            System.out.println("O ano é bissexto");

        }else{
            System.out.println("não é bissexto");
        }
    }

    public void triVal(){
        double l1, l2, l3;
        System.out.println("Digite os valores dos lados");
        l1 = sc.nextDouble();
        l2 = sc.nextDouble();
        l3 = sc.nextDouble();
        
        if(l1 + l2 > l3 && l1 + l3 > l2 && l2+l3 >l1 ){
            System.out.println("é um triangulo valido");

            if(l1 == l2 && l2 == l3){
                System.out.println("É um triangulo equilatero");
            }else if(l1 == l2 && l2 != l3){
                System.out.println("É um triangulo Isóceles");
            }else{
                System.out.println("É um triangulo Escaleno");
            }

      
        }
        else{
            System.out.println("não é um traingulo valido");
        }

        

        
        
    }
    public void classIdade(){
    int idade;
    System.out.println("Digite sua idade");
    idade = sc.nextInt();
    if(idade <= 12){
        System.out.println("Você é uma criança");
    }else if(idade >12 && idade <=17 ){
        System.out.println("Você é uma adolescente");

    }else if(idade >17 && idade <=59){
        System.out.println("você é um adulto");
    }else{
         System.out.println("Você é um idoso");
    }
    }
    public void Calculodaora(){
        double v1, v2;
        int opcao;
        System.out.println("digite o primeiro valor");
        v1 = sc.nextDouble();
        System.out.println("Digite o segundo valor");
        v2 = sc.nextDouble();
        System.out.printf("Escolha umas das opções \n " +
                          "1. Soma \n " +
                          "2. Subtração \n" +
                          "3. Divisão \n "  +
                          "4. Multiplicação \n"  );
                          opcao = sc.nextInt();

        double soma = v1 + v2;
        double subtração = v1 - v2;
        double divisao = v1 / v2;
        double multiplicacao = v1 * v2;
        
        if (opcao == 1) {
            System.out.println("A soma dos valores é " +soma);
            
        }else if (opcao == 2) {
            System.out.println("A subtração dos valores é " +subtração);
            
        }else if (opcao == 3){
            if (v2 == 0) {
                System.out.println("O valor é impossivel");
                
            }else{
                System.out.println("A divisão é " +divisao);
            }
        }else{
            System.out.println("O produto é " + multiplicacao );
        }

    }

    public void login(){
        String login, senha, loginc , senhac;
        System.out.println("Cadastre seu login");
        login = sc.next();
        System.out.println("Digite sua senha");
        senha = sc.next();
        System.out.println("Digite seu Login");
        loginc = sc.next();
        System.out.println("Digite sua senha");
        senhac = sc.next();

        
        if(!loginc.equals(login)&& !senhac.equals(senha)){
            System.out.println("Credenciais inválidas");
        }else{
            System.out.println("Bem-vindo");
        }

        


    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       


}