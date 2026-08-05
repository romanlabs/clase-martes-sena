
package Logica;

public class pedido {
    int numero;
    String fecha;
    String cliente;
    plato platoPedido;

    public pedido(int numero, String fecha, String cliente, plato platoPedido){
        this.numero = numero;
        this.fecha = fecha;
        this.cliente = cliente;
        this.platoPedido = platoPedido;
    }

    public void mostrar(){
        System.out.println("Pedido N: "+numero+"\nFecha: "+fecha+"\nCliente: "+cliente);
        platoPedido.mostrar();
    }

}
