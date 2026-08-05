
package Logica;

public class Estudiante {
    
    String nombre;
    int edad;
    int gradoCursa;

    public Estudiante(String nombre, int edad, int gradoCursa) {
        this.nombre = nombre;
        this.edad = edad;
        this.gradoCursa = gradoCursa;
    }

    public void mostrar(){
        System.out.println("El/La estudiante " + this.nombre + " de "+ this.edad + " años que cursa actualmente el grado "
        + this.gradoCursa);
    }
    
    
}
