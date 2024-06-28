import java.util.Scanner;

public class exercicio03 {

    // 3. Média e Desvio Padrão: Escreva um programa que calcule a média
    // e o desvio padrão de um array de números inteiros ou de ponto flutuante.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("digite a quantidade de inteiro do array:");
        int tamanho = sc.nextInt();

        double[] numeros = new double[tamanho];
        System.out.println("digite " + tamanho + " numeros:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = sc.nextDouble();
        }

        double soma = 0;
        for (double num : numeros) {
            soma += num;
        }
        double media = soma / tamanho;

        double somaQuadrado = 0;
        for (double num : numeros) {
            somaQuadrado += Math.pow(num - media, 2);
        }
        double desvioPadrao = Math.sqrt(somaQuadrado / tamanho);

        System.out.println("media: " + media);
        System.out.println("desvio padrao: " + desvioPadrao);

        sc.close();
    }
}
