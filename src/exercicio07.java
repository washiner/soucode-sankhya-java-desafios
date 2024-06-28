
//7. Rotacionar um Array: Crie uma função para rotacionar os
//elementos de um array para a esquerda ou para a direita por um número específico de posições.

import java.util.Scanner;

public class exercicio07 {

    public static void rotacionarEsquerda(int[] array, int posicoes) {
        int n = array.length;
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = array[(i + posicoes) % n];
        }
        System.arraycopy(resultado, 0, array, 0, n);
    }

    public static void rotacionarDireita(int[] array, int posicoes) {
        int n = array.length;
        int[] resultado = new int[n];
        for (int i = 0; i < n; i++) {
            resultado[i] = array[(i - posicoes + n) % n];
        }
        System.arraycopy(resultado, 0, array, 0, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero inteiro para tamanho do array ");
        int tamanho = sc.nextInt();
        int[] array = new int[tamanho];
        System.out.print("digite " + tamanho + " quantidade para o array");
        for (int i = 0; i < tamanho; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println("digite 'E' para rotacionar para a esquerda ou 'D' para rotacionar para a direita ");
        char direcao = sc.next().charAt(0);
        System.out.println("digite quantidade de posicoes para rotacionar:");
        int posicoes = sc.nextInt();

        if (direcao == 'E' || direcao == 'e') {
            rotacionarEsquerda(array, posicoes);
        } else if (direcao == 'D' || direcao == 'd') {
            rotacionarDireita(array, posicoes);
        } else {
            System.out.println("nao existe esta direcao");
            sc.close();
            return;
        }

        System.out.println("array rotacionado ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
