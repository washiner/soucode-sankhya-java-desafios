

    //4. Pesquisa em Matriz: Implemente um método para pesquisar
    //um elemento em uma matriz multidimensional e retorne sua
    //posição ou um indicativo de não encontrado.

    import java.util.Scanner;

    public class exercicio04 {
    
        public static String pesquisaElemento(int[][] matriz, int elemento) {
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (matriz[i][j] == elemento) {
                        return "numero encontrado na Linha, Coluna: (" + i + ", " + j + ")";
                    }
                }
            }
            return "nao existe na matriz";
        }
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
    
            System.out.println("digite um numero que exista na matriz");
            int elemento = sc.nextInt();
    
            String resultado = pesquisaElemento(matriz, elemento);
            System.out.println(resultado);
    
            sc.close();
        }
    }
    