package clase2;

import java.util.Random;
import java.util.Scanner;

public class Juego {

    public static void main(String[] args) {
        boolean[] resultados = jugar();
        mostrar(resultados);
    }

    public static void mostrar(boolean[] resultados) {
        // TODO Auto-generated method stub
        System.out.println(ganador(resultados));
        System.out.println(asertaronTodos(resultados));
        System.out.println(asertaronPorloMenosUno(resultados));
    }

    private static boolean asertaronPorloMenosUno(boolean[] resultados) {
        // TODO Auto-generated method stub
        return false;
    }

    private static boolean asertaronTodos(boolean[] resultados) {
        // TODO Auto-generated method stub
        return false;
    }

    public static String ganador(boolean[] resultados) {
        // TODO Auto-generated method stub
        int puntosJugador1 = puntosJugador1(resultados);
        int puntosJugador2 = puntosJugador2(resultados);
        if(puntosJugador1==puntosJugador2) {
            return "Empate";
        } else if(puntosJugador1 > puntosJugador2) {
            return "Gano Jugador 1";
        } else {
            return "Gano Jugador 2";
        }
    }

    // resultados
    // jugador1 en posiciones pares
    // jugador2 en posiciones impares
    // true false true false true true  Jugador2 = 1punto
    public static int puntosJugador2(boolean[] resultados) {
        int rta = 0;
        for (int i = 1; i < resultados.length; i=i+2) {
            if(resultados[i]) rta++;
        }
        return rta;
    }

    private static int puntosJugador1(boolean[] resultados) {
        int rta = 0;
        for (int i = 0; i < resultados.length; i=i+2) {
            if(resultados[i]) rta++;
        }
        return rta;
    }

    private static boolean[] jugar() {
        // TODO Auto-generated method stub

        int intento;
        boolean[] resultado = {false, false, false, false, false, false, false, false, false, false};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int numeroAdivinar = numeroAleatorio();
            int jugador = 2;
            if (i%2 == 0)  {
                jugador = 1;
            }
            System.out.println("Va el jugador numero " + jugador);
            System.out.print("Numero: " + numeroAdivinar);
            System.out.println("Ingrese un numero del 1 al 10: ");
            intento = scanner.nextInt();

            if (intento == numeroAdivinar) {
                resultado[i] = true;
                System.out.println("Adivinaste! Ganas un punto.\n");
            }else {
                System.out.println("No adivinaste! el numero era " + numeroAdivinar);
            }

        }
        scanner.close();

        return resultado;
    }

    public static int numeroAleatorio() {
        Random numAleatorio = new Random();
        int num = numAleatorio.nextInt(1,11);

        return num;
    }

    public static boolean esPar(int num) {
        boolean par =  false;

        if (num % 2 == 0) {
            par = true;
        }
        return par;
    }

}
