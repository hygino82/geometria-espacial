package application;

import java.util.Locale;

import model.Cone;
import model.Esfera;
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
	}
}
