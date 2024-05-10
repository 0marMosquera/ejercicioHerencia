
package ejercicioherencia;


public class persona {
    private String nombre;
    private int edad;

    public persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    public void mostrarDatos() {
        System.out.println("nombre: "+ nombre);
        System.out.println("edad: "+ edad);
    }
    
}
