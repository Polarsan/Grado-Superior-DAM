  
import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Radio: ");
        double radio = teclado.nextDouble();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.printf("El área del circulo es %.2f    " , area);

            teclado.close();
    }
}


