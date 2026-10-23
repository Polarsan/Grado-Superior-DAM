public class Ejercicio09 {
    public static void main(String[] args) {

        int maxEnteros = Math.max(14, 9);
        double maxDecimales = Math.max(14.2, 9.8);
        long redondeo = Math.round(9.8);


        System.out.println("Máximo entre 14 y 9: " + maxEnteros);
        System.out.println("Máximo entre 14.2 y 9.8: " + maxDecimales);
        System.out.println("Redondeo de 9.8: " + redondeo);
    }
}