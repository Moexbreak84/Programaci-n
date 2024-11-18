import aguadulce.Bombo;
import java.util.Scanner;

public class ejercicio1 {
    public static void Bombo1() {
        Scanner sc = new Scanner(System.in);
        Bombo miBombo = new Bombo(30);
        int numero1, numero2, numero3, numero4, numero5, bola_fuera;

        System.out.println("introduce el primer numero ");
        numero1 = sc.nextInt();
        System.out.println("introduce el segundo numero ");
        numero2 = sc.nextInt();
        System.out.println("introduce el tercer numero ");
        numero3 = sc.nextInt();
        System.out.println("introduce el cuarto numero ");
        numero4 = sc.nextInt();
        System.out.println("introduce el quinto numero ");
        numero5 = sc.nextInt();

        miBombo.extraerBola();
        bola_fuera = miBombo.extraerBola();
        System.out.println(miBombo.getCapacidad());
        System.out.println("los numeros salidos " + bola_fuera);
        switch (bola_fuera) {
            case 1:
                numero1 = bola_fuera;
                System.out.println(numero1);
            case 2:
                numero2 = bola_fuera;
                System.out.println(numero2);
            case 3:
                numero3 = bola_fuera;
                System.out.println(numero3);
            case 4:
                numero4 = bola_fuera;
                System.out.println(numero4);
            case 5:
                numero5 = bola_fuera;
                System.out.println(numero5);
                break;

        }
        System.out.println("ya han salido mis numeros");
        sc.close();
    }
}
