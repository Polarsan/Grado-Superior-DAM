import java.util.Scanner;
import java.util.Locale;

public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Configura Locale.US (no lo llego a entender del todo)
        scanner.useLocale(Locale.US);

        int puesto = scanner.nextInt();

        scanner.nextLine();

        String muestraCruda = scanner.nextLine();
        String muestraLimpia = muestraCruda.trim(); 

        double aumento = scanner.nextDouble();


        System.out.println("puesto " + puesto + ", muestra " + muestraLimpia + " y aumento " + aumento);

        scanner.close();
    }
}