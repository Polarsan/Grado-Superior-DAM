import java.awt.Point;

public class Ejercicio01 {
    public static void main(String[] args) {
        int lugares = 6;
        int copadita = lugares;
        copadita = 9;
        
        Point sitio = new Point(2, 5);
        Point vista = sitio;
        Point alternativa = new Point(2, 5);
        
        vista.y = 8;
        vista = alternativa;
        vista.x = 7;

        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String CYAN = "\u001B[36m";
        
        System.out.println(VERDE + lugares + RESET);
        System.out.println(copadita);
        System.out.println(ROJO + sitio.y + RESET);
        System.out.println(alternativa.x);
        System.out.println(vista.y);
    }
}