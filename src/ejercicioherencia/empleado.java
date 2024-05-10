
package ejercicioherencia;

public class empleado extends persona {
    private double salario;

    public empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    
    public void mostrarSalario() {
        System.out.println("salario: " +salario);
    }
    
}
