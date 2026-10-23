import java.util.Scanner;

public class App {
    public static void main(String[] args) 
    {
        System.out.println("App tipo de movil");
        String marca = "Nothing";
        int NumeroDeBotones = 5;
        char Modelo = 'S';
        Boolean TieneCamara = true;
        int NumeroDeCamaras = 3;
        double Precio = 299.99;

        boolean rebajas = true;
        double porcentajeDescuento = 20.0; 

        if (rebajas) {
            Precio = Precio - (Precio * (porcentajeDescuento / 100));
        }

        System.out.println("Que marca estas buscando?");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.next(); 
        sc.close();

        if (nombre.equalsIgnoreCase(marca)) {
            System.out.println("Lo tenemos en stock");
        System.out.println("Marca:  " + marca);
        System.out.println("Numero de botones:  " + NumeroDeBotones);
        System.out.println("Tiene Camara:  " + TieneCamara);
        System.out.println("Modelo:  " + Modelo);
        System.out.println("Numero de Camaras:  " + NumeroDeCamaras);
        System.out.println("Precio:  " + Precio + "$");    
        } else {
            System.out.println("No lo tenemos en Stock");
        }
String RESET = "\u001B[0m";
String ROJO = "\u001B[31m";
String VERDE = "\u001B[32m";
String AMARILLO = "\u001B[33m";
String AZUL = "\u001B[34m";
  String CYAN = "\u001B[36m";



    }
}