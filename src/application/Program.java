package application;

import entities.Poligono;
import entities.Prisma;

public class Program {

	public static void main(String[] args)  {
		
		Prisma p =  new Prisma(Poligono.QUADRADO, 3.0, 5.0);
		System.out.println(p.getPoligono());
		System.out.println(p.getAltura());
		System.out.println(p.getArrestaBase());
		System.out.println("Área da base: "+ p.areaBase());
		System.out.println("Área da lateral: "+ p.areaLateral());
		System.out.println("Área total: "+ p.areaTotal());
		System.out.println("Volume: "+ p.volume());
	}

}
