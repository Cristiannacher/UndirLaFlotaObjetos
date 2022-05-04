import Barcos.Barco;

import java.util.Arrays;

public class Tablero {
    private int filas;
    private int columans;
    private int[][] tablero;

    public Tablero(int filas, int columnas) {
        this.filas = filas;
        this.columans = columnas;
        tablero = new int[filas][columnas];
    }


    public int[][] getTablero() {
        return tablero;
    }

    private boolean hayBarco(int inicio, int fin, int tamaño, int orientacion) {
        boolean haybarco = false;
        if (orientacion == 1) {
            for (int i = inicio; i < inicio + (tamaño); i++) {
                if (tablero[i][fin] == 1) {
                    haybarco = true;
                    break;
                }
            }
        } else {
            for (int i = inicio; i < inicio + (tamaño); i++) {
                if (tablero[fin][i] == 1) {
                    haybarco = true;
                    break;
                }
            }
        }
        return haybarco;
    }

    private boolean cabeBarco(Barco barco, int orientacion, int x, int y) {
        if (orientacion == 1) {
            if (barco.getTamaño() + x > 10) {
                return false;
            } else return true;

        } else if (barco.getTamaño() + y > 10) {
            return false;
        } else return true;

    }

    private boolean addBarcoVertical(Barco barco, int orientacion, int x, int y) {
        int contador;
        boolean barcoAdded = false;
        if (cabeBarco(barco, orientacion, x, y)) {
            if (!hayBarco(x, y, barco.getTamaño(), orientacion)) {
                barcoAdded = true;
                contador = x;
                for (int i = 0; i < barco.getTamaño(); i++) {
                    tablero[contador][y] = 1;
                    contador++;
                }
            } else System.out.println("Ya hay un barco en esa posicion");
        } else System.out.println("La posicion no es valida");

        return barcoAdded;
    }

    private boolean addBarcoOrizontal(Barco barco, int orientacion, int x, int y) {
        int contador;
        boolean barcoAdded = false;
        if (cabeBarco(barco, orientacion, x, y)) {
            if (!hayBarco(y, x, barco.getTamaño(), orientacion)) {
                barcoAdded = true;
                contador = y;
                for (int i = 0; i < barco.getTamaño(); i++) {
                    tablero[x][contador] = 1;
                    contador++;
                }
            } else System.out.println("Ya hay un barco en esa posicion");
        } else System.out.println("La posicion no es valida");
        return barcoAdded;
    }

    public boolean addBarco(Barco barco, int orientacion, char letra, int y) {
        int x = conversor(letra);
        if (orientacion == 1) {
            return addBarcoVertical(barco, orientacion, x, y);
        } else {
            if (orientacion == 2) {
                return addBarcoOrizontal(barco, orientacion, x, y);
            } else {
                System.out.println("La horitentacion del barco no es correcta");
                return false;
            }
        }
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
        return 0;
    }

    @Override
    public String toString() {
        for (int i = 0; i < columans + 1; i++) {
            if (i == 0) {
                System.out.print("  ");
            } else System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 0; i < tablero.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("A ");
                    break;
                case 1:
                    System.out.print("B ");
                    break;
                case 2:
                    System.out.print("C ");
                    break;
                case 3:
                    System.out.print("D ");
                    break;
                case 4:
                    System.out.print("E ");
                    break;
                case 5:
                    System.out.print("F ");
                    break;
                case 6:
                    System.out.print("G ");
                    break;
                case 7:
                    System.out.print("H ");
                    break;
                case 8:
                    System.out.print("I ");
                    break;
                case 9:
                    System.out.print("J ");
                    break;
            }
            for (int j = 0; j < tablero[0].length; j++) {
                switch (tablero[i][j]) {
                    case 0:
                        System.out.print("W  ");
                        break;
                    case 1:
                        System.out.print("-  ");
                        break;
                    case 2:
                        System.out.print("O  ");
                        break;
                    case 3:
                        System.out.print("X  ");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
        return null;
    }
}
