//5. Operações de Conjunto: Escreva funções que realizem operações 
    //de união, interseção e diferença entre dois arrays.
 
    import java.util.Arrays;
    import java.util.HashSet;
    import java.util.Scanner;
    import java.util.Set;
    
    public class exercicio05 {
    
        // funcao para união
        public static int[] uniao(int[] array1, int[] array2) {
            Set<Integer> conjunto = new HashSet<>();
            for (int num : array1) {
                conjunto.add(num);
            }
            for (int num : array2) {
                conjunto.add(num);
            }
            int[] resultado = new int[conjunto.size()];
            int i = 0;
            for (int num : conjunto) {
                resultado[i++] = num;
            }
            return resultado;
        }
    
        // funcao para interseção
        public static int[] intersecao(int[] array1, int[] array2) {
            Set<Integer> conjunto1 = new HashSet<>();
            for (int num : array1) {
                conjunto1.add(num);
            }
            Set<Integer> conjunto2 = new HashSet<>();
            for (int num : array2) {
                if (conjunto1.contains(num)) {
                    conjunto2.add(num);
                }
            }
            int[] resultado = new int[conjunto2.size()];
            int i = 0;
            for (int num : conjunto2) {
                resultado[i++] = num;
            }
            return resultado;
        }
    
        // funcao para diferença de dois arrays
        public static int[] diferenca(int[] array1, int[] array2) {
            Set<Integer> conjunto = new HashSet<>();
            for (int num : array1) {
                conjunto.add(num);
            }
            for (int num : array2) {
                conjunto.remove(num);
            }
            int[] resultado = new int[conjunto.size()];
            int i = 0;
            for (int num : conjunto) {
                resultado[i++] = num;
            }
            return resultado;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("digite a quantidade de numeros do array");
            int tamanho1 = sc.nextInt();
            int[] array1 = new int[tamanho1];
            System.out.println("Digite " + tamanho1 + " numeros do primeiro array ");
            for (int i = 0; i < tamanho1; i++) {
                array1[i] = sc.nextInt();
            }
    
            System.out.println("digite a quantidade de numeros do segundo array ");
            int tamanho2 = sc.nextInt();
            int[] array2 = new int[tamanho2];
            System.out.println("digite " + tamanho2 + " quantidade de numeros do segundo array:");
            for (int i = 0; i < tamanho2; i++) {
                array2[i] = sc.nextInt();
            }
    
            int[] uniaoResultado = uniao(array1, array2);
            int[] intersecaoResultado = intersecao(array1, array2);
            int[] diferencaResultado = diferenca(array1, array2);
    
            System.out.println("uniao: " + Arrays.toString(uniaoResultado));
            System.out.println("intersecao: " + Arrays.toString(intersecaoResultado));
            System.out.println("diferenca (array1 - array2): " + Arrays.toString(diferencaResultado));
    
            sc.close();
        }
    }
    