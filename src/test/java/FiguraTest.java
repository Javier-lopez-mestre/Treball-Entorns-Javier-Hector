package test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.example.Circulo;
import com.example.Rectangulo;
import com.example.Triangulo;

public class FiguraTest {

    @Test
    void testCalculoAreaCirculo() {
        Circulo circulo = new Circulo(5);
        double expectedArea = Math.PI * 5 * 5;
        assertEquals(expectedArea, circulo.calculoArea(), 0.0001, "El área del círculo no es correcta");
    }

    @Test
    void testCalculoPerimetroCirculo() {
        Circulo circulo = new Circulo(5);
        double expectedPerimetro = 2 * Math.PI * 5;
        assertEquals(expectedPerimetro, circulo.calculoPerimetro(), 0.0001, "El perímetro del círculo no es correcto");
    }

    @Test
    void testCalculoAreaRectangulo() {
        Rectangulo rectangulo = new Rectangulo(4, 6);
        double expectedArea = 4 * 6;
        assertEquals(expectedArea, rectangulo.calculoArea(), 0.0001, "El área del rectángulo no es correcta");
    }

    @Test
    void testCalculoPerimetroRectangulo() {
        Rectangulo rectangulo = new Rectangulo(4, 6);
        double expectedPerimetro = 2 * (4 + 6);
        assertEquals(expectedPerimetro, rectangulo.calculoPerimetro(), 0.0001, "El perímetro del rectángulo no es correcto");
    }

    @Test
    void testCalculoAreaTriangulo() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        double s = (3 + 4 + 5) / 2.0;
        double expectedArea = Math.sqrt(s * (s - 3) * (s - 4) * (s - 5));
        assertEquals(expectedArea, triangulo.calculoArea(), 0.0001, "El área del triángulo no es correcta");
    }

    @Test
    void testCalculoPerimetroTriangulo() {
        Triangulo triangulo = new Triangulo(3, 4, 5);
        double expectedPerimetro = 3 + 4 + 5;
        assertEquals(expectedPerimetro, triangulo.calculoPerimetro(), 0.0001, "El perímetro del triángulo no es correcto");
    }
}