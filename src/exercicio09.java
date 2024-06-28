//9. Subconjuntos de Soma Zero: Determine se existe um
//subconjunto não vazio de elementos em um array cuja
//soma seja igual a zero.

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio09 {

    public static boolean SubconjuntoSomaZero(int[] array) {
        Set<Integer> somaTotalSet = new HashSet<>();
        int somaAcumulada = 0;

        for (int num : array) {
            somaAcumulada += num;
            if (somaAcumulada == 0 || somaTotalSet.contains(somaAcumulada)) {
                return true;
            }
            somaTotalSet.add(somaAcumulada);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o tamanho do array ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];
        System.out.println("digite " + tamanho + " quantidade de numeros inteiro no array ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = sc.nextInt();
        }

        boolean resultado = SubconjuntoSomaZero(array);
        if (resultado) {
            System.out.println("existe subconjunto nao vazio com soma zero");
        } else {
            System.out.println("nao existe subconjunto nao vazio com soma zero");
        }

        sc.close();
    }
}
