import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.awt.Point;

public class RepartoDron {
    public static void main(String[] args) {



        // Mis colores :)
        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String CYAN = "\u001B[36m";




        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Random canridadDesviacion = new Random();
        final double consumoPorMinuto = 2.0;
        final double reservaMinima = 15.0;

        System.out.println(ROJO + "cual es su coordenada x" +RESET);
        int coordenadaX = sc.nextInt();
        System.out.println(AZUL + "cual es su coordenada y" + RESET );
        int coordenadaY = sc.nextInt();
        Point base = new Point();
        Point destino = new Point(coordenadaX, coordenadaY);
        sc.nextLine();
        System.out.println("cual es el nombre de su dron");
        String Dron = sc.nextLine();
        System.out.println("cual es su velocidad");
        double velocidad = sc.nextDouble();
        System.out.println(AMARILLO + "cual es su bateria inicial" + RESET);
        double bateriaInicial = sc.nextDouble();

        sc.close();

        String nombreNormal = Dron.trim().toUpperCase();
            int longitud = nombreNormal.length();
            char primeraLetra = nombreNormal.charAt(0);


        double distanciaRecta = base.distance(destino);
        double desviacion = canridadDesviacion.nextInt(21) + 10;
        double distanciaTotal = desviacion + distanciaRecta;
        double tiempo = distanciaTotal / velocidad;
        double consumo = tiempo * consumoPorMinuto;
        double bateriaFinal = Math.max(0.0 , bateriaInicial - consumo);



        boolean repartoViable = bateriaInicial >= consumo + reservaMinima;







        System.out.println("nombre leído: " + Dron);
        System.out.println("nombre normalizado: " + nombreNormal);
        System.out.println("longitud del nombre normalizado: " + longitud);
        System.out.println("inicial: " + primeraLetra);
        System.out.println("identificador:" + nombreNormal.substring(0, 3) + "-" + coordenadaX + "-" + coordenadaY);
        System.out.println("base:" + base.x + " " + base.y);
        System.out.println("destino:" +ROJO + destino.x + RESET + "," +AZUL + destino.y + RESET);
        System.out.println("desvío aleatorio:" + desviacion + " m");
        System.out.println("Distancia recta:" + (Math.round(distanciaRecta * 100.0) / 100.0) + " m");
        System.out.println("Distancia total:" + (Math.round(distanciaTotal * 100.0) / 100.0) + " m");
        System.out.println("velocidad:" + velocidad + " Metros/min");
        System.out.println("Tiempo estimado:" + (Math.round(tiempo * 100.0) / 100.0) + " min");
        System.out.println("batería inicial:" + bateriaInicial + "%");
        System.out.println("consumo por minuto:" + consumoPorMinuto + " puntos porcentuales");
        System.out.println("Consumo del reparto:" + (Math.round(consumo * 100.0) / 100.0) + " puntos porcentuales");
        System.out.println(AMARILLO + "batería mínima ="+ RESET + reservaMinima + "%");
        System.out.println(AMARILLO + "Batería final:" + RESET + (Math.round(bateriaFinal * 100.0) / 100.0) + "%");
        System.out.println("reparto viable con reserva:" + repartoViable);
    }
}