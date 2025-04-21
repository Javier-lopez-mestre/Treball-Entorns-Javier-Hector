package com.example;
import com.example.Figura;

public class Circulo extends Figura {
    private double raido;

    public Circulo(double raido) {
        this.raido = raido;
    }

    @Override
    public double calculoArea() {
        return Math.PI * raido * raido;
    }

    @Override
    public double calculoPerimetro() {
        return 2 * Math.PI * raido;
    }
    
}
