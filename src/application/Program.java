package application;

import java.util.Locale;

import model.Cilindro;
import model.Cone;
import model.Esfera;
import model.Poligono;
import model.Prisma;
import model.SolidoGeometrico;
import model.TroncoCone;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		SolidoGeometrico esfera = new Esfera(10.0);
		System.out.println(esfera);

		SolidoGeometrico cone = new Cone(8.0, 6.0);
		System.out.println(cone);

		SolidoGeometrico tronco = new TroncoCone(10.0, 6.0, 3.0);
		System.out.println(tronco);

		SolidoGeometrico prisma = new Prisma(10.0, 6.0, Poligono.QUADRADO);
		System.out.println(prisma);

		SolidoGeometrico cilindro = new Cilindro(10.0, 6.0);
		System.out.println(cilindro);
	}
}
