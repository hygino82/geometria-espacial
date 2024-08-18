package model;

public enum Poligono {
	TRIANGULO_EQUILATERO {
		@Override
		public int numeroLados() {
			return 3;
		}

		@Override
		public double area(double medidaLado) {
			return Math.pow(medidaLado, 2) * Math.sqrt(3) / 4;
		}
	},
	QUADRADO {
		@Override
		public int numeroLados() {
			return 4;
		}

		@Override
		public double area(double medidaLado) {
			return Math.pow(medidaLado, 2);
		}
	},
	HEXAGONO_REGULAR {
		@Override
		public int numeroLados() {
			return 6;
		}

		@Override
		public double area(double medidaLado) {
			return 3 * Math.pow(medidaLado, 2) * Math.sqrt(3) / 2;
		}
	},;

	public abstract int numeroLados();

	public double perimetro(double medidaLado) {
		return medidaLado * numeroLados();
	}

	public abstract double area(double medidaLado);
}
