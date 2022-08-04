package Aula06_Integradora;

public class Serie implements iSerie {

    @Override
    public String getSerie(String nome) {
        return "www." + nome + ".com";
    }
}


