import java.util.Scanner;

public class AlunoController {

    Scanner sc = new Scanner(System.in);

    Aluno aluno = null;
    Curso curso;

    public void abrir() {

        int op;
        

        do {

            System.out.println("O que você deseja fazer \n");
            
            System.out.println("1.Cadastrar Aluno \n " +
                    "2. Mostrar os detalhes \n " +
                    "3. Sair \n");
                    op = sc.nextInt();

                    switch (op) {
                        case 1:
                        cadastrarAluno();
                            
                            break;

                        case 2:
                        if (aluno != null) {
                            mostrarDetalhes();
                            
                        }else{
                            System.out.println("Cadastre um usuário primeiro");
                        }
                        break;
                        case 3:
                        System.out.println("Adeus");
                    
                        default:
                            break;
                    }

        } while (op != 3);

    }

    public Aluno cadastrarAluno() {
        System.out.println("Digite o nome do aluno");
        String alunoNome = sc.next();
        System.out.println("Digite a idade do aluno");
        int alunoIdade = sc.nextInt();
        sc.nextLine();
        System.out.println("Digite o curso do aluno");
        String nomeCurso = sc.next();
        System.out.println("Digite a carga horária");
        int cargaHoraria = sc.nextInt();

        Curso curso = new Curso(nomeCurso, cargaHoraria);

        aluno = new Aluno(alunoNome, alunoIdade, curso);
        return aluno;


    }

    public void mostrarDetalhes() {
        System.out.println("O nome do Aluno é " + aluno.getNome());
        System.out.println("A idade do aluno é " + aluno.getIdade());
        System.out.println("O curso do aluno é " + aluno.getCurso().getNome());
        System.out.println("A carga horária é de " + aluno.getCurso().getCargaHoraria());
    }

}
