package Escola;

import java.util.Scanner;

public class EscolaController {
    Turma[] turmas = new Turma[3];
    Scanner sc = new Scanner(System.in);

    public void abrir(){
        int op;
        do {
            System.out.println("Selecione a opção desejada \n " +
                                "1. Cadastrar turmas \n" +
                                "2. Mostrar Turmas \n" +
                                "3. Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                cadastrarTurmas();
                    
                    break;
                case 2:
                if (turmas != null) {
                    mostrarTurmas();
                    
                }else{
                    System.out.println("Cadastre uma turma primeiro");
                }
                break;
                case 3:
                System.out.println("Adeus");
            
                default:
                    break;
            }
            
        } while (op !=3);
    }
    
    public void cadastrarTurmas(){
        for (int i = 0; i < turmas.length; i++) {
            System.out.println("\n Cadastro de tumras" + (1 + i));

            turmas[i] = new Turma();

            System.out.println("Digite o nome da turma ");
            String nome = sc.nextLine();
            turmas[i].setNomeTurma(nome);

            System.out.println("Digite o ano da turma ");
            int ano = sc.nextInt();
            turmas[i].setAno(ano);

            System.out.println("Cadastro do primeiro aluno");
            Aluno aluno1 = criarAluno();
            turmas[i].setAluno1(aluno1);

            System.out.println("Cadastro do segundo aluno");
            Aluno aluno2 = criarAluno();
            turmas[i].setAluno2(aluno2);


            
        }

       
    }

    public void mostrarTurmas(){
        for (int i = 0; i < turmas.length; i++) {
            if (turmas[i] != null) {
                System.out.println("\n Mostrar detalhes da turma" + (i + 1));
                turmas[i].mostrarDetalhes();
                
            }else{
                System.out.println("Cadastre uma turma primeiro");
            }
            
        }
            
    }

    public Aluno criarAluno(){
        System.out.println("Digite o nome do aluno");
        String nome = sc.nextLine();

        System.out.println("Digite a idade do aluno ");
        int  idade = sc.nextInt();

        return new Aluno(nome, idade);

    }
}
