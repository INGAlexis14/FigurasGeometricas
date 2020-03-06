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
public abstract class Figura implements IMetodos {

    private double perimetro;
    private double area;
    private int lado1;

    /**
     * Contructor clase figura
     */
    public Figura() {
    }

    /**
     * Constructor de Figura que recibe los parametros:
     *
     * @param perimetro
     * @param area
     * @param lado1
     */
    public Figura( int lado1) {
        this.lado1 = lado1;
    }

    
    public void imprimir(){
        System.out.println("El Area es: " + area + " y el perimetro es: " + perimetro);
    }

    /**
     * get perimetro
     *
     * @return
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * set perimetro
     *
     * @param perimetro
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * get area
     *
     * @return
     */
    public double getArea() {
        return area;
    }

    /**
     * set area
     *
     * @param area
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * get lado1
     *
     * @return
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * set lado1
     *
     * @param lado1
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

}
