package org.example;

public class CalculadoraIndiceMasaCorporal {

    public void procesarPaciente(DatosSalud datos) {
        double peso = datos.obtenerPesoEnKilogramos();
        double altura = datos.obtenerAlturaEnMetros();

        double indiceMasaCorporal = peso / (altura * altura);

        String clasificacion;
        if (indiceMasaCorporal < 18.5) {
            clasificacion = "Bajo peso";
        } else if (indiceMasaCorporal < 25) {
            clasificacion = "Normal";
        } else {
            clasificacion = "Sobrepeso";
        }
        System.out.println("Peso (kg): " + peso);
        System.out.println("Altura (m): " + altura);
        System.out.println("IMC: " + indiceMasaCorporal);
        System.out.println("Clasificación: " + clasificacion);
    }
}
