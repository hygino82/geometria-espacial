package model;

public final class Cilindro extends SolidoRevolucao {
	private final double raio;
	private final double altura;

	public Cilindro(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
	}

	public double getRaio() {
		return raio;
	}

	public double getAltura() {
		return altura;
	}

	public double areaLateral() {
		return 2 * raio * Math.PI * altura;
	}

	public double areaBase() {
		return raio * raio * Math.PI;
	}

	@Override
	public double areaTotal() {
		return 2 * areaBase() + areaLateral();
	}

	@Override
	public double volume() {
		return areaBase() * altura;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Cilindro\n");
		sb.append(String.format("altura = %.4f\n", altura));
		sb.append(String.format("raio = %.4f\n", raio));
		sb.append(String.format("área base = %.4f\n", areaBase()));
		sb.append(String.format("área lateral = %.4f\n", areaLateral()));
		sb.append(String.format("área total = %.4f\n", areaTotal()));
		sb.append(String.format("volume = %.4f\n", volume()));

		return sb.toString();
	}
}
