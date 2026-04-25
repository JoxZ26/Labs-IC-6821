package org.example;

public class AdaptadorImperialAMetrico implements DatosSalud {
    private DispositivoMedicionImperial dispositivoImperial;

    public AdaptadorImperialAMetrico(DispositivoMedicionImperial dispositivoImperial) {
        this.dispositivoImperial = dispositivoImperial;
    }

    @Override
    public double obtenerPesoEnKilogramos() {
        return dispositivoImperial.obtenerPesoEnLibras() * 0.4536;
    }

    @Override
    public double obtenerAlturaEnMetros() {
        return dispositivoImperial.obtenerAlturaEnPies() * 0.3048;
    }
}
