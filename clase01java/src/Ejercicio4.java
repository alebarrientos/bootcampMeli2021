import java.util.Scanner;

public class Ejercicio4 {
    public static boolean esPrimo(int n) {
        return n%1==0 && n%n==0;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        int numero = scan.nextInt();

        int i = 0;
        while (i<numero) {
            if (esPrimo(numero)){
                System.out.println("Es un numero primo= " + i);
            }
            i++;
        }

        scan.close();

    }
}
