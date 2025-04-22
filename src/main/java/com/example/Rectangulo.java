package com.example;

/**
 * La clase Rectangulo representa un rectángulo y extiende de la clase Figura.
 * Proporciona métodos para calcular el área y el perímetro del rectángulo.
 */
public class Rectangulo extends Figura {
    private double anchura;
    private double altura;

    public Rectangulo(double anchura, double altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    /**
     * Calcula el área del rectángulo.
     *
     * @return El área del rectángulo.
     */   
    @Override
    public double calculoArea() {
        return anchura * altura;
    }

    /**
     * Calcula el perímetro del rectángulo.
     *
     * @return El perímetro del rectángulo.
     */
    @Override
    public double calculoPerimetro() {
        return 2 * (anchura + altura);
    }
    
}
