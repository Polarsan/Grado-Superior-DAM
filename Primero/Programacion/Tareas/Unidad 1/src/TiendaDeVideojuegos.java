import java.util.Scanner;

public class TiendaDeVideojuegos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

// Aqui establecemos las preguntas

        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        System.out.print("Videojuego: ");
        String videojuego = scanner.nextLine();

        System.out.print("Precio por unidad: ");
        double precioUnidad = scanner.nextDouble();

        System.out.print("Unidades: ");
        int unidades = scanner.nextInt();

        System.out.print("Gastos de envio: ");
        double gastosEnvio = scanner.nextDouble();

        

// establezco el IVA

        final double IVA = 0.21;

// realizo las operaciones para sacar el IVA de cada producto
// precio si iva de todo sin envio
        double sinIva = precioUnidad * unidades;
// hago el coste iva
        double costeIva = sinIva * IVA;
// coste de los objetos mas el iva
        double totalIva = costeIva + sinIva;
// le cambio el nombre a uno mas comodo
        double precioTodo = totalIva;
// añado los gastos de envio al producto con iva
        precioTodo += gastosEnvio;
// los puntos generados por cada 10$
        int puntos = (int) (precioTodo / 10);

// Arnau culpa tuya por enseñarme a poner colores

        String RESET = "\u001B[0m";
        String ROJO = "\u001B[31m";
        String VERDE = "\u001B[32m";
        String AMARILLO = "\u001B[33m";
        String AZUL = "\u001B[34m";
        String CYAN = "\u001B[36m";

// los prints de todo

        System.out.println("========== TICKET ==========");
        System.out.println("Cliente: " + AZUL + cliente + RESET);
        System.out.println("Videojuego: " + videojuego);
        System.out.printf("Precio unidad: %.2f euros%n", precioUnidad);
        System.out.println(AMARILLO + "Unidades: " + RESET + unidades);
        System.out.printf("Subtotal: %.2f euros%n", sinIva);
        System.out.printf("IVA: %.2f euros%n", costeIva);
        System.out.printf("Gastos de envio: " + VERDE + "%.2f euros%n" + RESET, gastosEnvio);
        System.out.printf("TOTAL: " + ROJO + "%.2f euros%n" + RESET, precioTodo);
        System.out.println("Puntos obtenidos: " + CYAN + puntos + RESET);
        System.out.println("============================");
         System.out.println("hola esto es un €€€€€€€€");

        scanner.close();
    }
}