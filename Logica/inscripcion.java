
package Logica;

public class inscripcion {
    estudianteUniversidad estudiante;
    asignatura asignatura;

    public inscripcion(estudianteUniversidad estudiante, asignatura asignatura){
        this.estudiante = estudiante;
        this.asignatura = asignatura;
    }

    public void mostrar(){
        System.out.println("Estudiante: "+estudiante.nombre+" - Codigo: "+estudiante.codigo);
        System.out.println("Asignatura: "+asignatura.nombre+" - Creditos: "+asignatura.creditos);
    }

}
