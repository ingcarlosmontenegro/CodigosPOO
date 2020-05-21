package es.biblioteca;

import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) {
        try
        {
            HashMap<String, Libro> libros = new HashMap<String, Libro>();
            String opcion;
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            do
            {
                mostrarMenu();
                opcion = br.readLine();
                try
                {
                    int opcionInt = Integer.parseInt(opcion);
                    switch (opcionInt)
                    {
                        case 1: altaLibro(br, libros); break;
                        case 2: bajaLibro(br, libros); break;
                        case 3: consultaLibro(br, libros); break;
                        case 4: break;
                        default: System.err.println("Opción no válida");
                    }
                } catch (NumberFormatException ex2)
                {
                    System.err.println("Opción no válida");
                }
            } while (!opcion.equals("4"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void mostrarMenu()
    {
        System.out.println();
        System.out.println("Gestión de libros");
        System.out.println("-----------------");
        System.out.println();
        System.out.println("\t1) Añadir un libro");
        System.out.println("\t2) Eliminar un libro");
        System.out.println("\t3) Buscar un libro");
        System.out.println("\t4) Salir");
        System.out.print("Elija una opción: ");
    }

    private static void altaLibro(BufferedReader br, HashMap<String, Libro> libros) throws IOException
    {
        System.out.println("Alta de nuevo libro");
        System.out.print("ISBN: ");
        String ISBN = br.readLine();
        System.out.print("Título: ");
        String titulo = br.readLine();
        Libro nuevo = new Libro(ISBN, titulo);

        if (libros.get(ISBN) == null)
        {
            libros.put(ISBN, nuevo);
            System.out.println("Libro dado de alta correctamente");
        }
        else
        {
            System.err.println("Libro ya existente");
        }
    }

    private static void bajaLibro(BufferedReader br, HashMap<String, Libro> libros) throws IOException
    {
        System.out.println("Baja de libro existente");
        System.out.print("ISBN: ");
        String ISBN = br.readLine();
        Libro libro = libros.get(ISBN);
        if (libro == null)
        {
            System.err.println("Libro no encontrado");
        }
        else
        {
            libros.remove(ISBN);
            System.out.println("Libro dado de baja correctamente");
        }
    }

    private static void consultaLibro(BufferedReader br, HashMap<String, Libro> libros) throws IOException
    {
        System.out.println("Consulta de libro existente");
        System.out.print("ISBN: ");
        String ISBN = br.readLine();

        Libro libro = libros.get(ISBN);
        if (libro == null)
        {
            System.err.println("Libro no encontrado");
        }
        else
        {
            System.out.println(libro);
        }
    }

}
