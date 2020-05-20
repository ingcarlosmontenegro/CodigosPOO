package es.ajedres;

public class Tablero {
    public final int ancho;
    public final int alto;
    public final char BLANCO = '_';
    public final char NEGRO = 'X';

    public Dama blanca1;
    public Dama blanca2;
    public Dama blanca3;

    public Dama negra1;
    public Dama negra2;
    public Dama negra3;

    public Tablero(int ancho, int alto)
    {
        this.ancho = ancho;
        this.alto = alto;
    }

    public void pintar()
    {
       
        for (int i = 0; i < alto; i++)
        {
            for (int j = 0; j < ancho; j++)
            {
                if (blanca1.estaAhi(i, j))
                    System.out.print(blanca1.forma());
                else if (blanca2.estaAhi(i, j))
                    System.out.print(blanca2.forma());
                else if (blanca3.estaAhi(i, j))
                    System.out.print(blanca3.forma());
                else if (negra1.estaAhi(i, j))
                    System.out.print(negra1.forma());
                else if (negra2.estaAhi(i, j))
                    System.out.print(negra2.forma());
                else if (negra3.estaAhi(i, j))
                    System.out.print(negra3.forma());
                else
                {
                    if ((i + j) % 2 == 0)
                    {
                        System.out.print(NEGRO);
                    }
                    else
                    {
                        System.out.print(BLANCO);
                    }
                }
            }
            System.out.println();
        }
    }
}
