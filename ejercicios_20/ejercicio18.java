import java.util.Scanner;
public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[20];
        int suma = 0;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digita el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            suma += numeros[i];

            if (numeros[i] % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        double promedio = suma / (double) numeros.length;

        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de pares: " + pares);
        System.out.println("Cantidad de impares: " + impares);
    }
}
