
package Logica;

public class plato {
    String nombre;
    double precio;

    public plato(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrar(){
        System.out.println("Plato: "+nombre+" - Precio: "+precio);
    }

}
