package pr3.practica4;

public class GeneraVector {

    public static float[] generaVectorAleatorio(int tamaño) {
        float[] res = new float[tamaño];
        java.util.Random r = new java.util.Random();
        for (int i = 0; i < tamaño; i++) {
            res[i] = r.nextFloat();
        }
        return res;
    }
    
    public static int obtenerTamañoAleatorio(int tamañoMinimo) {
        while (true) {
            java.util.Random random = new java.util.Random();
            int tamañoAleatorio = random.nextInt();
            if (tamañoAleatorio < tamañoMinimo) return tamañoAleatorio;
        }
    }
    
}
