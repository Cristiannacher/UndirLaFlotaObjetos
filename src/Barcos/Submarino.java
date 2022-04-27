package Barcos;

public class Submarino extends Barco{
    private int tamaño = 3;
    private String nombre ="Submarino";

    @Override
    public int getTamaño() {
        return tamaño;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
}
