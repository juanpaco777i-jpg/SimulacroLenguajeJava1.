public class Ejercicio1 {

    public static void main(String[] args) {

        // Habitación 1
        double largo1 = 5.0;
        double ancho1 = 4.0;
        double superficie1 = largo1 * ancho1;
        double litros1 = calcularLitros(superficie1);
        double euros1 = calcularPrecio(litros1);
        System.out.println("Habitacion 1: " + litros1 + " litros, " + euros1 + " euros");

        // Habitación 2
        double largo2 = 6.0;
        double ancho2 = 2.5;
        double superficie2 = largo2 * ancho2; // Arreglado: ponía + en vez de *
        double litros2 = calcularLitros(superficie2);
        double euros2 = calcularPrecio(litros2);
        System.out.println("Habitacion 2: " + litros2 + " litros, " + euros2 + " euros");

        // Totales
        double totalLitros = litros1 + litros2;
        System.out.println("Total de litros: " + totalLitros);

        double totalEuros = euros1 + euros2; // Arreglado: estaba euros1 + euros1
        System.out.println("Total de euros: " + totalEuros);
    }

    // Método extraído con Ctrl+Alt+M para no repetir la división
    public static double calcularLitros(double superficie) {
        return superficie / 10;
    }

    // Método extraído para calcular el precio según los litros
    public static double calcularPrecio(double litros) {
        return litros * 4;
    }
}