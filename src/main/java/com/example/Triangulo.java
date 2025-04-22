package com.example;

/**
 * La clase Triangulo representa un triángulo que extiende de la clase Figura.
 * Proporciona métodos para calcular el área y el perímetro del triángulo.
 */
public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    /**
     * Calcula el área del triángulo utilizando la fórmula de Herón.
     *
     * @return El área del triángulo.
     */
    
    @Override
    public double calculoArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    /**
     * Calcula el perímetro del triángulo.
     *
     * @return El perímetro del triángulo.
     */

    @Override
    public double calculoPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
}
