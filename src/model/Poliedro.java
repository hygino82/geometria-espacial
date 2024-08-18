package model;

public abstract class Poliedro extends SolidoGeometrico {

	protected final double arestaBase1;
	protected final double altura;
	protected final Poligono poligono;

	public Poliedro(double arestaBase1, double altura, Poligono poligono) {
		this.arestaBase1 = arestaBase1;
		this.altura = altura;
		this.poligono = poligono;
	}

	public final double getArestaBase1() {
		return arestaBase1;
	}

	public final double getAltura() {
		return altura;
	}

	public final Poligono getPoligono() {
		return poligono;
	}

	public abstract double areaLateral();

	public abstract double areaBase1();
}
