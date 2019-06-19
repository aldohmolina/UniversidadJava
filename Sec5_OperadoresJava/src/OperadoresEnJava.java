import java.util.Scanner;

public class OperadoresEnJava {

    public static void main(String[] args) {
        int alto;
        int ancho;

        Scanner getDato = new Scanner(System.in);

        //Obtener Datos
        System.out.print("Proporcione el alto: ");
        alto = Integer.parseInt(getDato.nextLine());
        System.out.print("Proporcione el ancho: ");
        ancho = Integer.parseInt(getDato.nextLine());

        //Calcular Area y Perimetro
        System.out.println("Area: "+ (alto*ancho));
        System.out.println("Perimetro: " + ((alto + ancho) * 2));
    }
}
