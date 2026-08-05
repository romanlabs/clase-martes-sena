
package Logica;

public class mascota {
    String nombre;
    String especie;
    int edad;
    double peso;
    String propietario;

    public mascota(String nombre, String especie, int edad, double peso, String propietario){
        this.nombre = nombre;
        this.especie = especie;
        this.propietario = propietario;

        if(edad < 0){
            System.out.println("Edad invalida, no puede ser negativa, se pone en 0");
            this.edad = 0;
        } else {
            this.edad = edad;
        }

        if(peso < 0){
            System.out.println("Peso invalido, no puede ser negativo, se pone en 0");
            this.peso = 0;
        } else {
            this.peso = peso;
        }
    }

    public void registrarConsulta(String motivo){
        System.out.println("Consulta registrada para "+nombre+" - Motivo: "+motivo);
    }

    public void mostrar(){
        System.out.println("Mascota: "+nombre+"\nEspecie: "+especie+"\nEdad: "+edad+
                "\nPeso: "+peso+"\nPropietario: "+propietario);
    }

}
