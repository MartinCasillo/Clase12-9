public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Recorremos la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int elementoActual = matriz[i][j];

                // Comparamos con el elemento siguiente en la misma fila
                if (j < matriz[i].length - 1) {
                    int elementoSiguiente = matriz[i][j + 1];
                    if (elementoActual == elementoSiguiente) {
                        System.out.println("Elementos iguales en la misma fila en [" + i + "][" + j + "] y [" + i + "][" + (j + 1) + "]");
                    }
                }

                // Comparamos con el elemento siguiente en la misma columna
                if (i < matriz.length - 1) {
                    int elementoSiguiente = matriz[i + 1][j];
                    if (elementoActual == elementoSiguiente) {
                        System.out.println("Elementos iguales en la misma columna en [" + i + "][" + j + "] y [" + (i + 1) + "][" + j + "]");
                    }
                }
            }
        }
    }
}
