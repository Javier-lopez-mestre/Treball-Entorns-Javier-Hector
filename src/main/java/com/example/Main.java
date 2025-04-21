package com.example;

import main.java.com.Rectangulo;
import main.java.com.example.Circulo;
import main.java.com.example.Figura;
import main.java.com.example.Triangulo;

public class Main {
    public static void main(String[] args) {
        // Instancias objetos
        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        Figura triangulo = new Triangulo(3, 4, 5);

        // Resultados
        System.out.println("Área del Círculo: " + circulo.calculoArea());
        System.out.println("Perímetro del Círculo: " + circulo.calculoPerimetro());

        System.out.println("Área del Rectángulo: " + rectangulo.calculoArea());
        System.out.println("Perímetro del Rectángulo: " + rectangulo.calculoPerimetro());

        System.out.println("Área del Triángulo: " + triangulo.calculoArea());
        System.out.println("Perímetro del Triángulo: " + triangulo.calculoPerimetro());

    }
}
