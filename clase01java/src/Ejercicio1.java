import java.util.Scanner;

public class Ejercicio1 {

    public static boolean isPar(int n){
        return n%2 == 0;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un numero: ");
        int n = scan.nextInt();
        int i = 0;
        while (i<n){
            if (isPar(i)){
                System.out.println(i);
            }
            i++;
        }

        scan.close();

    }
}
