package Aula01;

public class Circulo implements Figura{

    private Double raio;

    @Override
    public Double calcularPerimetro() {
        return raio * 2 * Math.PI;
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
}
