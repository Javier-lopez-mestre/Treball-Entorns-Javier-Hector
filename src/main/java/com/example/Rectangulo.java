package com.example;
import com.example.Figura;

public class Rectangulo extends Figura {
    private double anchura;
    private double altura;

    public Rectangulo(double anchura, double altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    @Override
    public double calculoArea() {
        return anchura * altura;
    }

    @Override
    public double calculoPerimetro() {
        return 2 * (anchura + altura);
    }
    
}
