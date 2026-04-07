package punto1;

import punto1.servicio.SistemaAcademico;
import java.util.Scanner;

public class MainPunto1 {

    public static void main(String[] args) {
        SistemaAcademico sistema = new SistemaAcademico();
        Scanner sc = new Scanner(System.in);

        sistema.agregarEstudiante("Luis", 4.5);
        sistema.agregarEstudiante("Ana", 3.8);

        sistema.mostrarEstudiantes();
    }
}