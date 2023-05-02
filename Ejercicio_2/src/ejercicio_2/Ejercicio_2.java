
package ejercicio_2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        ArrayList<String> razasPerros = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.print("Ingrese una raza de perro: ");
            String raza = scanner.nextLine();
            razasPerros.add(raza);
            
            System.out.print("¿Desea ingresar otra raza de perro? (s/n): ");
            String opcion = scanner.nextLine();
            if (opcion.equalsIgnoreCase("n")) {
                continuar = false;
            }
        }
        
        System.out.println("Razas de perros ingresadas:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
        
        System.out.print("Ingrese una raza de perro para eliminar de la lista: ");
        String perroEliminar = scanner.nextLine();
        
        Iterator<String> it = razasPerros.iterator();
        while (it.hasNext()) {
            String raza = it.next();
            if (raza.equalsIgnoreCase(perroEliminar)) {
                it.remove();
            }
        }
        
        Collections.sort(razasPerros);
        System.out.println("Lista de razas de perros ordenada:");
        for (String raza : razasPerros) {
            System.out.println(raza);
        }
    }
}