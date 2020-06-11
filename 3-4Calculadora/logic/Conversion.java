/*
 * Conversion.java
 *
 * Created on 7 de octubre de 2007, 10:51 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package logic;

/**
 *
 * @author apdaza
 */
public class Conversion {
    
    public Integer fromHexadecimal(String cad){
        return Integer.parseInt(cad,16);
    }
    
    public Integer fromOctal(String cad){
        return Integer.parseInt(cad,8);
    }
    
    public Integer fromBinario(String cad){
        return Integer.parseInt(cad,2);
    }
    
    public String toHexadecimal(int i){
        return Integer.toHexString(i);
    }
    
    public String toOctal(int i){
        return Integer.toOctalString(i);
    }
    
    public String toBinario(int i){
        return Integer.toBinaryString(i);
    }
    
    public String combertirSistema(int actual,int nuevo, String cad){
        String res = "";
        int num=0;
        if(cad.length()>0){
            switch(actual){
                case 2:
                    num = fromBinario(cad);
                    break;
                case 8:
                    num = fromOctal(cad);
                    break;
                case 10:
                    num = Integer.parseInt(cad,10);
                    break;
                case 16:
                    num = fromHexadecimal(cad);
                    break;
            }
            switch(nuevo){
                case 2:
                    res = toBinario(num);
                    break;
                case 8:
                    res = toOctal(num);
                    break;
                case 10:
                    res = Integer.toString(num);
                    break;
                case 16:
                    res = toHexadecimal(num);
                    break;
            }
        }
        return res;
    }
    
}
