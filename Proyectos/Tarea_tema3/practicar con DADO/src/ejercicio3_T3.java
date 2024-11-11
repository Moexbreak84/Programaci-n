import aguadulce.Dado;

public class ejercicio3_T3 {
    public static void main(String[] args) {
        Dado miDado = new Dado();
        String resultado;
        int acumulador = 0;
        do {
            resultado = miDado.lanzar();
            System.out.print(resultado);
            // if(resultado == SEIS){}
            if (resultado.contentEquals("SEISSEIS")) {
                acumulador = acumulador + 1;
                // acumulador++;
                // acumulador +=1;
            } else if (resultado.contentEquals("CINCOCINCO")) {
                acumulador = acumulador + 1;

            } else if (resultado.contentEquals("CUATROCUATRO")) {
                acumulador = acumulador + 1;

            } else if (resultado.contentEquals("TRESTRES")) {
                acumulador = acumulador + 1;

            } else if (resultado.contentEquals("DOSDOS")) {
                acumulador = acumulador + 1;

            } else if (resultado.contentEquals("UNOUNO")) {
                acumulador = acumulador + 1;

            } else {
                acumulador = 0;
            }
        } while (acumulador < 1);

    }

}
