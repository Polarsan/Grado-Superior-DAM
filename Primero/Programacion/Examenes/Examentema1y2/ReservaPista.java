// a) 0,50 puntos. Escribe la clase y el main, incluye las importaciones necesarias,
// crea un Scanner, configúralo con Locale.US 
// y ciérralo cuando hayas terminado de leer los datos.
import java.util.Locale;
import java.util.Scanner;;

public class ReservaPista {
    public static void main(String[] args) {

// Mis colores para que sea todo mas bonito

        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String CYAN = "\u001B[36m";

        // c) 0,50 puntos. Declara como constantes el porcentaje de descuento del 10 %
        //  y el gasto de servicio de 2 euros, con tipos adecuados.

        
 final double descuento = 0.1;
        final int servicio = 2;
        // b) 0,75 puntos. Lee y guarda el nombre completo, 
        // las horas como int y la tarifa por hora como double,
        //  respetando el orden indicado y los espacios interiores del nombre.

 Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println(VERDE + "Coloca tu nombre completo: "+ RESET);
        String nombre = sc.nextLine().trim();

         System.out.println(ROJO + "Horas totales: " + RESET);
        int horas = sc.nextInt();

        System.out.println(CYAN + "Tarifa por horas: "+ RESET);
        double tarifaHora = sc.nextDouble();




// d) 0,75 puntos. Calcula y guarda el subtotal, 
// el importe del descuento y el total mediante las fórmulas indicadas,
//  utilizando las constantes anteriores.
        double subtotal = horas * tarifaHora;
        double descuentoFinal = subtotal * descuento;
        double total = subtotal - descuentoFinal + servicio;

        //e) 0,50 puntos. Muestra un resumen con nombre, horas, 
        // tarifa por hora, subtotal, descuento y total. 
        // Identifica los datos y acompaña los importes de la unidad euros.
        System.out.println(ROJO + "Nombre: " + RESET + VERDE + nombre + RESET);
        System.out.println(ROJO + "Horas: " + RESET + VERDE + horas + RESET);
        System.out.println(ROJO + "tarifa por hora: " + RESET + VERDE + tarifaHora+ RESET + AZUL + " Euros"+ RESET);
        System.out.println(ROJO + "Subtotal: " + RESET + VERDE + subtotal + RESET + AZUL + " Euros"+ RESET);
        System.out.printf(ROJO + "Descuento: %.2f%n" + RESET, descuentoFinal, AZUL + " Euros"+ RESET);
        System.out.println(ROJO + "Total: " + RESET + VERDE + total + RESET + AZUL + " Euros"+ RESET);
        

    }
}