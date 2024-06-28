//1. Ordenação Personalizada: Implemente um algoritmo que ordene um array de objetos com base em um critério personalizado (por exemplo, ordem alfabética de strings ou ordenação numérica).

import java.util.Arrays;

public class exercicio01 {
    public static void main(String[] args) {
        
        String[] nomes = { "Caio", "Anastacia", "Bernardo", "Antonia" };

        System.out.println("antes da ordenacao:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        Arrays.sort(nomes);

        System.out.println("\ndepois a ordenacao:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
