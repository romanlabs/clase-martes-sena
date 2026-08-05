
package Logica;

public class productoTienda {
    String nombre;
    double precio;
    int cantidad;

    public productoTienda(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double subtotal(){
        return precio * cantidad;
    }

}
