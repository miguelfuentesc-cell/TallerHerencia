package punto1.modelo;

public class Estudiante extends Persona {
    private double nota;

    public Estudiante(String nombre, double nota) {
        super(nombre);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }
}