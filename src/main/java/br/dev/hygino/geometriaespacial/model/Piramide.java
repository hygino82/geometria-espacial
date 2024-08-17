package br.dev.hygino.geometriaespacial.model;

public class Piramide extends Poliedro implements DeterminaValoresPiramide {

    public Piramide(double medidaBase, double altura, Poligono poligono) {
        super(medidaBase, altura, poligono);
    }

    @Override
    public double areaTotal() {
        return poligono.area(medidaBase) + areaLateral();
    }

    @Override
    public double areaLateral() {
        return poligono.perimetro(medidaBase) * apotemaPiramide() / 2.0;
    }

    @Override
    public double volume() {
        return poligono.area(medidaBase) * altura / 3.0;
    }

    @Override
    public double apotemaBase() {
        return poligono.apotemaBase(medidaBase);
    }

    @Override
    public double apotemaPiramide() {
        return Math.sqrt(Math.pow(apotemaBase(), 2.0) + Math.pow(altura, 2.0));
    }
}
