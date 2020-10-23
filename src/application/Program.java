package application;

import entities.Piramide;
import entities.Poligono;

public class Program {

	public static void main(String[] args)  {
		
		//Prisma p =  new Prisma(Poligono.CIRCULO, 3.0, 15.0);
		Piramide p =  new Piramide(Poligono.HEXAGONO_REGULAR, 3.0, 15.0);

		System.out.println(p.getPoligono());
		System.out.println("Altura: "+p.getAltura());
		System.out.println("Arresta da base: "+ p.getArrestaBase());
		System.out.println("Área da base: "+ p.areaBase());
		System.out.println("Área da lateral: "+ p.areaLateral());
		System.out.println("Área total: "+ p.areaTotal());
		System.out.println("Volume: "+ p.volume());
	}

}
