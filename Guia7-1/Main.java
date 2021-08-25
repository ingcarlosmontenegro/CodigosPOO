import javax.swing.JFrame;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame frame = new JFrame ("Cargando JApplet");
        HolaIte gui = new HolaIte();
        gui.init();
        frame.getContentPane().add(gui);
        frame.setSize(200,200);
        frame.setVisible(true);
    }
}