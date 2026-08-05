import java.util.Scanner;
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double parcial1;
        double parcial2;
        double parcial3;
        double notaDefinitiva;


        System.out.println("Ingrese la nota del parcial 1 que equivale al 30%: ");
        parcial1 = sc.nextDouble();

        
        System.out.println("Ingrese la nota del parcial 2 que equivale al 30%: ");
        parcial2 = sc.nextDouble();

        
        System.out.println("Ingrese la nota del parcial 3 que equivale al 40%: ");
        parcial3 = sc.nextDouble();

        parcial1 = parcial1 * 0.30;
        parcial2 = parcial2 * 0.30;
        parcial3 = parcial3 * 0.40;

        notaDefinitiva = parcial1 + parcial2 + parcial3; 
        System.out.println("La nota definitiva es: " + notaDefinitiva);

    }
}
