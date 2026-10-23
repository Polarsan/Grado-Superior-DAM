import java.util.Scanner;
import java.util.Locale;

public class Ejercicio08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        // me he liado creo que no es correcto pero algo hace
        double amp1 = scanner.nextDouble();
        double amp2 = scanner.nextDouble();
        double mag1 = Math.abs(amp1);
        double mag2 = Math.abs(amp2);


        double mayor = Math.max(mag1, mag2);
        double cuadrado = Math.pow(mayor, 2);
        double raiz = Math.sqrt(cuadrado);


        long entero = Math.round(mayor);

        System.out.println("magnitudes " + mag1 + " y " + mag2 + "; mayor " + mayor + "; cuadrado " + cuadrado + "; raíz " + raiz + "; entero " + entero);
        scanner.close();
    }
}