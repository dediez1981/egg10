
package ejercicio_1;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio_1 {
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
    }
}