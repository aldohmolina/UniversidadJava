public class PrecedenciaDeOperadores {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int res = -3 + 6 / ++a * 4 - b-- + b;
                 //-3 + 6 / 3 * 4 -3 + 3
                 // -3 + (6/3)*4) - 3 + 3
                 // -3 + 8 -3 + 3
                 // (-3 + 8) - 2 + 3
                 //  (5 - 3) + 2
                 //  2 + 2

                 //   4
        System.out.println(6 / 3);
        System.out.println(2 * 4);
        System.out.println(-3 + 8);
        System.out.println(5 - 3);
        System.out.println(2 + 2);
    }
}
