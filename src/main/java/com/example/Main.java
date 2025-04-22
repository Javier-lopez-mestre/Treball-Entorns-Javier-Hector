package com.example;

/**
 * Clase principal que contiene el método main para ejecutar el programa.
 * 
 * En este programa se crean instancias de diferentes figuras geométricas
 * (Círculo, Rectángulo y Triángulo) y se calculan sus áreas y perímetros.
 * Los resultados se imprimen en la consola.
 * 
 * Figuras utilizadas:
 * - Círculo: Se calcula el área y el perímetro a partir de su radio.
 * - Rectángulo: Se calcula el área y el perímetro a partir de su base y altura.
 * - Triángulo: Se calcula el área y el perímetro a partir de sus tres lados.
 */
public class Main {
    public static void main(String[] args) {
        /**
         * Crea instancias de las figuras geométricas.
         * - Círculo con radio 5
         * - Rectángulo con base 4 y altura 6
         * - Triángulo con lados 3, 4 y 5
         */
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        Figura triangulo = new Triangulo(3, 4, 5);

        /**
         * Calcula y muestra el área y el perímetro de cada figura.
         * Se utilizan los métodos calculoArea() y calculoPerimetro() de cada figura.
         * Los resultados se imprimen en la consola.
         */
        System.out.println("Área del Círculo: " + circulo.calculoArea());
        System.out.println("Perímetro del Círculo: " + circulo.calculoPerimetro());

        System.out.println("Área del Rectángulo: " + rectangulo.calculoArea());
        System.out.println("Perímetro del Rectángulo: " + rectangulo.calculoPerimetro());

        System.out.println("Área del Triángulo: " + triangulo.calculoArea());
        System.out.println("Perímetro del Triángulo: " + triangulo.calculoPerimetro());

    }
}
