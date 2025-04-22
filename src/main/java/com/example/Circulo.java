package com.example;

/**
 * La clase Circulo representa una figura geométrica circular.
 * Hereda de la clase Figura y proporciona implementaciones específicas
 * para calcular el área y el perímetro de un círculo.
 */
public class Circulo extends Figura {
    /**
     * Radio del círculo.
     */
    private double raido;

    /**
     * Constructor de la clase Circulo.
     *
     * @param raido El radio del círculo.
     */
    public Circulo(double raido) {
        this.raido = raido;
    }

    /**
     * Calcula el área del círculo.
     *
     * @return El área del círculo.
     */
    @Override
    public double calculoArea() {
        return Math.PI * raido * raido;
    }

    /**
     * Calcula el perímetro del círculo.
     *
     * @return El perímetro del círculo.
     */
    @Override
    public double calculoPerimetro() {
        return 2 * Math.PI * raido;
    }
}
