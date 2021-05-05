package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Piramide;
import entities.Poligono;
import entities.Prisma;
import entities.Tronco;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char tipo;

		do {
			System.out.println("Escolha um tipo de polígono");
			System.out.println("1 - Prisma");
			System.out.println("2 - Pirâmide");
			System.out.println("3 - Tronco");
			System.out.println("4 - Sair do programa");
			tipo = sc.nextLine().charAt(0);
		} while (tipo < 1 && tipo > 4);

		char baseTipo;

		do {
			System.out.println("\nTipo de base");
			System.out.println("1 - Círculo");
			System.out.println("2 - Quadrado");
			System.out.println("3 - Triângulo equilátero");
			System.out.println("4 - Hexágono regular");
			baseTipo = sc.nextLine().charAt(0);
		} while (baseTipo < 1 && baseTipo > 4);
		
		Poligono poligono;
		
		switch(baseTipo) {
		case 2: poligono=Poligono.QUADRADO; break;
		case 3: poligono=Poligono.TRIANGULO_EQUILATERO; break;
		case 4: poligono=Poligono.HEXAGONO_REGULAR; break;
		default: poligono=Poligono.CIRCULO;
		}
		
		switch(tipo){
		case 1:Poliedro pol=new Prisma(poligono,altura,arrestaBase);
		}
		/*
		 * Prisma p1 = new Prisma(Poligono.TRIANGULO_EQUILATERO, 8.0, 15.0); Piramide p
		 * = new Piramide(Poligono.TRIANGULO_EQUILATERO, 8.0, 15.0);
		 * System.out.println(p); System.out.println("-------------------------------");
		 * Tronco t = new Tronco(Poligono.HEXAGONO_REGULAR, 18.0, 7.0, 12.0);
		 * System.out.println(t); // Tronco p = new Tronco(Poligono.QUADRADO, 50.0,
		 * 48.0, 30.0); System.out.println("-------------------------------");
		 * System.out.println(p1);
		 */

		sc.close();

	}

}
