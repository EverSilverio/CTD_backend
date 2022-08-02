package Aula01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QuadradoTest {

    Quadrado q1, q2;

    @BeforeEach
    void doBefore(){
        q1 = new Quadrado(4.0);
        q2 = new Quadrado(3.5);
    }

    @Test
    void calculaPerimetroQuadrado(){
        System.out.println(q1.calcularPerimetro());
        System.out.println(q2.calcularPerimetro());
    }

}