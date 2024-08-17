package br.dev.hygino.geometriaespacial;

import br.dev.hygino.geometriaespacial.model.Piramide;
import br.dev.hygino.geometriaespacial.model.Poliedro;
import br.dev.hygino.geometriaespacial.model.Poligono;
import br.dev.hygino.geometriaespacial.model.Prisma;
import java.util.List;

public class GeometriaEspacial {

    public static void main(String[] args) {
        List<Poliedro> lista = List.of(
                new Prisma(3.0, 10.0, Poligono.QUADRADO),
                new Prisma(3.0, 10.0, Poligono.TRIANGULO_EQUILATERO),
                new Prisma(10.0, 10.0, Poligono.CIRCLULO),
                new Piramide(10.0, 10.0, Poligono.QUADRADO)
        );

        lista.stream().forEach(p -> {
            System.out.println(p.getClass().getName().replace("br.dev.hygino.geometriaespacial.model.", "Poliedro: "));
            System.out.printf("Lado: %.2f, altura: %.2f, %s\n", p.getMedidaBase(), p.getAltura(), p.getBase());
            System.out.printf("Area lateral: %.2f\n", p.areaLateral());
            System.out.printf("Area base: %.2f\n", p.getBase().area(p.getMedidaBase()));
            System.out.printf("Area total: %.2f\n\n", p.areaTotal());
            System.out.printf("Volume: %.2f\n\n", p.volume());
        });
    }
}
