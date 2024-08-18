package model;

public final class Prisma extends Poliedro {

	public Prisma(double arestaBase1, double altura, Poligono poligono) {
		super(arestaBase1, altura, poligono);
	}

	@Override
	public double areaLateral() {
		return altura * poligono.perimetro(arestaBase1);
	}

	@Override
	public double areaBase1() {
		return poligono.area(arestaBase1);
	}

	@Override
	public double areaTotal() {
		return 2 * arestaBase1 + areaLateral();
	}

	@Override
	public double volume() {
		return areaBase1() * altura;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Prisma\n");
		sb.append(String.format("altura = %.4f\n", altura));
		sb.append(String.format("arresta base = %.4f\n", arestaBase1));
		sb.append(String.format("área base = %.4f\n", areaBase1()));
		sb.append(String.format("área lateral = %.4f\n", areaLateral()));
		sb.append(String.format("área total = %.4f\n", areaTotal()));
		sb.append(String.format("volume = %.4f\n", volume()));

		return sb.toString();
	}
}
