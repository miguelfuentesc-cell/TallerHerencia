package punto2.modelo;

public class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void calcularBono() {
        System.out.println("Bono: " + salario * 0.05);
    }
}