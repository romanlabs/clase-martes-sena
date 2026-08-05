import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner md = new Scanner(System.in);
        int base;
        int altura;
        int area;
        int perimetro;

        System.out.println("Digite la base de el rectángulo: " );
        base = md.nextInt();
        System.out.println("Digite la altura de el rectángulo: ");
        altura = md.nextInt();

        area = base*altura;
        System.out.println("El área de el rectangulo es: " + area);

        perimetro = 2*area;
        System.out.println("El perímetro de el rectangulo es: " + perimetro);

        






    }
}