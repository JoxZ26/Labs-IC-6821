package org.example;
<<<<<<< HEAD

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
=======
public class Main {
    public static void main(String[] args) {
        EnemigoJefe jefeOriginal = new EnemigoJefe(
                "Nemesis Original",
                5000,
                new Posicion(0, 0),
                "texturas/nemesis_hd.png",
                "sonidos/nemesis_theme.wav",
                new ConfigIA(10, "Persecucion y golpe pesado"),
                "Negro"
        );

        RegistroDePrototipos registro = new RegistroDePrototipos();
        registro.registrar("nemesisBase", jefeOriginal);

        System.out.println("JEFE ORIGINAL ANTES DE CLONAR: ");
        jefeOriginal.mostrarInfo();

        // Crear 5 clones
        EnemigoJefe clon1 = (EnemigoJefe) registro.obtenerClon("nemesisBase");
        EnemigoJefe clon2 = (EnemigoJefe) registro.obtenerClon("nemesisBase");
        EnemigoJefe clon3 = (EnemigoJefe) registro.obtenerClon("nemesisBase");
        EnemigoJefe clon4 = (EnemigoJefe) registro.obtenerClon("nemesisBase");
        EnemigoJefe clon5 = (EnemigoJefe) registro.obtenerClon("nemesisBase");

        // Personalizar cada clon
        clon1.setNombre("Nemesis Clon 1");
        clon1.setColor("Rojo");
        clon1.getPosicion().setX(10);
        clon1.getPosicion().setY(5);

        clon2.setNombre("Nemesis Clon 2");
        clon2.setColor("Verde");
        clon2.getPosicion().setX(20);
        clon2.getPosicion().setY(10);

        clon3.setNombre("Nemesis Clon 3");
        clon3.setColor("Azul");
        clon3.getPosicion().setX(30);
        clon3.getPosicion().setY(15);

        clon4.setNombre("Nemesis Clon 4");
        clon4.setColor("Morado");
        clon4.getPosicion().setX(40);
        clon4.getPosicion().setY(20);

        clon5.setNombre("Nemesis Clon 5");
        clon5.setColor("Blanco");
        clon5.getPosicion().setX(50);
        clon5.getPosicion().setY(25);

        // Modificar también la IA de un clon.
        clon1.getConfiguracionIA().setNivelDificultad(20);
        clon1.getConfiguracionIA().setPatronAtaque("Tentaculo y embestida");

        //Mostrar clones
        System.out.println("\nCLONES CREADOS: ");
        clon1.mostrarInfo();
        clon2.mostrarInfo();
        clon3.mostrarInfo();
        clon4.mostrarInfo();
        clon5.mostrarInfo();

        // Mostrar el original después de modificar clones
        System.out.println("\nJEFE ORIGINAL DESPUÉS DE MODIFICAR LOS CLONES: ");
        jefeOriginal.mostrarInfo();
    }
}
>>>>>>> cbec60069202f4424a4beeb3065a8b72c92d829a
