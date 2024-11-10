import aguadulce.Dado;

public class App {
    public static void main(String[] args) throws Exception {
        Dado miDado = new Dado(12);
        String resultado;
        for (int i = 0; i < 20; i++) {
            resultado = miDado.lanzar();
            System.out.println(resultado);
        }
    }
}
