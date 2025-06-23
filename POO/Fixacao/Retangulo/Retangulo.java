package Retangulo;
public class Retangulo {

    public double altura, comprimento;

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getArea(){
        return altura * comprimento;

    }

    public double getPerimetro(){
        return (2 *altura) + (2* comprimento);
    }

    public double getDiagonal(){
        return Math.sqrt((altura * altura ) + (comprimento * comprimento));
    }

    
}
