package Aula01;

public class Quadrado implements Figura{
    private Double lado;


    @Override
    public Double calcularPerimetro() {
        return lado * 4;
    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }
}
