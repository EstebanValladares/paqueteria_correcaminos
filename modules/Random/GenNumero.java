package modules.Random;

import java.util.Random;

public class GenNumero {
    public static int[] generarNumerosAleatorios(int cantidad, int limiteSuperior) {
        Random rand = new Random();
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = rand.nextInt(limiteSuperior);
        }
        return numeros;
    }
}
