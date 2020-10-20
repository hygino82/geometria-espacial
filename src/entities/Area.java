package entities;

public class Area {
	public Double area(Poligono tipoBase, double arresta) {
		if  (tipoBase == Poligono.QUADRADO) {
			return Math.pow(arresta, 2.0);
		}
		else if (tipoBase  == Poligono.TRIANGULO_EQUILATERO) {
			return Math.pow(arresta, 2.0) * Math.sqrt(3.0) / 4.0;
		}
		else if (tipoBase  == Poligono.HEXAGONO_REGULAR) {
			return 3.0 * Math.pow(arresta, 2.0) * Math.sqrt(3.0) / 2.0;
		}
		else if (tipoBase  == Poligono.CIRCULO) {
			return Math.pow(arresta, 2.0) * Math.PI;
		}
		return null;
	}

}
