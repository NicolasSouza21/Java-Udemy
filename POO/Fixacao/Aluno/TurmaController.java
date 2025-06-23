package Aluno;

import java.util.Scanner;

public class TurmaController {

    public TurmaModel turma = new TurmaModel();
    Scanner sc = new Scanner(System.in);

    public void abrir() {
        int op;

        do {

            System.out.println("Seja bem-vindo digite a opção desejada \n " +
                    "1. Cadastrar turma \n " +
                    "2. Ver detalhes \n " +
                    "3. Sair ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    cadastrarTurma();

                    break;

                case 2:
                    if (turma != null) {
                        mostrarDetalhes();

                    } else {
                        System.out.println("cadastre uma turma antes");
                    }
                    break;
                case 3:
                    System.out.println("Adeus, fim do programa");

                default:
                    break;
            }

        } while (op != 3);

    }

    public void cadastrarTurma() {

        System.out.println("Digite o nome da turma");
        String nomeTurma = sc.next();
        turma.setNomeTurma(nomeTurma);

        System.out.println("Digite o ano da turma");
        int ano = sc.nextInt();
        turma.setAno(ano);

        AlunoModel aluno1 = new AlunoModel();
        System.out.println("Digite o nome do primeiro aluno ");
        aluno1.setNome(sc.next());

        System.out.println("Digite a idade");
        aluno1.setIdade(sc.nextInt());

        this.turma.setAluno1(aluno1);


        // aluno 2

        AlunoModel aluno2 = new AlunoModel();
        System.out.println("Digite o nome do segundo aluno");
        aluno2.setNome(sc.next());

        System.out.println("Digite a idade ");
        aluno2.setIdade(sc.nextInt());

        this.turma.setAluno2(aluno2);


        

    }

    public void mostrarDetalhes() {
        System.out.println("O nome da turma é " + turma.getNomeTurma());
        System.out.println("o ano da turma é " + turma.getAno());
        System.out.println("O primeiro aluno é " + turma.getAluno1().getNome());
        System.out.println("O segundo aluno é " + turma.getAluno2().getNome());
    }

}
