package es.biblioteca;

public class Libro implements Comparable {
    protected String titulo;
    protected String ISBN;

    public Libro(String ISBN, String titulo)
    {
        this.titulo = titulo;
        this.ISBN = ISBN;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public String getISBN()
    {
        return ISBN;
    }

    public String toString()
    {
        return ISBN + ": '" + titulo + "'";
    }

    public int compareTo(Object o) 
    {
        Libro aComparar = (Libro) o;

        return ISBN.compareTo(aComparar.ISBN);
    }


}
