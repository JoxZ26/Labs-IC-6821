package org.example;

public class DispositivoMedicionImperial {
    private double pesoEnLibras;
    private double alturaEnPies;

    public DispositivoMedicionImperial(double pesoEnLibras, double alturaEnPies) {
        this.pesoEnLibras = pesoEnLibras;
        this.alturaEnPies = alturaEnPies;
    }

    public double obtenerPesoEnLibras() {
        return pesoEnLibras;
    }

    public double obtenerAlturaEnPies() {
        return alturaEnPies;
    }

}
