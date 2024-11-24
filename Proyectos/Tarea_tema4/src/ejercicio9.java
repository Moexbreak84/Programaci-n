import aguadulce.*;

public class ejercicio9 {
    public static void main(String[] args) {
        Dado mi_Dado = new Dado();
        int uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;
        String resultado;
        for (int i = 0; i < 30; i++) {
            resultado = mi_Dado.lanzar();
            System.out.println(resultado);
            if (resultado.contentEquals("SEIS")) {
                seis++;
            } else if (resultado.contentEquals("CINCO")) {
                cinco++;
            } else if (resultado.contentEquals("CUATRO")) {
                cuatro++;
            } else if (resultado.contentEquals("TRES")) {
                tres++;
            } else if (resultado.contentEquals("DOS")) {
                dos++;
            } else if (resultado.contentEquals("UNO")) {
                uno++;
            } else {

            }

        }
        System.out.println("Ha salido " + uno + " veces uno " + dos + " veces dos " + tres + " veces tres " + cuatro
                + " veces cuatro " + cinco + " veces cinco " + seis + " veces seis");
    }
}
