public class Ejercicio2 {

    public static void main(String[] args) {
        int puntosPartida1 = 7;
        int puntosPartida2 = 4;
        int numPartidos = 2;

        // Se calcula la media pasando los puntos
        double mediaPuntos = calcularMedia(puntosPartida1, puntosPartida2, numPartidos);
        System.out.println("Media de puntos por partido: " + mediaPuntos);

        int largoCampo = 8;
        int anchoCampo = 3;

        // Arreglado: antes le pasaba (largo, largo) en vez de (largo, ancho)
        int areaCampo = calcularArea(largoCampo, anchoCampo);
        System.out.println("Area del campo: " + areaCampo);
    }

    public static double calcularMedia(int puntos1, int puntos2, int cantidadPartidos) {
        // Arreglado: pongo 1.0 * s o parseo a double porque si no Java divide como enteros y quita decimales
        double suma = puntos1 + puntos2;
        double resultado = suma / cantidadPartidos;
        return resultado;
    }

    public static int calcularArea(int base, int altura) {
        return base * altura;
    }
}