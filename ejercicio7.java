import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.println("Digite la edad: ");
        edad = sc.nextInt();

        if (edad < 0){
            System.out.println("dato incorrecto");
        }
        else if(edad <= 14){
            System.out.println("Niño");
        }
        else if(edad >= 15 && edad <= 18){
            System.out.println("Adolescente");
        }
        else if(edad >= 19 && edad <=60){
            System.out.println("Adulto");
        }
        else{
            System.out.println("Adulto mayor");
        }
        sc.close();
    }    
}
