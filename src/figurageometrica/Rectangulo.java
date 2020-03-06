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
public class Rectangulo extends Figura{

    private int lado2;

    public Rectangulo(int lado2) {
        this.lado2 = lado2;
    }

    public Rectangulo(int lado2, int lado1) {
        super(lado1);
        this.lado2 = lado2;
    }
    
    
    
    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
    
    @Override
    public void imprimir() {
        super.imprimir(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void hallarPerimetro(){
        setPerimetro((getLado1()  + getLado2()) * 2);
       
    }
    @Override
    public void hallarArea(){
     setArea(getLado1() * getLado2());
        
       
    }
    public void imprimirRectangulo(){
        RectanguloVista rv= new RectanguloVista(getLado1(),getLado2());
        rv.setVisible(true);
        
        
    }
    

    /**
     * Metodo donde se digita la base y la altura del rectangulo
     */
    /*
     public void digite(){
     System.out.println("Digite Base");
     lado1 = sc.nextInt();
     System.out.println("Digite Altura");
     lado2 = sc.nextInt();       
     area = lado1*lado2;
     perimetro = (lado1*2)+(lado2*2);
     System.out.println("Area es igual a : " + area);
     System.out.println("Perimetro es igual a :" + perimetro);
     RectanguloVista rv = new RectanguloVista(lado1, lado2);
     rv.setVisible(true);
        
     }
     */
}
