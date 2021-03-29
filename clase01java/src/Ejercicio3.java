import java.util.Scanner;

public class Ejercicio3 {

    public static boolean esPrimo(int n) {
        return n%1==0 && n%n==0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese numero a evaluar:");
        int numero = scan.nextInt();
        if (esPrimo(numero)) {
            System.out.println(numero + " Es primo.");
        } else {
            System.out.println(numero + " No es primo.");
        }

        scan.close();

    }
}
