public class ejercicio13 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Metodos.leerEntero("introduce los valores de la matriz " + i + " " + j);
                System.out.println();
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("estos son los valores de la matriz ");
    }

}
