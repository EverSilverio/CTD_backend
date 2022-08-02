package Aula01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PessoaTest {
    Pessoa p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore(){
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setDataNascimento(LocalDate.of(1981,6,18));

        p2 = new Pessoa("Ana", "Musk");
        p2.setDataNascimento(LocalDate.of(1966,1,10));

        p3 = new Pessoa("Joe", "Sacadas");
        p3.setDataNascimento(LocalDate.of(2010,6,13));

        p4 = new Pessoa("Rob", "Varandas");
        p4.setDataNascimento(LocalDate.of(1976,5,18));

        p5 = new Pessoa("Ted", "Santos");
        p5.setDataNascimento(LocalDate.of(2014,4,18));

        p6 = new Pessoa("Roberto", "Silva");
        p6.setDataNascimento(LocalDate.of(2000,12,18));

        p7 = new Pessoa("Renata", "Gomes");
        p7.setDataNascimento(LocalDate.of(2010,8,18));

        p8 = new Pessoa("Murilo", "Ganda");
        p8.setDataNascimento(LocalDate.of(2015,9,18));

        p9 = new Pessoa("Candido", "Portinari");
        p9.setDataNascimento(LocalDate.of(1975,9,18));

        p10 = new Pessoa("Camila", "Pitanga");
        p10.setDataNascimento(LocalDate.of(2014,5,18));
    }

    @Test
    void imprimirObjetos(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void addColecao() {
        p1.addNomes(p1);
        p2.addNomes(p2);
        p3.addNomes(p3);
        p4.addNomes(p4);
        p5.addNomes(p5);
        p6.addNomes(p6);
        p7.addNomes(p7);
        p8.addNomes(p8);
        p9.addNomes(p9);
        p10.addNomes(p10);

    }
}
