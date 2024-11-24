public class ejercicio11 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][2];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                Metodos.leerEntero("introduce los valores de la matriz " + i + " " + j);
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("estos son los valores de la matriz ");
    }
}
