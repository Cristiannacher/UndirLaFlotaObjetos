package Barcos;

public class Portaaviones extends Barco{
    private int tamaño = 5;
    private String nombre ="Portaaviones";

    @Override
    public int getTamaño() {
        return tamaño;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
}
