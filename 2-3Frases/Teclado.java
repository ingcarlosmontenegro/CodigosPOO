import java.io.*;

public class Teclado {
    private InputStreamReader isr;
    private BufferedReader br;
    public Teclado() {
       isr = new InputStreamReader(System.in);
       br = new BufferedReader(isr);
    }
    
    public String capturarCadena() throws IOException{
       String cadena = br.readLine();
       return cadena;
    }
    
    public int calcularPeso(String cad){
        int peso=0;
        for(int i=0;i<cad.length();i++){
            peso += (int)cad.charAt(i);
        }
        return peso;
    }
    
    public static void main(String[] args){
        String cadena1="", cadena2="";
        Teclado t = new Teclado();
        do{
            System.out.println("Ingrese cadenas");
            try{
                cadena1 = t.capturarCadena();
                cadena2 = t.capturarCadena();
            }catch(IOException e){
                System.out.println("no");
            }
            
        }while(t.calcularPeso(cadena1)!=t.calcularPeso(cadena2));
    }
    
    
}