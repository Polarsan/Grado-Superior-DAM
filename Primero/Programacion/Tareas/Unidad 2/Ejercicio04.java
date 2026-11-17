import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String original = scanner.nextLine();

        //crea otra eliminando los espacios 
        String limpio = original.trim();

        //cálculos
        String limpioMayusculas = limpio.toUpperCase();
        int longitud = limpio.length();
        char primero = limpio.charAt(0);
        char ultimo = limpio.charAt(longitud - 1);
        String prefijo = limpio.substring(0, 3).toUpperCase();
        System.out.println(limpioMayusculas + "; longitud " + longitud + "; primero " + primero + "; último " + ultimo + "; prefijo " + prefijo);

        scanner.close();
    }
}