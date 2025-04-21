package com.example;
//Clase triangle
public class Triangulo extends Figura {
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }


    // Funció calcul area

    @Override
    public double calculoArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    // Funció calcul perimetre

    @Override
    public double calculoPerimetro() {
        return lado1 + lado2 + lado3;
    }
    
}
