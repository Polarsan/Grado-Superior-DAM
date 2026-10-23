public class Ejercicio1 {

    public static void main(String[] args) 
    {

double precioBase = 50.0;
final double iva = precioBase * 0.21;   
double ivajUEGO = precioBase * iva;          
double precioFinal = precioBase + ivajUEGO;



String VERDE = "\u001B[32m";
String RESET = "\u001B[0m";
System.out.println( precioFinal + VERDE +"$"+ RESET);



    }





    
}
