import java.util.Scanner;
public class ejercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digita el número " + i + ": ");
            suma += sc.nextInt();
        }

        double promedio = suma / 10.0;

        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
