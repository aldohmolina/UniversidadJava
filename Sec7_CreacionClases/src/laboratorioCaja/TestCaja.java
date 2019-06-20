package laboratorioCaja;

import java.util.Scanner;

public class TestCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(10,5,10);
        Caja caja2 = new Caja();
        Scanner getdatos = new Scanner(System.in);

        System.out.print("Ingrese Ancho de caja2: ");
        caja2.ancho = Integer.parseInt(getdatos.nextLine());
        System.out.print("Ingrese Largo de caja2: ");
        caja2.largo = Integer.parseInt(getdatos.nextLine());
        System.out.print("Ingrese Alto de caja2: ");
        caja2.alto = Integer.parseInt(getdatos.nextLine());

        System.out.println("Volumen de la caja es: " + caja1.volumen());
        System.out.println("Volumen de la caja2 es: " + caja2.volumen());
    }
}
