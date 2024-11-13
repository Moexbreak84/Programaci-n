import aguadulce.Dado;

public class R1_Dado {
    public static void main(String[] args) throws Exception {
        Dado miDado = new Dado(6);
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
        } while (acumulador < 2);
        System.out.println("numero de lanzamientos " + miDado.getNumeroLanzamientos());
    }
}
