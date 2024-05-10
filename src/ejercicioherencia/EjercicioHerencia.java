
package ejercicioherencia;

public class EjercicioHerencia {

    public static void main(String[] args) {
        persona persona1=new persona("Juan", 30);
        persona1.mostrarDatos();
        
        empleado empleado1=new empleado(1300000, "Maria", 28);
        empleado1.mostrarDatos();
        empleado1.mostrarSalario();
    }
    
}
