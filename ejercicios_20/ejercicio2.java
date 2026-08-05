import java.util.Scanner;
public class ejercicio2 {
    public static void main(String[] args) {
        System.out.println("LA TIENDA");
        Scanner sc = new Scanner(System.in);
        float a;
        float b;
        float c;
        float valorTotal;
        float valorSinIva;
        float valorIva;

        
        System.out.println("ingrese el valor de el producto a: ");
        a = sc.nextInt();

        System.out.println("ingrese el valor de el producto b: ");
        b = sc.nextInt();

        System.out.println("ingrese el valor de el producto c: ");
        c = sc.nextInt();

        
        valorSinIva = a + b + c;
        valorIva = valorSinIva * 0.19f;
        valorTotal = valorIva + valorSinIva ;

        System.out.println("El valor sin iva es: "+ valorSinIva);
        System.out.println("El valor del IVA es: "+ valorIva);
        System.out.println("Valor total: "+ valorTotal);
    }
}
