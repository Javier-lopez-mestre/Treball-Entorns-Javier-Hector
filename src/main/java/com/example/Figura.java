package com.example;

/**
 * La clase Figura sirve como una clase abstracta para figuras geométricas.
 * Proporciona un esquema para calcular el área y el perímetro de una figura.
 * Las subclases (Circulo, Rectangulo y Triangulo) deben implementar los métodos para proporcionar cálculos específicos.
 */
public abstract class Figura {
    public abstract double calculoArea();
    public abstract double calculoPerimetro();
}