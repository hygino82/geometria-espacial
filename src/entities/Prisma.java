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
		double areas = 0;
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
			areas = 2 * Math.PI * getAltura();
		}

		if (getPoligono() != Poligono.CIRCULO) {
			areas = getArrestaBase() * getAltura() * n;
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
