//6. Maior Sequência Crescente: Encontre a maior sequência 
//crescente de números em um array e imprima os números dessa sequência.

        
import java.util.Scanner;

public class exercicio06 {

    public static int[] maiorSequencia(int[] array) {
        int maxLength = 1;
        int currentLength = 1;
        int endIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                currentLength++;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    endIndex = i - 1;
                }
                currentLength = 1;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            endIndex = array.length - 1;
        }

        int[] maiorSequencia = new int[maxLength];
        for (int i = 0; i < maxLength; i++) {
            maiorSequencia[i] = array[endIndex - maxLength + 1 + i];
        }

        return maiorSequencia;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o tamanho do array ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];
        System.out.println("digite " + tamanho + " numeros para o array ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = sc.nextInt();
        }

        int[] resultado = maiorSequencia(array);
        System.out.println("maior sequencia de sucessor");
        for (int num : resultado) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}


