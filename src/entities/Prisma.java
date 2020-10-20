package entities;

public class Prisma extends Poliedro implements GerarValores, Area {

	public Prisma(Poligono poligono, Double altura, Double arrestaBase) {
		super(poligono, altura, arrestaBase);
	}

	@Override
	public Double volume() {
		return areaBase() * super.getAltura();
	}

	@Override
	public Double areaLateral() {
		int n = 1;
		double areas;
		switch (super.getPoligono()) {
		case QUADRADO:
			n = 4;
			break;
		case TRIANGULO_EQUILATERO:
			n = 3;
			break;
		case HEXAGONO_REGULAR:
			n = 6;
			break;
		default:
			return null;
		}

		if (getPoligono() == Poligono.CIRCULO) {
			areas = area(getPoligono(), getArrestaBase());
		} else {
			areas = n * getArrestaBase() * getAltura();
		}
		return areas;
	}

	@Override
	public Double areaBase() {
		double areas = area(super.getPoligono(), super.getArrestaBase());
		return areas;

	}

	@Override
	public Double areaTotal() {

		return 2 * areaBase() + areaLateral();
	}

}
