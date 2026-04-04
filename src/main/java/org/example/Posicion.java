package org.example;

public class Posicion {
    private double x;
    private double y;

    public Posicion(double x,double y){
        this.x = x;
        this.y = y;
    }
    //Constructor para copia
    public Posicion(Posicion original){
        this.x = original.x;
        this.y = original.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
