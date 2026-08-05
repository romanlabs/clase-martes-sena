
package Logica;

public class vehiculo {
    String placa;
    String marca;
    String modelo;
    double combustible;
    boolean encendido;

    public vehiculo(String placa, String marca, String modelo, double combustible){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.combustible = combustible;
        this.encendido = false;
    }

    public void encender(){
        if(combustible <= 0){
            System.out.println("No se puede encender, no hay combustible");
        } else {
            encendido = true;
            System.out.println("El vehiculo esta encendido");
        }
    }

    public void apagar(){
        encendido = false;
        System.out.println("El vehiculo esta apagado");
    }

    public void recorrer(double km){
        if(!encendido){
            System.out.println("El vehiculo esta apagado, enciendalo primero");
        } else {
            double gasto = km * 0.1;
            if(gasto > combustible){
                System.out.println("No hay combustible suficiente para ese recorrido");
            } else {
                combustible = combustible - gasto;
                System.out.println("Se recorrieron "+km+" km, combustible restante: "+combustible);
            }
        }
    }

    public void mostrar(){
        System.out.println("Placa: "+placa+"\nMarca: "+marca+"\nModelo: "+modelo+
                "\nCombustible: "+combustible+"\nEncendido: "+encendido);
    }

}
