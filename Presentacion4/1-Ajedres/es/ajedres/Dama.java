package es.ajedres;


public class Dama {
    public final static char NEGRO = '#';
    public final static char BLANCO = 'O';

    protected char color;
    public int posX;
    public int posY;

    public Dama(boolean esNegra, int x, int y)
    {
        if (esNegra)
        {
            color = NEGRO;
        }
        else
        {
            color = BLANCO;
        }

        posX = x;
        posY = y;
    }

    public char forma()
    {
        return color;
    }

    public boolean estaAhi(int x, int y)
    {
        return posX == x && posY == y;
    }
}
