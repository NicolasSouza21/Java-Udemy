package Aluno;

public class TurmaModel {

    private String nomeTurma;
    private int ano;
    AlunoModel aluno1;
    AlunoModel aluno2;

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

    public AlunoModel getAluno1() {
        return aluno1;
    }

    public void setAluno1(AlunoModel aluno1) {
        this.aluno1 = aluno1;
    }

    public AlunoModel getAluno2() {
        return aluno2;
    }

    public void setAluno2(AlunoModel aluno2) {
        this.aluno2 = aluno2;
    }

}
