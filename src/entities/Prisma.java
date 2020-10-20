package entities;

public class Prisma extends Poliedro implements GerarValores {
	public Area area;

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
			areas = area.area(getPoligono(), getArrestaBase());
		} else {
			areas = n * getArrestaBase() * getAltura();
		}
		return areas;
	}

	@Override
	public Double areaBase() {
		// Poliedro p = new Prisma(getPoligono(), super.getAltura(),
		// super.getArrestaBase());
		
		return 0.0;
		
		Double areas = area.area(super.getPoligono(), super.getArrestaBase());
		if (areas != null) {
			return areas;
		} 
		return 0.0;
			
		
	}

	@Override
	public Double areaTotal() {

		return 2 * areaBase() + areaLateral();
	}

}
