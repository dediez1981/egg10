
import entidades.Perro.ListaPerros;
import entidades.Perro.Perro;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaPerros listaPerros = new ListaPerros();

        while (true) {
            System.out.print("Ingrese la raza del perro (o 'salir' para terminar): ");
            String raza = scanner.nextLine();

            if (raza.equals("salir")) {
                break;
            }

            Perro perro = new Perro(raza);
            listaPerros.agregarPerro(perro);
        }

        System.out.println("Perros guardados:");
        for (Perro perro : listaPerros.getPerros()) {
            System.out.println(perro.getRaza());
        }
    }
}