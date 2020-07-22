/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import java.awt.Canvas;
import java.awt.Font;
import java.awt.Graphics;

/**
 *
 * @author chamo
 */
public class Pantalla extends Canvas{
    int a[][];

    public void setA(int[][] a) {
        this.a = a;
    }
    
    public void paint(Graphics g){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]<9){
                    g.setFont(new Font("arial",Font.BOLD,15));
                    g.drawString(String.valueOf(a[i][j]), (i*50)+25, (j*50)+30);
                    g.drawRect(i*50, j*50, 50, 50);
                }else{
                    g.fillRect(i*50, j*50, 50, 50);
                }
            }
        }
       
    }
}
