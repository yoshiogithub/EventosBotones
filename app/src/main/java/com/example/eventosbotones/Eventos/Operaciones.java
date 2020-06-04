package com.example.eventosbotones.Eventos;

public class Operaciones {
    private float a;
    private  float b;

    public Operaciones(float a, float b) {
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float Suma(){
        return getA()+getB();
    }
    public float Resta(){
        return getA()-getB();
    }
    public float Mulriplicacion(){
        return getA()*getB();
    }
    public float Division(){
        return getA()/getB();
    }


}
