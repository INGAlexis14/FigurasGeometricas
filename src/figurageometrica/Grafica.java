/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Alexis González
 */
public class Grafica {

    /**
     * Metodo estatico donde se pinta el cuadro
     *
     * @param g
     * @param x
     * @param y
     * @param x1
     * @param y1
     */
    public static void pintarCuadro(Graphics g, int x, int y, int x1, int y1) {

        g.setColor(Color.BLUE);
        g.drawRect(x, y, y1, y1);

    }

    /**
     * Metodo estatico donde se pinta el rectangulo
     *
     * @param g
     * @param x
     * @param y
     * @param x1
     * @param y1
     */
    public static void pintarRectangulo(Graphics g, int x, int y, int x1, int y1) {

        g.drawRect(x, y, x1, y1);
    }

    /**
     * Metodo estatico donde se pinta el triangulo
     *
     * @param g
     * @param x
     * @param y
     * @param x1
     * @param y1
     */
    public static void pintarTriangulo(Graphics g, int x, int y, int x1, int y1) {

       // g.drawRoundRect(x, y, y1, y1, y1, y1);
        /*int [] vx1 = {500, 550, 450};
         int [] vy1 = {70, 120, 120};
         g.drawPolygon(vx1, vy1, 7);
         /**/
        /*
        int xValues3[] = {120, 140, 170,190};
        int yValues3[] = {40, 70, 80,100};

        g.drawPolygon(xValues3, yValues3, 4);
        */
        /*
        int [] vx1 = {60, 75, 120};
        int [] vy1 = {60, 90, 90};
                */
        
        int [] vx1 = {70, 110, 20};
        int [] vy1 = {20, 70, 70};
        g.drawPolygon (vx1, vy1, 3);
                
    }

}
