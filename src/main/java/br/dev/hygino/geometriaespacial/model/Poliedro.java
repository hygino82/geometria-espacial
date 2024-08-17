package br.dev.hygino.geometriaespacial.model;

public abstract class Poliedro implements CalcularValores {

    protected double medidaBase;
    protected double altura;
    protected Poligono poligono;

    public Poliedro(double medidaBase, double altura, Poligono base) {
        this.medidaBase = medidaBase;
        this.altura = altura;
        this.poligono = base;
    }

    public double getMedidaBase() {
        return medidaBase;
    }

    public void setMedidaBase(double medidaBase) {
        this.medidaBase = medidaBase;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Poligono getBase() {
        return poligono;
    }

    public void setBase(Poligono base) {
        this.poligono = base;
    }
}
