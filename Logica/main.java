package Logica;

public class main {

    public static void main(String[] args) {
        Libro l1 = new Libro();
        l1.titulo = "El hombre mas rico de babilonia";
        l1.autor = "George Samuel Clason";
        l1.numPaginas = 256;
        l1.mostrar();
    //--------------------------------------------=------
        Estudiante e1 = new Estudiante("Andrea",17,9);
        e1.mostrar();
    //-------------------------------------------
        prodSuper p1 = new prodSuper("Arroz", 3200, 30);
        p1.mostrar();
    //----------------------------------------------
        banco b1 = new banco(12345,"Roman",500000);
        b1.mostrar();
        b1.depositar(50000);
        b1.retirar(4500);
        b1.mostrar();
    //----------------------------------------------
        vehiculo v1 = new vehiculo("ABC123","Mazda","3",10);
        v1.mostrar();
        v1.encender();
        v1.recorrer(20);
        v1.apagar();
        v1.mostrar();
    //-----------------------------------------------------
        empleado emp1 = new empleado("Carlos","Vendedor",1300000,10);
        emp1.mostrar();
    //----------------------------------------------
        mascota m1 = new mascota("Firulais","Perro",3,12.5,"Roman");
        m1.mostrar();
        m1.registrarConsulta("Vacunacion anual");
    //------------------------------------
        plato pl1 = new plato("Bandeja paisa", 25000);
        pedido ped1 = new pedido(1,"05/08/2026","Roman", pl1);
        ped1.mostrar();
    //----------------------------------------------
        estudianteUniversidad estU = new estudianteUniversidad("Roman","U001");
        asignatura asig = new asignatura("Programacion",4);
        inscripcion insc = new inscripcion(estU, asig);
        insc.mostrar();
    //--------------------------------------------------
        cliente cli1 = new cliente("Roman","roman@correo.com","123456");
        productoTienda pt1 = new productoTienda("Teclado",80000,1);
        productoTienda pt2 = new productoTienda("Mouse",40000,2);
        productoTienda[] listaProductos = {pt1, pt2};
        compra comp1 = new compra(1,"05/08/2026", cli1, listaProductos);
        comp1.mostrar();
    //----------------------------------------------

    }

}
