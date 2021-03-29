import java.util.Scanner;

public class Ejercicio5 {

    public static boolean naturalCorrecto(int numero,int m, int d) {

        for (int i=0; i<numero;i++ ){

        }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese cantidad de numeros naturales: ");
        int n = scan.nextInt();
        System.out.println("Ingrese cantidad que al menos se deba repetir del digito:");
        int m = scan.nextInt();
        System.out.println("Ingrese el digito que debe aparecer:");
        int d = scan.nextInt();

        for(int i=0;i<n;i++) {

            i++;
        }

        scan.close();

    }

}
