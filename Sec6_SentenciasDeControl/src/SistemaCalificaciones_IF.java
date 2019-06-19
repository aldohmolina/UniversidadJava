import java.util.Scanner;

public class SistemaCalificaciones_IF {
    public static void main(String[] args) {
        double calificacion;
        Scanner getCalificacion = new Scanner(System.in);

        System.out.print("Proporciona un valor entre 0 y 10: ");
        calificacion = Double.parseDouble(getCalificacion.nextLine());

        if (calificacion <= 10 && calificacion >= 9)
            System.out.println("A");
        else if (calificacion < 9 && calificacion >= 8)
            System.out.println("B");
        else if(calificacion < 8 && calificacion >= 7)
            System.out.println("C");
        else if (calificacion < 7 && calificacion >= 6)
            System.out.println("D");
        else if (calificacion < 6 && calificacion >= 0)
            System.out.println("F");
        else
            System.out.println("Valor desconocido");


    }
}
