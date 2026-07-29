import java.util.Scanner;
public class ejercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[25];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Digita el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("Digita el número a buscar: ");
        int buscado = sc.nextInt();

        boolean existe = false;
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == buscado) {
                existe = true;
                posicion = i;
                break;
            }
        }

        if (existe) {
            System.out.println("El número existe en la posición: " + posicion);
        } else {
            System.out.println("El número no existe en el arreglo");
        }
    }
}
