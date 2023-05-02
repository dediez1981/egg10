package pelicula;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Pelicula {
    private String titulo;
    private String director;
    private double duracion;

    public Pelicula(String titulo, String director, double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getDuracion() {
        return duracion;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pelicula> peliculas = new ArrayList<>();
        boolean continuar = true;
        while (continuar) {
            System.out.print("Ingrese el título de la película: ");
            String titulo = scanner.nextLine();
            System.out.print("Ingrese el director de la película: ");
            String director = scanner.nextLine();
            System.out.print("Ingrese la duración de la película en horas: ");
            double duracion = scanner.nextDouble();
            scanner.nextLine(); // para consumir el salto de línea
            Pelicula pelicula = new Pelicula(titulo, director, duracion);
            peliculas.add(pelicula);
            System.out.print("¿Desea ingresar otra película? (S/N): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("S");
        }
        System.out.println("Todas las películas:");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion() + " horas");
        }
        System.out.println("Películas con duración mayor a 1 hora:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion() + " horas");
            }
        }
        System.out.println("Películas ordenadas por duración (de mayor a menor):");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p2.getDuracion(), p1.getDuracion());
            }
        });
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion() + " horas");
        }
        System.out.println("Películas ordenadas por duración (de menor a mayor):");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return Double.compare(p1.getDuracion(), p2.getDuracion());
            }
        });
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion() + " horas");
        }
        System.out.println("Películas ordenadas por título:");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion() + " horas");
        }
        System.out.println("Películas ordenadas por director:");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula p1, Pelicula p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.getTitulo() + " - " + pelicula.getDirector() + " - " + pelicula.getDuracion() + " horas");
        }
    }
}