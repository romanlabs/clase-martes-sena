import java.util.Scanner;
public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digita el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Los números almacenados son: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
