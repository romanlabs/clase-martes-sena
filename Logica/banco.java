
package Logica;

public class banco {
    int numeroCuenta;
    String nombreTitular;
    double saldo;

    public banco(int numeroCuenta, String nombreTitular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void depositar(double monto){
        this.saldo = this.saldo + monto;
    }

    public void retirar(double monto){
        if (monto > this.saldo) {
            System.out.println("Fondos insuficientes para retirar " + monto);
        } else {
            this.saldo = this.saldo - monto;
        }
    }

    public void mostrar(){
        System.out.println("el usurario "+nombreTitular+"\ncon numero de cuenta "+numeroCuenta+
                "\nsaldo actual: "+saldo);

    }
    
    
    
}
