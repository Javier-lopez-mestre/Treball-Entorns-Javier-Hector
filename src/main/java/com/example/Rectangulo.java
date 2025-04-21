package com.example;
// Clase rectangle

public class Rectangulo extends Figura {
    private double anchura;
    private double altura;

    public Rectangulo(double anchura, double altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    // Funció calcul area    
    @Override
    public double calculoArea() {
        return anchura * altura;
    }

    // Funció calcul perimetre
    @Override
    public double calculoPerimetro() {
        return 2 * (anchura + altura);
    }
    
}
