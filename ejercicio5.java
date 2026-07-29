import java.util.Scanner;
public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c; 
        int f;
        double k;
        System.out.println("ingrese el la temperatura en grados Celsius: ");
        c = sc.nextInt();
        f = (c* 9/5)+32; 
        k = c + 273.15;

        System.out.println("el grado celsius a f es: " + f + "\n el grado  celsius a kelvin: " + k);
        
        
    }
}
