/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.awt.Graphics;
import java.util.Scanner;

/**
 *
 * @author Alexis González
 */
public class Cuadrado extends Figura {
    
    Scanner sc = new Scanner(System.in);
    public int lado1;
    public int lado2;

    /**
     * 
     * @param lado1 Variable lado 1
     * @param lado2 Variable lado 2
     */
    public Cuadrado(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Contructor de la clase cuadro
     */
    public Cuadrado() {
    }

    /**
     * Get de Sacaner
     * @return 
     */
    public Scanner getSc() {
        return sc;
    }
    /**
     * Set scanner
     * @param sc 
     */
    public void setSc(Scanner sc) {
        this.sc = sc;
    }
    /**
     * get lado 1
     * @return 
     */
    public int getLado1() {
        return lado1;
    }
    /**
     * set lado 1
     * @param lado1 
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    
    /**
     * Metodo donde se escribe los dos lados de cuadro
     */
    public void digite(){
        System.out.println("Digite Lado 1");
        lado1 = sc.nextInt();
        System.out.println("Digite Lado 2");
        lado2 = sc.nextInt();  
        area = lado1*lado2;
        perimetro = lado1*4;
        System.out.println("Area es igual a : " + area);
        System.out.println("Perimetro es igual a :" + perimetro);
        CuadroVista cb = new CuadroVista(lado1, lado2);
        cb.setVisible(true);

    }
    
       
    
    
}
