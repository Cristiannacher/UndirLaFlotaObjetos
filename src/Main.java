import Barcos.Barco;
import Barcos.Portaaviones;
import Barcos.Submarino;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("VAMOS HA EMPEZAR LA PARTIDA\n");
        System.out.println("Jugador 1 elija su nombre");
        Jugador jugador1 = new Jugador(reader.nextLine());
        System.out.println(jugador1.getNombre()+" coloque sus barcos\n");
        for(int i = 0; i<jugador1.getBarcos().length; i++){
            jugador1.getTablero().imprimir();
            System.out.println("Cordenadas para: "+jugador1.getBarcos()[i].getNombre());
            char letra = reader.next().charAt(0);
            int y = reader.nextInt()-1;
            System.out.println("Orientacion para: "+jugador1.getBarcos()[i].getNombre()+"1 vertical 2 orizontal");
            int orientacion = reader.nextInt();
            jugador1.getTablero().addBarco(jugador1.getBarcos()[i],orientacion,letra,y);
        }
    }
}
