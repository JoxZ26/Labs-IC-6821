package org.example;

import java.util.HashMap;
import java.util.Map;

public class RegistroDePrototipos {

    private Map<String, Enemigo> prototipos = new HashMap<>();

    public void registrar(String clave, Enemigo enemigo) {
        prototipos.put(clave, enemigo);
    }

    public Enemigo obtenerClon(String clave) {
        Enemigo prototipo = prototipos.get(clave);

        if (prototipo == null) {
            throw new IllegalArgumentException("No existe un prototipo con la clave: " + clave);
        }

        return prototipo.clonar();
    }
}