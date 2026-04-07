package punto1.modelo;

public class Docente extends Persona {

    public Docente(String nombre) {
        super(nombre);
    }

    public void enseñar() {
        System.out.println("El docente " + nombre + " está enseñando.");
    }
}