package Barcos;

public class Destructor extends Barco {
    private int tamaño = 2;
    private String nombre = "Destructor";

    @Override
    public int getTamaño() {
        return tamaño;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
}
