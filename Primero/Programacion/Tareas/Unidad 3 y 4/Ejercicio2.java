import java.util.Scanner;
import java.util.Locale;

public class Ejercicio2 {
    public static void main(String[] args) {

        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String CYAN = "\u001B[36m";

        
        System.out.println("introduzca el numero de numeros que quieres sumar");
int numero = 100;

int paso1 = numero / 2;
int paso2 = paso1 * numero;
int paso3 = paso2 + paso1;

System.out.println("su numero es " + paso3);


    }
}