
    //8. Histograma de Frequência: Construa um histograma 
    //de frequência a partir de um array de números, mostrando 
    //quantas vezes cada número aparece.
 
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;
    
    public class exercicio08 {
    
        public static Map<Integer, Integer> Histograma(int[] array) {
            Map<Integer, Integer> histograma = new HashMap<>();
    
            for (int num : array) {
                histograma.put(num, histograma.getOrDefault(num, 0) + 1);
            }
    
            return histograma;
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.println("digite o tamanho do array ");
            int tamanho = sc.nextInt();
            int[] array = new int[tamanho];
            System.out.println("Digite " + tamanho + " quantidade de numeros do array ");
            for (int i = 0; i < tamanho; i++) {
                array[i] = sc.nextInt();
            }
    
            Map<Integer, Integer> histograma = Histograma(array);
            System.out.println("historico de repeticao no array ");
            for (Map.Entry<Integer, Integer> entry : histograma.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
    
            sc.close();
        }
    }
    