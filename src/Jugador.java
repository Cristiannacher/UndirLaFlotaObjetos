import Barcos.*;

public class Jugador {
    private String nombre;
    private int puntuacion;
    private Tablero tableroBarcos = new Tablero(10,10);
    private Tablero tableroVacio = new Tablero (10,10);
    private Barco barco1 = new Portaaviones();
    private Barco barco2 = new Acorazado();
    private Barco barco3 = new Submarino();
    private Barco barco4 = new Destructor();
    private Barco[] barcos = {barco1,barco2,barco3,barco4};

    public Jugador(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Barco[] getBarcos() {
        return barcos;
    }

    public Tablero getTableroBarcos() {
        return tableroBarcos;
    }

    public Tablero getTableroVacio() {
        return tableroVacio;
    }

    private int conversor(char letra) {
        switch (letra) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;
            case 'I':
                return 9;
            case 'J':
                return 10;
        }
        return 0;
    }

    public boolean disparar(Tablero tableroBarcos, Tablero tableroVacio, char letra, int columna) {
        int fila = conversor(letra);
        boolean hundido = false;
        if (tableroBarcos.getTablero()[fila][columna] != 2 && tableroBarcos.getTablero()[fila][columna] != 3) {
            if (tableroBarcos.getTablero()[fila][columna] == 1) {
                tableroBarcos.getTablero()[fila][columna] = 2;
                tableroVacio.getTablero()[fila][columna] = 2;
                hundido = true;
            } else {
                tableroBarcos.getTablero()[fila][columna] = 3;
                tableroVacio.getTablero()[fila][columna] = 3;}
        }
        return hundido;
    }


}
