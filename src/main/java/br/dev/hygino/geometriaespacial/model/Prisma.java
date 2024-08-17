package br.dev.hygino.geometriaespacial.model;

public class Prisma extends Poliedro {

    public Prisma(double medidaBase, double altura, Poligono poligono) {
        super(medidaBase, altura, poligono);
    }

    @Override
    public double areaTotal() {
        return areaLateral() + 2 * poligono.area(medidaBase);
    }

    @Override
    public double volume() {
        return this.poligono.area(medidaBase) * altura;
    }

    @Override
    public double areaLateral() {
        return (!(poligono instanceof Poligono))
                ? poligono.ladosBase() * medidaBase * altura
                : poligono.perimetro(medidaBase) * altura;
    }
}
