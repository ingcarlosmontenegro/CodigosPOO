/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import java.io.*;

/**
 *
 * @author chamo
 */
public class Archivo {
    public static void escribirArrego(int[][] a){
        try {
            File outputFile = new File("cuadrito.txt");

            FileOutputStream fos = new FileOutputStream(outputFile);
            int c;

           for(int i=0;i<a.length;i++){
               for(int j=0;j<a[i].length;j++){
                   char x = String.valueOf(a[i][j]).charAt(0);
                   fos.write(x);
               }
            }

            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("FileStreamsTest: " + e);
        }
    }
    public static int[][] leerArrego(int l){
        int[][] a = new int[l][l];
        try {
            File inputFile = new File("cuadrito.txt");

            FileInputStream fis = new FileInputStream(inputFile);
            int c;
            int i=0;
            int j=0;
            for(i=0;i<l;i++) {
               for(j=0;j<l;j++){
                   c = fis.read();
                    a[i][j]=Integer.parseInt(String.valueOf((char)c));               
                }
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (IOException e) {
            System.err.println("FileStreamsTest: " + e);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("FileStreamsTest: " + e);
            System.out.println("FileStreamsTest: " + e);
        }
        return a;
    }
}
