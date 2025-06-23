package Escola;

public class Aluno {

    private String nome;
    private int idade;

    
    public String getNome() {
        return nome;
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

    public Aluno(){

    }


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    
    

    @Override
     public String toString(){
        return nome +" (" + idade + " anos)";
     }
    
}
