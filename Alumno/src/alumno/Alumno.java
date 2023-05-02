package alumno;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumno {
    private String nombre;
    private List<Integer> notas;

    public Alumno(String nombre, List<Integer> notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public double notaFinal() {
        int sum = 0;
        for (int nota : notas) {
            sum += nota;
        }
        return (double) sum / notas.size();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Alumno> alumnos = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el nombre del alumno: ");
            String nombre = input.nextLine();
            List<Integer> notas = new ArrayList<>();
            for (int i = 1; i <= 3; i++) {
                System.out.print("Ingrese la nota " + i + " del alumno: ");
                notas.add(input.nextInt());
                input.nextLine();
            }
            Alumno alumno = new Alumno(nombre, notas);
            alumnos.add(alumno);
            System.out.print("¿Desea ingresar otro alumno? (S/N): ");
            String respuesta = input.nextLine();
            continuar = respuesta.equalsIgnoreCase("S");
        }
        System.out.print("Ingrese el nombre del alumno para calcular su nota final: ");
        String nombreBuscado = input.nextLine();
        boolean encontrado = false;
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                System.out.println("La nota final de " + alumno.getNombre() + " es " + alumno.notaFinal());
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El alumno " + nombreBuscado + " no se encuentra en la lista.");
        }
    }
}