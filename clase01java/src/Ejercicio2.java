import java.util.Scanner;

public class Ejercicio2 {

    public static boolean divisible(int a, int b) {
        return a%b==0;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el primer numero: ");
        int n = scan.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        int m = scan.nextInt();

        int aux = n;
        while (aux<m) {
            if(divisible(m,aux)){
                System.out.println("Numero multiplo= " + aux);
            }
            aux++;
        }
        scan.close();
    }
}
