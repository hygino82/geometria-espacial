package br.dev.hygino.geometriaespacial.model;

public enum Poligono {
    TRIANGULO_EQUILATERO {
        @Override
        public double perimetro(double medidaLado) {
            return 3 * medidaLado;
        }

        @Override
        public double area(double medidaLado) {
            return Math.pow(medidaLado, 2) * Math.sqrt(3.0) / 4.0;
        }

        @Override
        public int ladosBase() {
            return 3;
        }

        @Override
        public double apotemaBase(double medidalado) {
            return medidalado * Math.sqrt(3) / 6.0;
        }
    },
    QUADRADO {
        @Override
        public double perimetro(double medidaLado) {
            return 4 * medidaLado;
        }

        @Override
        public double area(double medidaLado) {
            return Math.pow(medidaLado, 2.0);
        }

        @Override
        public int ladosBase() {
            return 4;
        }

        @Override
        public double apotemaBase(double medidalado) {
            return medidalado / 2.0;
        }
    },
    HEXAGONO_REGULAR {
        @Override
        public double perimetro(double medidaLado) {
            return 6 * medidaLado;
        }

        @Override
        public double area(double medidaLado) {
            return 3 * Math.pow(medidaLado, 2) * Math.sqrt(3.0) / 2.0;
        }

        @Override
        public int ladosBase() {
            return 6;
        }

        @Override
        public double apotemaBase(double medidalado) {
            return Math.sqrt(3.0) * medidalado / 2.0;
        }
    },
    CIRCLULO {
        @Override
        public double perimetro(double medidaLado) {
            return 2 * Math.PI * medidaLado;
        }

        @Override
        public double area(double medidaLado) {
            return Math.PI * Math.pow(medidaLado, 2.0);
        }
    };

    public abstract double perimetro(double medidaLado);

    public abstract double area(double medidaLado);

    public int ladosBase() {
        return 1;
    }

    public double apotemaBase(double medidaLado) {
        return medidaLado;
    }
}
