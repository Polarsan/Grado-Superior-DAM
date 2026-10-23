import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // líneas separadas
        String codigo1 = scanner.nextLine();
        String codigo2 = scanner.nextLine();

        // Eliminación de espacios de los lados
        String limpio1 = codigo1.trim();
        String limpio2 = codigo2.trim();

        // Comparación 
        boolean coinciden = limpio1.equals(limpio2);

        // Comparación 
        boolean coincidemayus = limpio1.toUpperCase().equals(limpio2.toUpperCase());

        // resultados
        System.out.println(coinciden + " y " + coincidemayus);

        scanner.close();
    }
}