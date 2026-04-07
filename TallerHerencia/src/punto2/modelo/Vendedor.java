package punto2.modelo;

import java.util.*;

public class Vendedor extends Empleado {

    private List<Propiedad> ventas = new ArrayList<>();

    public Vendedor(String nombre, double salario) {
        super(nombre, salario);
    }

    public void agregarVenta(Propiedad p) {
        ventas.add(p);
    }

    public double totalComision() {
        double total = 0;
        for (Propiedad p : ventas) {
            total += p.calcularComision();
        }
        return total;
    }
}