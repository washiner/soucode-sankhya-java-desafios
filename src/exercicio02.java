//2. Fusão de Arrays: Crie um método que receba dois arrays de inteiros ordenados e os funda em um único array ordenado.

import java.util.Arrays;

public class exercicio02 {

    public static int[] juntandoArraysOrdenados(int[] array1, int[] array2) {
        int[] resultado = new int[array1.length + array2.length];
        int novo = 0;

        for (int i = 0; i < array1.length; i++) {
            resultado[novo] = array1[i];
            novo++;
        }

        for (int i = 0; i < array2.length; i++) {
            resultado[novo] = array2[i];
            novo++;
        }

        Arrays.sort(resultado); //sort ordena

        return resultado;
    }

    public static void main(String[] args) {

        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};


        int[] arrayMesclado = juntandoArraysOrdenados(array1, array2);

        System.out.println("Array fundido: " + Arrays.toString(arrayMesclado));
    }
}
