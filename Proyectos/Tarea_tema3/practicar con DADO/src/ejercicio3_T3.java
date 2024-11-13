import aguadulce.Dado;

public class ejercicio3_T3 {
    public static void main(String[] args) {
        Dado miDado = new Dado();
        String resultado;

        int acumulador = 0;
        do {
            resultado = miDado.lanzar();
            System.out.println(resultado);
            switch (resultado) {
                case SEIS:
                    resultado = resultado;
                    break;

                default:
                    break;
            }
        } while (acumulador < 2);

        System.out.println("numero de lanzamientos " + miDado.getNumeroLanzamientos());
        for (int i = 1; i <= miDado.getNumeroCaras(); i++) {
            System.out.println("numero de veces de la cara " + i + ": " + miDado.getNumeroVecesCara(i));
        }

    }

}
