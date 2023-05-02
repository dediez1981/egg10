package pais;

/**
 *
 * @author Admin
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Pais implements Comparable<Pais> {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Pais)) {
            return false;
        }
        Pais otro = (Pais) obj;
        return nombre.equalsIgnoreCase(otro.getNombre());
    }

    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Pais otro) {
        return nombre.compareToIgnoreCase(otro.getNombre());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Pais> paises = new HashSet<>();
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese un país: ");
            String nombre = scanner.nextLine();
            Pais pais = new Pais(nombre);
            if (paises.contains(pais)) {
                System.out.println("El país ya se encuentra en el conjunto.");
            } else {
                paises.add(pais);
            }
            System.out.print("¿Desea ingresar otro país? (S/N): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("S");
        }
        System.out.println("Todos los países:");
        for (Pais pais : paises) {
            System.out.println(pais.getNombre());
        }
        System.out.println("Conjunto ordenado alfabéticamente:");
        Set<Pais> paisesOrdenados = new TreeSet<>(paises);
        for (Pais pais : paisesOrdenados) {
            System.out.println(pais.getNombre());
        }
        System.out.print("Ingrese un país para eliminar: ");
        String nombre = scanner.nextLine();
        Pais pais = new Pais(nombre);
        Iterator<Pais> iterador = paises.iterator();
        boolean encontrado = false;
        while (iterador.hasNext()) {
            Pais paisActual = iterador.next();
            if (paisActual.equals(pais)) {
                iterador.remove();
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El país fue eliminado del conjunto.");
        } else {
            System.out.println("El país no se encuentra en el conjunto.");
        }
        System.out.println("Conjunto después de eliminar el país:");
        for (Pais paisActual : paises) {
            System.out.println(paisActual.getNombre());
        }
    }
}