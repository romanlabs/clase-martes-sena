import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int horastrabajadas;
        double valorHoras;
        double desSalud;
        double desPension;
        double salrioNeto;
        double salariobruto;
        double suma;


        System.out.println("Ingrese las horas trabajadas: ");
        horastrabajadas = sc.nextInt();
        System.out.println("Ingrese el valor por hora: ");
        valorHoras = sc.nextDouble();

        salariobruto = horastrabajadas * valorHoras;
        
        desSalud = salariobruto * 0.04;
        desPension = salariobruto * 0.04;

        suma = desPension + desSalud ;



        salrioNeto = salariobruto - suma ;

        System.out.println("salrio bruto: "+ salariobruto + "\ndescuento de salud(4%): " + desSalud + 
        "\ndescuento de pensión(4%): " + desPension + "\nsalrio neto: " + salrioNeto);
        

        

        
    }

}
