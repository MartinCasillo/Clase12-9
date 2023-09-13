public class EjemploMatriz {
        // 3 3 6
        // 4 5 7
        // 12 20 8
        // int[][] matriz = new int[3][3];

    public static void main(String[] args){

        int[][] matriz = {{3,3,3},{4,5,7},{12,20,8}};
        mostrarMatriz(matriz);
        System.out.println(algunaFilaTodosImpares(matriz));
        imprimirSoloFila(matriz,1);
    }

    private static void imprimirSoloFila(int[][] matriz, int i){
        for(int j= 0; j< matriz[i].length ;j++){
            System.out.println(matriz[i][j]);
        }
    }

    private static boolean todosElementosImparesPorFila(int[] fila){
        boolean rta = true;
        for (int i = 0; i< fila.length; i++){
            rta = rta && (fila[i]%2)==0;
        }
        return rta;
    }

    public static boolean algunaFilaTodosImpares(int[][] matriz){
        boolean rta = false;
        for(int i = 0; i < matriz.length; i++){
            rta = rta || todosElementosImparesPorFila(matriz[i]);
        }
        return rta;
    }
    public static void mostrarMatriz(int[][] matriz){

        for (int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
