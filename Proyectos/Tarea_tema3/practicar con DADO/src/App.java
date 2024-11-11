import aguadulce.Dado;

public class APP {
    public static void main(String[] args) throws Exception {
        Dado miDado = new Dado(6);
        String resultado;
        for (int i = 0; i < 20; i++) {
            resultado = miDado.lanzar();
            System.out.println(resultado);
        }
    }
}
