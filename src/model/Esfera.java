package model;

public class Esfera extends SolidoRevolucao {
	final double raio;

	public Esfera(double raio) {
		this.raio = raio;
	}

	@Override
	public double areaTotal() {
		return 4 * Math.PI * Math.pow(raio, 2);
	}

	@Override
	public double volume() {
		return 4 * Math.PI * Math.pow(raio, 3) / 3;
	}

	public double getRaio() {
		return raio;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Esfera\n");
		sb.append(String.format("raio = %.4f\n", raio));
		sb.append(String.format("área total = %.4f\n", areaTotal()));
		sb.append(String.format("volume = %.4f\n", volume()));

		return sb.toString();
	}
}
