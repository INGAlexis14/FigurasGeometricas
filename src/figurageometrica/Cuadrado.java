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

    public Cuadrado(int lado1) {
        super(lado1);
    }
    
    
    
    @Override
    public void imprimir() {
        super.imprimir(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void hallarPerimetro(){
        setPerimetro(getLado1() *4);
       
    }
    @Override
    public void hallarArea(){
     setArea(getLado1() *getLado1());
        
       
    }
    public void imprimirCuadrado(){
        CuadroVista cb = new CuadroVista(getLado1(),getLado1());
        cb.setVisible(true);
        
        
    }
    
    
    
    

    
   

 
    /**
     * Metodo donde se escribe los dos lados de cuadro
     */
    /*
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
    */
    
    
        
    }
    
       
    
    

