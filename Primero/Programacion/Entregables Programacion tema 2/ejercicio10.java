import java.util.Random;

public class Ejercicio10 {
    public static void main(String[] args) {
    Random random = new Random();


        int salida1 = random.nextInt(16) + 20;
        int salida2 = random.nextInt(16) + 20;
        int salida3 = random.nextInt(16) + 20;


    System.out.println("Bandeja asignada 1: " + salida1);
    System.out.println("Bandeja asignada 2: " + salida2);
        System.out.println("Bandeja asignada 3: " + salida3);
    }
}