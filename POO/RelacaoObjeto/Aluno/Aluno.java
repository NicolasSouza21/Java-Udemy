public class Aluno {

    private String nome;
    private int idade;
    Curso curso;



    public String getNome() {
        return nome;

    }
    public Aluno(String nome, int idade, Curso curso) {
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = new Curso(nome, idade);;
    }
    
    
    
}
