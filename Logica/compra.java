
package Logica;

public class compra {
    int numero;
    String fecha;
    cliente clienteCompra;
    productoTienda[] productos;

    public compra(int numero, String fecha, cliente clienteCompra, productoTienda[] productos){
        this.numero = numero;
        this.fecha = fecha;
        this.clienteCompra = clienteCompra;
        this.productos = productos;
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < productos.length; i++){
            total = total + productos[i].subtotal();
        }
        return total;
    }

    public void mostrar(){
        System.out.println("Compra N: "+numero+" - Fecha: "+fecha);
        System.out.println("Cliente: "+clienteCompra.nombre+" - "+clienteCompra.correo);
        for(int i = 0; i < productos.length; i++){
            System.out.println("Producto: "+productos[i].nombre+" x"+productos[i].cantidad+
                    " = "+productos[i].subtotal());
        }
        System.out.println("Total a pagar: "+calcularTotal());
    }

}
