package main;

public class Rango {

    private int limiteInferior;
    private int limiteSuperior;

    public Rango() {
        this.limiteInferior = 0;
        this.limiteSuperior = 0;
    }

    public Rango(int limite) {
        if (limite > 0) {
            this.limiteSuperior = limite;
            this.limiteInferior = 0;
        } else {
            this.limiteSuperior = 0;
            this.limiteInferior = limite;
        }
    }

    public Rango(int limiteInferior, int limiteSuperior) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
    }

    public int obtieneNumerosEnRango() {
        return Math.abs(limiteSuperior - limiteInferior);
    }

}
