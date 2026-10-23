import java.util.Scanner;
import java.util.Random;
import java.util.Locale;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        scanner.useLocale(Locale.US);


        int numeroMuestra = scanner.nextInt();
        scanner.nextLine(); 
        
        String especieCruda = scanner.nextLine();
        double alturavieja = scanner.nextDouble();
        double alturanueva = scanner.nextDouble();


        String especieLimpia = especieCruda.trim();
        String especieMayus = especieLimpia.toUpperCase();
        int longitud = especieMayus.length();
        

        String prefijo = especieMayus.substring(0, 3);
        String identificador = prefijo + "-" + numeroMuestra;


        Random random = new Random();
        int bandeja = random.nextInt(9) + 4;


        double cambio = alturanueva - alturavieja;
        double magnitud = Math.abs(cambio);
        

        double cambioRedondeado = Math.round(cambio * 100.0) / 100.0;


        System.out.println("Número: " + numeroMuestra);
        System.out.println("Especie normalizada: " + especieMayus);
        System.out.println("Longitud: " + longitud);
        System.out.println("Identificador: " + identificador);
        System.out.println("Bandeja asignada: " + bandeja);
        System.out.println("Cambio redondeado: " + cambioRedondeado);
        System.out.println("Magnitud sin redondear: " + magnitud);

        scanner.close();
    }
}