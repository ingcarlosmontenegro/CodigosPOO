package es.holamundo;

public class HolaMundo2 {

    int miNumero = 3;

    public HolaMundo2(int valorInicial)
    {
        miNumero = valorInicial;
    }

    public static void main(String[] args)
    {
        Vehiculo v = new Vehiculo();
        v.matricula = "7777DJP";
        System.out.println("Vehiculo creado con Matricula: "+v.matricula);
        Coche c = new Coche();
        c.matricula= "555PJD";
        System.out.println("Coche creado con Matricula: "+c.matricula);
        
       HolaMundo2 instanciaHola = new HolaMundo2(5);
       System.out.println("Valor de miNumero dede el constructor: "+instanciaHola.miNumero);
       instanciaHola.Incrementar();
       System.out.println("Valor de miNumero incrementado: "+instanciaHola.miNumero);
       instanciaHola.darValor(20);
       System.out.println("Valor de miNumero asignado por m�todo: "+instanciaHola.miNumero);
       System.out.println("Valor de miNumero multiplicado por2 con un m�todo: "+instanciaHola.multiplicar(2));
       HolaMundo2 segundaInstancia = new HolaMundo2(10);
       System.out.println("Valor inicial de miNumero: "+segundaInstancia.miNumero);
       instanciaHola.sumarClase(segundaInstancia);
       System.out.println("Valor de miNumero despues de llamar la m�todo sumar Clase: "+segundaInstancia.miNumero);
    }

    public void Incrementar()
    {
        miNumero = miNumero + 1;
    }

    public void darValor(int nuevoValor)
    {
        miNumero = nuevoValor;
    }

    public int multiplicar(int cuanto)
    {
        miNumero = miNumero * cuanto;
        cuanto = 7;
        return miNumero;
    }

    public void sumarClase(HolaMundo2 objeto)
    {
        objeto.miNumero = objeto.miNumero + 1;
    }
}
