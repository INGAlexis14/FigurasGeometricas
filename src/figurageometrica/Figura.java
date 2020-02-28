/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

/**
 *
 * @author Alexis González
 */
public class Figura {
    
    public double perimetro;
    public double area;

    /**
     * Contructor clase figura
     */
    public Figura() {
    }

    /**
     * 
     * @param perimetro
     * @param area 
     */
    public Figura(double perimetro, double area) {
        this.perimetro = perimetro;
        this.area = area;
    }

    /**
     * get perimetro
     * @return 
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * set perimetro
     * @param perimetro 
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
    /**
     * get area
     * @return 
     */
    public double getArea() {
        return area;
    }
    /**
     * set area
     * @param area 
     */
    public void setArea(double area) {
        this.area = area;
    }
    
    
}
