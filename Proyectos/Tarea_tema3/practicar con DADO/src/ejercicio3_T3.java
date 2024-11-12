import aguadulce.Dado;

public class ejercicio3_T3 {
    public static void main(String[] args) {
        Dado miDado = new Dado();
        String resultado;

        int acumulador = 0;
        do {
            resultado = miDado.lanzar();
            System.out.println(resultado);
            // if(resultado == SEIS){}
            if (resultado.contentEquals("SEIS")) {
                acumulador = acumulador + 1;
                // acumulador++;
                // acumulador +=1;
            } else {
                acumulador = 0;

            }
            if (resultado.contentEquals("cinco")) {
                acumulador = acumulador + 1;
                // acumulador++;
                // acumulador +=1;
            } else {
                acumulador = 0;

            }
        } while (acumulador < 2);

        System.out.println("numero de lanzamientos " + miDado.getNumeroLanzamientos());
        for (int i = 1; i <= miDado.getNumeroCaras(); i++) {
            System.out.println("numero de veces de la cara " + i + ": " + miDado.getNumeroVecesCara(i));
        }

    }

}
