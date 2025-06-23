package Escola;

public class Turma {

    private String nomeTurma;
    private int ano;
    private Aluno aluno1;
    private Aluno aluno2;


    public Turma(){
        
    }

    public Turma(String nomeTurma, int ano, Aluno aluno1, Aluno aluno2) {
        this.nomeTurma = nomeTurma;
        this.ano = ano;
        this.aluno1 = aluno1;
        this.aluno2 = aluno2;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }
    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public Aluno getAluno1() {
        return aluno1;
    }
    public void setAluno1(Aluno aluno1) {
        this.aluno1 = aluno1;
    }
    public Aluno getAluno2() {
        return aluno2;
    }
    public void setAluno2(Aluno aluno2) {
        this.aluno2 = aluno2;
    }

    public void mostrarDetalhes(){

        
            System.out.println("Turma: " + nomeTurma + " Ano: " + ano + "º");
            
      
        if (aluno1 != null && aluno2 != null) {
            System.out.println("Aluno 1: " + aluno1 + "\n");
            System.out.println("Aluno 2: " +aluno2 + "\n");
            
        }else{
            System.out.println("Cadastre um aluno primeiro");
        }
    }



    
}
