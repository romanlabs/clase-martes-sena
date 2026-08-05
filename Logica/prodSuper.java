
package Logica;

public class prodSuper {
    String nombreProducto;
    double precio;
    int cantidadDisponible;

    public prodSuper(String nombreProducto, double precio, int cantidadDisponible) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }
    
    public double valorTotal(){
        return  precio * cantidadDisponible;
    
    }
    
    public void mostrar(){
        System.out.println("Nombre registrado: "+ nombreProducto);
        System.out.println("Precio registrado: "+ precio);
        System.out.println("cantidad registrada: "+ cantidadDisponible);
        System.out.println("Valor Tolat: "+ valorTotal());
    }
    
}
