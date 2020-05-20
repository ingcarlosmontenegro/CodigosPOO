package es.colecciones;

import java.util.*;


public class Main {

    
    public static void main(String[] args) {
        LinkedList<Integer> listaNueva = new LinkedList<Integer>();
        listaNueva.add(1);
        listaNueva.add(3);
        listaNueva.add(2);

        listar(listaNueva, "Lista inicial");

        Collections.sort(listaNueva);

        listar(listaNueva, "Lista ordenada");

        Collections.shuffle(listaNueva);

        listar(listaNueva, "Lista desordenada");

        Collections.addAll(listaNueva, 6, 7, 8);

        listar(listaNueva, "Añadidos los elementos 6, 7 y 8");

        LinkedList<Integer> lista2 = new LinkedList<Integer>();
        lista2.add(9);
        lista2.add(10);

        listaNueva.addAll(lista2);

        listar(listaNueva, "Añadida la lista2");

        //Arrays
    }

    public static void listar(LinkedList<Integer> lista, String mensaje)
    {
        System.out.println(mensaje);
        for (Integer num : lista)
        {
            System.out.println(num);
        }
        System.out.println("----------------");
    }

}
