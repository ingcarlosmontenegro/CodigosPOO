/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package es.biblioteca.swing;

import java.util.HashMap;

/**
 *
 * @author juanjo
 */
public class Biblioteca {
    HashMap<String, Libro> libros = new HashMap<String, Libro>();
    
    public void alta(String ISBN, String titulo) throws LibroException
    {
        if (libros.get(ISBN) == null)
        {
            libros.put(ISBN, new Libro(ISBN, titulo));
        }
        else
        {
            throw new LibroException("Libro ya existente");
        }
    }

    public void baja(String ISBN) throws LibroException
    {
        Libro libro = libros.get(ISBN);
        if (libro == null)
        {
            throw new LibroException("Libro no encontrado");
        }
        else
        {
            libros.remove(ISBN);
        }
    }

    public Libro consulta(String ISBN) throws LibroException
    {
        Libro libro = libros.get(ISBN);
        if (libro == null)
        {
            throw new LibroException("Libro no encontrado");
        }
        else
        {
            return libro;
        }
    }
}
