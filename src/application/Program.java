package application;

import java.util.Locale;

import entities.Piramide;
import entities.Poligono;
import entities.Prisma;
import entities.Tronco;

public class Program {

	public static void main(String[] args)  {
		Locale.setDefault(Locale.US);
		
		Prisma p1 =  new Prisma(Poligono.TRIANGULO_EQUILATERO, 8.0, 15.0);
		Piramide p =  new Piramide(Poligono.TRIANGULO_EQUILATERO, 8.0, 15.0);
		System.out.println(p);
		System.out.println("-------------------------------");
		Tronco t = new Tronco(Poligono.HEXAGONO_REGULAR, 18.0, 7.0, 12.0);
		System.out.println(t);
		//Tronco p = new Tronco(Poligono.QUADRADO, 50.0, 48.0, 30.0);
		System.out.println("-------------------------------");
		System.out.println(p1);
		
	}

}
