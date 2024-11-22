public class ejercicio8 {
    public static void main(String[] args) {
        char[] letras = new char[14];
        int acumulador = 0;
        for (int i = 0; i < letras.length; i++) {
            letras[i] = Metodos.leerChar("introduce las letras");
            if (letras[i] == 'A' || letras[i] == 'a') {
                acumulador++;
            }
        }

        System.out.println("Has tenido un total de " + acumulador + " A's");

        /*
         * for (int i = 0; i < letras.length; i++) {
         * if (letras[i] == 'A') {
         * System.out.println("estas son las a y A que hay en el vector " + letras[i]);
         * } else {
         * 
         * }
         * }
         */
    }
}
