package POO.RelacaoObjeto.Biblioteca;

import java.util.Scanner;

public class BibliotecaController {

    Scanner sc = new Scanner(System.in);
    Livro livro = null;
    Autor autor;

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
                    livro = criarLivro();

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

    public Livro criarLivro() {


        System.out.println("Digite o nome do livro:");
    String titulo = sc.nextLine();

    System.out.println("Digite o ano da publicação:");
    int ano = sc.nextInt();
    sc.nextLine();  // Consumir a quebra de linha

    System.out.println("Digite o nome do autor:");
    String nomeAutor = sc.nextLine();

    System.out.println("Digite a nacionalidade do autor:");
    String nacionalidade = sc.nextLine();

    Autor autor = new Autor(nacionalidade, nomeAutor);
    Livro livro = new Livro(titulo, ano, autor);

    return livro;

    }

    public void mostrarDetalhes(Livro livro) {

        System.out.println("O titulo do livro é " + livro.getTitulo());
        System.out.println("\n O ano de publicação é " + livro.getAnoPublicacao());
        System.out.println("\n O autor que escreveu o livro é " + livro.getAutor());

    }

}
