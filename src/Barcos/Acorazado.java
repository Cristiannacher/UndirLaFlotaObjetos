package Barcos;

public class Acorazado extends Barco{
    private int tamaño = 4;
    private String nombre ="Acorazado";
    @Override
    public int getTamaño() {
        return tamaño;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
}
