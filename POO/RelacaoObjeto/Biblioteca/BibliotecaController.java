package POO.RelacaoObjeto.Biblioteca;

import java.util.Scanner;

public class BibliotecaController {

    Scanner sc = new Scanner(System.in);
    Livro livro = null;

    public void abrir() {
        int op;

        
        do {

        System.out.println("Você deseja qual opção \n" +
                "1.Cadastrar Livro \n" +
                "2.Ver detalhes do livro \n" +
                "3. Sair \n");
        op = sc.nextInt();
        sc.nextLine();

       

            switch (op) {


                case 1:
                    livro = criarLivro(null, op, null, null);

                    break;

                case 2:
                    if (livro != null) {
                        mostrarDetalhes(livro);

                    } else {
                        System.out.println("Cadastre um livro primeiro");
                    }

                    break;
                case 3:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Valor inválido");
                    break;
            }
        } while (op != 3);
    }

    public Livro criarLivro(String titulo, int anoPublicacao, String nome, String nacionalidade) {

        Autor autor = new Autor(nacionalidade, nome);

        Livro livro = new Livro(titulo, anoPublicacao, autor);

        System.out.println("Digite o nome do livro");
        livro.setTitulo(sc.next());
        System.out.println("Digite o  ano da publicação do livro ");
        livro.setAnoPublicacao(sc.nextInt());
        System.out.println("Digite o nome do autor");
        autor.setNome(sc.next());
        System.out.println("Digite a nacionalidade do autor");
        autor.setNacionalidade(sc.next());

        return livro;

    }

    public void mostrarDetalhes(Livro livro) {

        System.out.println("O titulo do livro é " + livro.getTitulo());
        System.out.println("\n O ano de publicação é " + livro.getAnoPublicacao());
        System.out.println("\n O autor que escreveu o livro é " + livro.getAutor());

    }

}
