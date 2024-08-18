package model;

public final class Cone extends SolidoRevolucao {
	private final double raio;
	private final double altura;
	private final double geratriz;

	public Cone(double raio, double altura) {
		this.raio = raio;
		this.altura = altura;
		this.geratriz = calcularGeratriz();
	}

	private double calcularGeratriz() {
		return Math.sqrt(Math.pow(raio, 2) + Math.pow(altura, 2));
	}

	public double getRaio() {
		return raio;
	}

	public double getAltura() {
		return altura;
	}

	public double getGeratriz() {
		return geratriz;
	}

	@Override
	public double areaTotal() {
		return areaBase() + areaLateral();
	}

	public double areaBase() {
		return Math.PI * Math.pow(raio, 2);
	}

	public double areaLateral() {
		return raio * geratriz * Math.PI;
	}

	@Override
	public double volume() {
		return areaBase() * altura / 3;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Cone\n");
		sb.append(String.format("raio = %.4f\n", raio));
		sb.append(String.format("altura = %.4f\n", altura));
		sb.append(String.format("geratriz = %.4f\n", geratriz));
		sb.append(String.format("área base = %.4f\n", areaBase()));
		sb.append(String.format("área lateral = %.4f\n", areaLateral()));
		sb.append(String.format("área total = %.4f\n", areaTotal()));
		sb.append(String.format("volume = %.4f\n", volume()));

		return sb.toString();
	}
}
