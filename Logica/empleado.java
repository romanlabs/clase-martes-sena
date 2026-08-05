
package Logica;

public class empleado {
    String nombre;
    String cargo;
    double salarioBase;
    double horasExtra;

    public empleado(String nombre, String cargo, double salarioBase, double horasExtra){
        this.nombre = nombre;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.horasExtra = horasExtra;
    }

    public double calcularSalarioFinal(){
        double valorHora = salarioBase / 240;
        double valorHoraExtra = valorHora * 1.25;
        return salarioBase + (horasExtra * valorHoraExtra);
    }

    public void mostrar(){
        System.out.println("Empleado: "+nombre+"\nCargo: "+cargo+"\nSalario base: "+salarioBase+
                "\nHoras extra: "+horasExtra+"\nSalario final: "+calcularSalarioFinal());
    }

}
