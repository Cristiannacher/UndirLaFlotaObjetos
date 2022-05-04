import Barcos.*;

public class Jugador {
    private String nombre;
    private int puntuacion;
    private int disparos;
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

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getDisparos() {
        return disparos;
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
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            case 'I':
                return 8;
            case 'J':
                return 9;
        }
        return 11;
    }

    public boolean disparar(Tablero tableroBarcos, Tablero tableroVacio, char letra, int columna) {
        int fila = conversor(letra);
        boolean hundido = false;
        disparos++;
        if (tableroBarcos.getTablero()[fila][columna] != 2 && tableroBarcos.getTablero()[fila][columna] != 3) {
            if (tableroBarcos.getTablero()[fila][columna] == 1) {
                tableroBarcos.getTablero()[fila][columna] = 2;
                tableroVacio.getTablero()[fila][columna] = 2;
                hundido = true;
                puntuacion++;
            } else {
                tableroBarcos.getTablero()[fila][columna] = 3;
                tableroVacio.getTablero()[fila][columna] = 3;}
        }
        return hundido;
    }


}
