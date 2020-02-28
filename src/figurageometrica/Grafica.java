/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.awt.Graphics;

/**
 *
 * @author Alexis González
 */
public class Grafica {
    
    public static void pintarCuadro (Graphics g, int x, int y,int x1,int y1){
        Cuadrado cuadrado = new Cuadrado();
        
        g.drawRect(x, y, y1, y1);
    }
   
}
