import aguadulce.Bombo;
import java.util.Scanner;

public class ejercicio1 {
    public static void Bombo1() {
        Scanner sc = new Scanner(System.in);
        Bombo miBombo = new Bombo();
        int numero1, numero2, numero3, numero4, numero5, bola_fuera, eleccion = 0;
        boolean leido = false;
        while (true) {
            try {
                mostrarMenu();
                eleccion = sc.nextInt();
                System.out.println("elige el tipo de bombo");
                if (eleccion == 0) {
                    System.out.println("Empieza el juego");
                } else if (eleccion == 1 || eleccion == 2 || eleccion == 3 || eleccion == 4) {
                    System.out.println();
                    leido = true;
                } else {
                    System.out.println("El bombo elejido no es valido");
                }
            } catch (Exception e) {
                System.out.println("Error");
                sc.next();
            }
            while (eleccion != 0) {
                System.out.println("hola");
            }

        }

    }

    public static void mostrarMenu() {
        System.out.println("BOMBO\n" +
                "-----------\n" +
                "Elije una opcion\n1.-30 - Bolas\n2.-50 - Bolas\n3.-70 - Bolas\n4.-90 - Bolas\n0.Salir");
    }
}
