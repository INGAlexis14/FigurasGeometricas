/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.Scanner;

/**
 *
 * @author Alexis González
 */
public class Cuadrado extends Figura {
    
    Scanner sc = new Scanner(System.in);
    private int lado1;
    private int lado2;

    public Cuadrado(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Cuadrado() {
    }

    public Scanner getSc() {
        return sc;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    
    
    public void digite(){
        System.out.println("Digite Lado 1");
        lado1 = sc.nextInt();
        System.out.println("Digite Lado 2");
        lado2 = sc.nextInt();       
        area = lado1*lado2;
        perimetro = lado1*4;
        imprimirFigura();
        
    }
       
    public void imprimirFigura() {    
        
        
    }
    
    
}
