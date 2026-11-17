// a) 0,75 puntos. Escribe la clase, el main y las importaciones.
//  Configura Scanner con Locale.US y lee los datos en el orden solicitado.
//  Resuelve el salto de línea pendiente para conservar el nombre completo y cierra el lector al terminar las lecturas.

import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Taller {
    public static void main(String[] args) {

// MIS COLORINES

        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String CYAN = "\u001B[36m";


        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

                System.out.println(ROJO + "Coloque su numero de inscripcion:  " + RESET);
        int numeroInscripcion = sc.nextInt();
                       System.out.println(ROJO + "Ingrese su nombre completo:  " +RESET);
        String nombre = sc.nextLine();
        sc.nextLine();

            System.out.println(ROJO + "Ingrese la duracion prevista"+ RESET);
        double duracionCompleta = sc.nextDouble();
                sc.nextLine();





// b) 0,75 puntos. Obtén el nombre sin espacios en los extremos,
//  su versión en mayúsculas y la longitud del nombre limpio. 
// Conserva los espacios interiores.

        String nombre1 = nombre .trim().toUpperCase();
// 


        int longitud = nombre1.length();
        String inicio = nombre1.substring(0, 3);


        // e) 0,25 puntos. Redondea la duración al minuto entero más próximo mediante Math y guarda el resultado en una variable long.
        long duracionRedondeada = Math.round(duracionCompleta);
        
// d) 0,50 puntos. Crea un objeto Random, genera una única mesa entre 2 y 7,
//  ambos incluidos, y guarda el resultado para utilizarlo después en el resumen.
        Random azar = new Random();
        int mesa = azar.nextInt(6) + 2;

        // c) 0,50 puntos. Construye un identificador
        //  con los tres primeros caracteres del nombre limpio en mayúsculas,
        //  un guion y el número de inscripción. Utiliza substring para extraerlos.
  
        String identificador = inicio + "-" + numeroInscripcion;

// f) 0,25 puntos. Muestra número de inscripción, nombre limpio en mayúsculas, 
// longitud, identificador, mesa y duración redondeada con sus etiquetas, e indica minutos en la duración.


        System.out.println("Inscripcion: " + numeroInscripcion);
        System.out.println("Nombre: " + nombre1);
        System.out.println("Longitud: " + longitud);
        System.out.println("Identificador: " + identificador);
        System.out.println("Mesa: " + mesa);
        System.out.println("Duracion: " + duracionRedondeada + "Minutos");
        sc.close();


        














    }
}