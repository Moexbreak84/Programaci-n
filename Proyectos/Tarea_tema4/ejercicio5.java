public class ejercicio5 {
    public static void main(String[] args) {
        int[] numeros = new int[9];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Metodos.leerEntero("Introduce los numeros que deseas multiplicar por 2");
            numeros[i] = numeros[i] * 2;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("estos son los numeros multiplicados por 2 " + numeros[i]);
        }
    }
}
