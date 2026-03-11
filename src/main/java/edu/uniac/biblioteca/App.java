package edu.uniac.biblioteca;

import edu.uniac.biblioteca.model.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("=== Biblioteca UNIAC - Demo Completa ===");

        // 1) libro1: constructor con parámetros
        Libro libro1 = new Libro("Clean Code", "Robert C. Martin", 5, 1);

        // 2) libro2: constructor por defecto + datos por consola
        Scanner sc = new Scanner(System.in);
        Libro libro2 = new Libro();
        System.out.print("Título libro2: "); libro2.setTitulo(sc.nextLine());
        System.out.print("Autor libro2: ");  libro2.setAutor(sc.nextLine());
        System.out.print("Ejemplares libro2: "); libro2.setNumeroEjemplares(Integer.parseInt(sc.nextLine()));
        System.out.print("Prestados libro2 (inicial): "); libro2.setNumeroPrestados(Integer.parseInt(sc.nextLine()));

        // 3) LibroTextoUNIAC con todos sus atributos
        LibroTextoUNIAC textoUniac = new LibroTextoUNIAC(
                "Álgebra Lineal", "S. Lay", 8, 2, "Ingeniería de Sistemas I", "Facultad de Ingeniería"
        );

        // 4) Novela con tipo
        Novela novela = new Novela("La vuelta al mundo en 80 días", "Julio Verne", 10, 0, "aventuras");

        // Estado inicial
        System.out.println("\n-- Estado inicial --");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(textoUniac);
        System.out.println(novela);

        // Préstamos / Devoluciones (aplican a todas por herencia de Libro)
        System.out.println("\n-- Pruebas de préstamo/devolución --");
        System.out.println("Prestar libro1: " + (libro1.prestar() ? "ÉXITO" : "SIN DISPONIBLES"));
        System.out.println("Devolver libro2: " + (libro2.devolver() ? "ÉXITO" : "NO HABÍA PRESTADOS"));
        System.out.println("Prestar textoUniac: " + (textoUniac.prestar() ? "ÉXITO" : "SIN DISPONIBLES"));
        System.out.println("Devolver novela: " + (novela.devolver() ? "ÉXITO" : "NO HABÍA PRESTADOS"));

        // Estado final
        System.out.println("\n-- Estado final --");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(textoUniac);
        System.out.println(novela);
    }
}