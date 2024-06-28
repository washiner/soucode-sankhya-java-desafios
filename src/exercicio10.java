
//10. Palíndromos: Verifique se um array de strings
//contém palavras que são palíndromos (palavras que
//se leem da mesma forma de trás para frente).

import java.util.Scanner;

public class exercicio10 {

    public static boolean palindromo(String palavra) {
        int esquerda = 0;
        int direita = palavra.length() - 1;

        while (esquerda < direita) {
            if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }

        return true;
    }

    public static void verificarPalindromos(String[] array) {
        System.out.println("palindromas encontradas:");
        for (String palavra : array) {
            if (palindromo(palavra)) {
                System.out.println(palavra);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o tamanho do array ");
        int tamanho = sc.nextInt();
        sc.nextLine();
        String[] array = new String[tamanho];
        System.out.println("digite " + tamanho + " quantidade de palavras no array ");
        for (int i = 0; i < tamanho; i++) {
            array[i] = sc.nextLine();
        }

        verificarPalindromos(array);

        sc.close();
    }
}
