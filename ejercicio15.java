import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cantidad = 0;
        int suma = 0;
        int numero;

        System.out.println("Digita números (0 para terminar): ");
        numero = sc.nextInt();

        while (numero != 0) {
            suma += numero;
            cantidad++;
            numero = sc.nextInt();
        }

        System.out.println("Cantidad de números: " + cantidad);
        System.out.println("Suma: " + suma);

        if (cantidad > 0) {
            System.out.println("Promedio: " + (suma / (double) cantidad));
        }
    }
}
