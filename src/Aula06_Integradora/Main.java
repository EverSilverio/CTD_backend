package Aula06_Integradora;

public class Main {

    public static void main(String[] args) {
        iSerie s1 = new SerieProxy();
        iSerie s2 = new SerieProxy();


        s2.getSerie("PeakyBlinders");
        System.out.println(s2.getSerie("PeakyBlinders"));

        s1.getSerie("SOA");
        s1.getSerie("SOA");
        s1.getSerie("SOA");
        s1.getSerie("SOA");
        System.out.println(s1.getSerie("SOA"));



    }
}
