package org.example;

public abstract class Enemigo implements Cloneable {
    protected String nombre;
    protected int vida;
    protected Posicion posicion;

    public Enemigo(String nombre, int vida, Posicion posicion) {
        this.nombre = nombre;
        this.vida = vida;
        this.posicion = posicion;
    }

    public abstract Enemigo clonar();

    public abstract void mostrarInfo();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
}
