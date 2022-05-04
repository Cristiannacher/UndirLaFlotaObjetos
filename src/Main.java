import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("VAMOS A JUGAR A hUNDIR LA FLOTA\n");
        System.out.println("Jugador 1 elija su nombre");
        Jugador jugador1 = new Jugador(reader.next());
        System.out.println(jugador1.getNombre() + " coloque sus barcos\n");
        for (int i = 0; i < jugador1.getBarcos().length; i++) {
            jugador1.getTableroBarcos().toString();
            System.out.println("Cordenadas para: " + jugador1.getBarcos()[i].getNombre());
            char letra = reader.next().charAt(0);
            int y = reader.nextInt() - 1;
            System.out.println("Orientacion para: " + jugador1.getBarcos()[i].getNombre() + "1 vertical 2 orizontal");
            int orientacion = reader.nextInt();
            if (!jugador1.getTableroBarcos().addBarco(jugador1.getBarcos()[i], orientacion, letra, y))
                i--;
        }
        jugador1.getTableroBarcos().toString();

        System.out.println("Jugador 2 elija su nombre");
        Jugador jugador2 = new Jugador(reader.next());
        System.out.println(jugador2.getNombre() + " coloque sus barcos\n");
        for (int i = 0; i < jugador2.getBarcos().length; i++) {
            jugador2.getTableroBarcos().toString();
            System.out.println("Cordenadas para: " + jugador2.getBarcos()[i].getNombre());
            char letra = reader.next().charAt(0);
            int y = reader.nextInt() - 1;
            System.out.println("Orientacion para: " + jugador2.getBarcos()[i].getNombre() + "1 vertical 2 orizontal");
            int orientacion = reader.nextInt();
            if (!jugador2.getTableroBarcos().addBarco(jugador2.getBarcos()[i], orientacion, letra, y))
                i--;
        }
        jugador2.getTableroBarcos().toString();

        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");

        System.out.println("VAMOS HA EMPEZAR LA PARTIDA\n");
        for (int i = 0; i < 15; i++) {
            System.out.println(jugador1.getNombre() + " es tu turno\n");
            jugador2.getTableroVacio().toString();
            System.out.println("Cordenadas letra + numero");
            char letra = reader.next().charAt(0);
            int y = reader.nextInt()-1;
            if (jugador1.disparar(jugador2.getTableroBarcos(), jugador2.getTableroVacio(), letra, y))
                System.out.println("HAS DADO EN EL BLANCO!!");
            else System.out.println("DISPARO FALLIDO!!");
            jugador2.getTableroVacio().toString();
            System.out.println("PUNTUACION: " + jugador1.getPuntuacion());
            System.out.println("DISPAROS: " + jugador1.getDisparos());

            System.out.println("\n \n");

            System.out.println(jugador2.getNombre() + " es tu turno\n");
            jugador1.getTableroVacio().toString();
            System.out.println("Cordenadas letra + numero");
            char letra2 = reader.next().charAt(0);
            int y2 = reader.nextInt()-1;
            if (jugador2.disparar(jugador1.getTableroBarcos(), jugador1.getTableroVacio(), letra2, y2))
                System.out.println("HAS DADO EN EL BLANCO!!");
            else System.out.println("DISPARO FALLIDO!!");
            jugador1.getTableroVacio().toString();
            System.out.println("PUNTUACION: " + jugador2.getPuntuacion());
            System.out.println("DISPAROS: " + jugador2.getDisparos());

            System.out.println("\n \n");
        }
    }
}
