package org.example;

public class EnemigoJefe extends Enemigo {

    private String texturaPesada;
    private String sonidoPesado;
    private ConfigIA configuracionIA;
    private String color;

    public EnemigoJefe(String nombre, int vida, Posicion posicion,
                       String texturaPesada, String sonidoPesado,
                       ConfigIA configuracionIA, String color) {
        super(nombre, vida, posicion);
        this.texturaPesada = texturaPesada;
        this.sonidoPesado = sonidoPesado;
        this.configuracionIA = configuracionIA;
        this.color = color;
    }
    public EnemigoJefe(EnemigoJefe otro) {
        super(otro.nombre, otro.vida, new Posicion(otro.posicion));

        this.texturaPesada = otro.texturaPesada;
        this.sonidoPesado = otro.sonidoPesado;
        this.configuracionIA = new ConfigIA(otro.configuracionIA);
        this.color = otro.color;
    }

    @Override
    public EnemigoJefe clonar() {
        return new EnemigoJefe(this);
    }

    @Override
    public void mostrarInfo() {
        System.out.println("EnemigoJefe{" +
                "nombre='" + nombre + '\'' +
                ", vida=" + vida +
                ", posicion=" + posicion +
                ", textura='" + texturaPesada + '\'' +
                ", sonido='" + sonidoPesado + '\'' +
                ", configuracionIA=" + configuracionIA +
                ", color='" + color + '\'' +
                '}');
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ConfigIA getConfiguracionIA() {
        return configuracionIA;
    }

    public void setConfiguracionIA(ConfigIA configuracionIA) {
        this.configuracionIA = configuracionIA;
    }
}
