package com.example;
// Clase cercle
public class Circulo extends Figura {
    private double raido;

    public Circulo(double raido) {
        this.raido = raido;
    }
    // Funció calcul area
    @Override
    public double calculoArea() {
        return Math.PI * raido * raido;
    }
    // Funció calcul perimetre
    @Override
    public double calculoPerimetro() {
        return 2 * Math.PI * raido;
    }
    
}
