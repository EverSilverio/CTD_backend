package Aula01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTest {

    Circulo c1, c2;

    @BeforeEach
    void doBefore(){
        c1 = new Circulo(4.0);
        c2 = new Circulo(3.0);
    }

    @Test
    void calculaPerimetroCirculo() {
        System.out.println(c1.calcularPerimetro());
        System.out.println(c2.calcularPerimetro());
    }

}