package punto2.servicio;

import punto2.modelo.*;

public class SistemaVentas {

    private Vendedor vendedor;

    public SistemaVentas() {
        vendedor = new Vendedor("Carlos", 2000);
    }

    public void registrarVentasDemo() {
        vendedor.agregarVenta(new Casa(100000));
        vendedor.agregarVenta(new Apartamento(80000));
        vendedor.agregarVenta(new Lote(50000));
    }

    public void mostrarResultados() {
        System.out.println("Total comisiones: " + vendedor.totalComision());
        vendedor.calcularBono();
    }
}