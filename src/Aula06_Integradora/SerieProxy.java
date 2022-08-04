package Aula06_Integradora;

public class SerieProxy implements iSerie {
    private int qtdViews = 0;

    @Override
    public String getSerie(String nome) {
        Serie serie = new Serie();
        setQtdViews(getQtdViews() + 1);
        if (getQtdViews() <= 5) {
            return serie.getSerie(nome) + " foi assistido " + getQtdViews() + " vezes.";
        } else {
            throw new SerieNaoHabilitadaException("Deu Pobrema! Vc ja viu muitas vezes, va' lavar uma louça!");
        }
    }

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }
}
