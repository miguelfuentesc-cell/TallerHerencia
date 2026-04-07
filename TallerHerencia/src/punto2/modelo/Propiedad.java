package punto2.modelo;

public abstract class Propiedad implements Comisionable {
    protected double precio;

    public Propiedad(double precio) {
        this.precio = precio;
    }
}