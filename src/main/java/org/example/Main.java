package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Datos originales
        DispositivoMedicionImperial dispositivo = new DispositivoMedicionImperial(150, 5.5);
        System.out.println("=== DATOS ORIGINALES (SISTEMA IMPERIAL) ===");
        System.out.println("Peso (libras): " + dispositivo.obtenerPesoEnLibras());
        System.out.println("Altura (pies): " + dispositivo.obtenerAlturaEnPies());

        //Adaptación de datos.
        DatosSalud datosAdaptados = new AdaptadorImperialAMetrico(dispositivo);

        System.out.println("\n=== DATOS ADAPTADOS (SISTEMA MÉTRICO) ===");
        System.out.println("Peso (kg): " + datosAdaptados.obtenerPesoEnKilogramos());
        System.out.println("Altura (m): " + datosAdaptados.obtenerAlturaEnMetros());

        CalculadoraIndiceMasaCorporal calculadora = new CalculadoraIndiceMasaCorporal();

        System.out.println("\n=== RESULTADO DEL SISTEMA DE SALUD ===");
        calculadora.procesarPaciente(datosAdaptados);

        }
    }
