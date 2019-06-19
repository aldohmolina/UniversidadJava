import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {

        //Declaracion de variables
        int numero1, numero2;
        Scanner getDatos = new Scanner(System.in);

        System.out.print("Proporciona el numero1:");
        numero1 = Integer.parseInt(getDatos.nextLine());
        System.out.print("Proporciona el numero2:");
        numero2 = Integer.parseInt(getDatos.nextLine());
        String resultado = (numero1 > numero2)? ""+numero1: ""+numero2;
        System.out.println("El numero mayor es:\n" + resultado);


    }

}
