import java.util.Scanner;
public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double compra;
        double totalPagar;

        System.out.println("ingrese el valor de la compra ");
        compra = sc.nextDouble();

        if (compra > 200000) {
            totalPagar = compra - (compra * 0.10);
        } else {
            totalPagar = compra;
        }

        System.out.println("El valor a pagar es: " + totalPagar);
    }
}
