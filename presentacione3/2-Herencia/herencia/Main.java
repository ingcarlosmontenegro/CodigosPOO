/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author Carlos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Coche c = new Coche("123456");
        c.describeme();
        c.describeme("654321");
        System.out.println(c.toString());
        Coche.metodo();
        c.metodo();
        
        Moto m = new Moto ();
        m.describeme("987654");
        
        MiniBarco mb = new MiniBarco();
        mb.metodo1();
        mb.metodo2();
        
        Barco b = new Barco() {
			@Override
			public void metodo1() {
				// TODO Auto-generated method stub
				System.out.println("metodo 1 creado por ser abstracto");
			}
		};
		b.metodo1();
		b.metodo2();
 
		int numa, numb;
        numa = 30;
        numb = 4;

        try
        {
            if (numa < numb)
            {
                throw new ArithmeticException();
            }
            else
            {
                System.out.println(numa - numb);
            }
            
        } catch (ArithmeticException excepcion)
        {
            System.out.println("a no puede ser menor que b");
        }

        numa = 3;
        numb = 4;

        try
        {
            if (numa < numb)
            {
                throw new ArithmeticException();
            }
            else
            {
                System.out.println(numa - numb);
            }
            
        } catch (ArithmeticException excepcion)
        {
            System.out.println("a no puede ser menor que b");
        }
        
    }
}
