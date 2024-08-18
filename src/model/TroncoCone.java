package model;

public class TroncoCone extends SolidoRevolucao {
	private final double raioMaior;
	private final double raioMenor;
	private final double altura;
	private final double geratriz;

	public TroncoCone(double raioMaior, double raioMenor, double altura) {
		this.raioMaior = raioMaior;
		this.raioMenor = raioMenor;
		this.altura = altura;
		this.geratriz = calcularGeratriz();
	}

	private double calcularGeratriz() {
		return Math.sqrt(Math.pow(altura, 2) + Math.pow(raioMaior - raioMenor, 2));
	}

	public double getRaioMaior() {
		return raioMaior;
	}

	public double getRaioMenor() {
		return raioMenor;
	}

	public double getAltura() {
		return altura;
	}

	public double getGeratriz() {
		return geratriz;
	}

	public double areaBaseMaior() {
		return Math.PI * raioMaior * raioMaior;
	}

	public double areaBaseMenor() {
		return Math.PI * raioMenor * raioMenor;
	}

	public double areaLateral() {
		return Math.PI * geratriz * (raioMenor + raioMaior);
	}

	@Override
	public double areaTotal() {
		return areaBaseMaior() + areaBaseMenor() + areaLateral();
	}

	@Override
	public double volume() {
		return Math.PI * altura * (raioMaior * raioMaior + raioMaior * raioMenor + raioMenor * raioMenor) / 3;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Tronco de Cone\n");
		sb.append(String.format("raio maior = %.4f\n", raioMaior));
		sb.append(String.format("raio menor = %.4f\n", raioMenor));
		sb.append(String.format("altura = %.4f\n", altura));
		sb.append(String.format("geratriz = %.4f\n", geratriz));
		sb.append(String.format("área base maior = %.4f\n", areaBaseMaior()));
		sb.append(String.format("área base menor = %.4f\n", areaBaseMenor()));
		sb.append(String.format("área lateral = %.4f\n", areaLateral()));
		sb.append(String.format("área total = %.4f\n", areaTotal()));
		sb.append(String.format("volume = %.4f\n", volume()));

		return sb.toString();
	}
}
