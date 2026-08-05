import java.util.Scanner;
public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[30];
        double suma = 0;
        int aprobados = 0;
        int reprobados = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digita la nota del estudiante " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i];

            if (notas[i] >= 3.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        double mayor = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double promedio = suma / notas.length;

        System.out.println("Nota mayor: " + mayor);
        System.out.println("Nota menor: " + menor);
        System.out.println("Promedio: " + promedio);
        System.out.println("Cantidad de aprobados: " + aprobados);
        System.out.println("Cantidad de reprobados: " + reprobados);
    }
}
