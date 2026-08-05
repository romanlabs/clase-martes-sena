import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
    
        System.out.println("Escriba un numero: ");
        a = sc.nextDouble();

        if (a > 0){
            System.out.println("El número es positivo");
        }
        
        else if (a == 0){
            System.out.println("Su número es 0");   
        }
        else if (a < 0){
            System.out.println("el número es negativo");
        }
        
        sc.close();

    }    
}
