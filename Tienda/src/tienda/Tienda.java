package tienda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Tienda {
    private Map<String, Double> productos = new HashMap<>();

    public void agregarProducto(String nombre, double precio) {
        productos.put(nombre, precio);
    }

    public void modificarPrecio(String nombre, double precio) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, precio);
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void eliminarProducto(String nombre) {
        if (productos.containsKey(nombre)) {
            productos.remove(nombre);
        } else {
            System.out.println("El producto no existe en la tienda.");
        }
    }

    public void mostrarProductos() {
        if (productos.isEmpty()) {
            System.out.println("La tienda no tiene productos.");
        } else {
            System.out.println("Productos en la tienda:");
            for (Map.Entry<String, Double> producto : productos.entrySet()) {
                System.out.println(producto.getKey() + " - " + producto.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Tienda tienda = new Tienda();
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar un producto");
            System.out.println("2. Modificar el precio de un producto");
            System.out.println("3. Eliminar un producto");
            System.out.println("4. Mostrar los productos de la tienda");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    double precio = scanner.nextDouble();
                    scanner.nextLine();
                    tienda.agregarProducto(nombre, precio);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto: ");
                    nombre = scanner.nextLine();
                    System.out.print("Ingrese el nuevo precio del producto: ");
                    precio = scanner.nextDouble();
                    scanner.nextLine();
                    tienda.modificarPrecio(nombre, precio);
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto: ");
                    nombre = scanner.nextLine();
                    tienda.eliminarProducto(nombre);
                    break;
                case 4:
                    tienda.mostrarProductos();
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }

            System.out.println();
        }
    }
}