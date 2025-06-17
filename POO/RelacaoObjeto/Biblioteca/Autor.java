package POO.RelacaoObjeto.Biblioteca;

public class Autor {

    private String nacionalidade;
    private String nome;

    
    public String getNacionalidade() {
        return nacionalidade;
    }
    public Autor(String nacionalidade, String nome) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
public String toString() {
    return nome + " (" + nacionalidade + ")";
}
    
}
