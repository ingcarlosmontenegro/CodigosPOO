package es.ajedres;


public class Main {

   
    public static void main(String[] args) {
        Tablero t = new Tablero(8, 8);
        t.blanca1 = new Dama(false, 0, 3);
        t.blanca2 = new Dama(false, 0, 6);
        t.blanca3 = new Dama(false, 2, 1);
        t.negra1 = new Dama(true, 6, 1);
        t.negra2 = new Dama(true, 6, 5);
        t.negra3 = new Dama(true, 7, 2);
        t.pintar();




    }

}
