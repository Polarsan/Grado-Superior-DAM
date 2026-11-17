import java.util.Scanner;
import java.util.Locale;

public class Ejercicio1 {
    public static void main(String[] args) {

                String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String CYAN = "\u001B[36m";
        

        Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US);



        System.out.print("Introduce el número de plazas: ");
        int plazas = teclado.nextInt();


        if (plazas < 19) {
            System.out.println(VERDE + "Aforo permitido" + RESET);
        
        } 
        else if (plazas == 19) {
            System.out.println(VERDE + "Aforo permitido" + RESET);
        } 
        else if (plazas == 20) {
            System.out.println(AMARILLO + "El aforo está completo." + RESET);
        } 
        else {

            int sobran = plazas - 20;
            System.out.println(ROJO + "Aforo superado, sobran " + RESET  + sobran + " personas, el aforo maximo es" + ROJO + "20" + RESET);
        }
                teclado.close();

    }
}