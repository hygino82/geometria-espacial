package application;

import java.util.Locale;

import entities.Poligono;
import entities.Prisma;

public class Program {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		
		Prisma p =  new Prisma(Poligono.TRIANGULO_EQUILATERO, 8.0, 15.0);
		//Piramide p =  new Piramide(Poligono.TRIANGULO_EQUILATERO, 8.0, 15.0);
		System.out.println(p);
		//Tronco p = new Tronco(Poligono.QUADRADO, 50.0, 48.0, 30.0);
		//System.out.println(p.getPoligono());
		/*System.out.println("Altura: "+p.getAltura());
		System.out.println("Arresta da primeira base: "+ p.getArrestaBase());
		//System.out.println("Arresta da segunda base: "+ p.getArrestaSegundaBase());
		System.out.println("Área da primeira base: "+ p.areaBase());
		//System.out.println("Área da segunda base: "+ p.areaBase2());
		System.out.println("Área da lateral: "+ p.areaLateral());
		System.out.println("Área total: "+ p.areaTotal());
		System.out.println("Volume: "+ p.volume());*/
	}

}
