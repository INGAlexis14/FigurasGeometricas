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
public class Triangulo extends Figura {

    private int lado2;
    private int lado3;

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        super(lado1);
        this.lado2 = lado2;
        this.lado3 = lado3;
    }
    /**
     * 
     * @param lado1 
     */
    @Override
    public void setLado1(int lado1) {
        super.setLado1(lado1); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void imprimir() {
        super.imprimir(); //To change body of generated methods, choose Tools | Templates.
    }

    /*
     Scanner sc = new Scanner(System.in);
     public double lado5;
     public double lado6;
     public double lado7;
     private int tipo;
     /**
     * Metodo donde se digitan los 3 lados del triangulo
     */
    /*
     public void subMenu(){     
     System.out.println("Digite Lado 1");
     lado5 = sc.nextInt();
     System.out.println("Digite Lado 2");
     lado6 = sc.nextInt();
     System.out.println("Digite Lado 3");
     lado7 = sc.nextInt();
     determina();
     } 
     /**
     * metodo determina que determina que tipo de triangulo es y si existe
     */
    /*
     public void determina(){
     if((lado5+lado6>lado7)&&(lado5+lado7>lado6)&&(lado6+lado7>lado5)){
     digite();
     }else{
     System.out.println("El triangulo no existe");
     }
     }
     /**
     * Metodo donde se calcula el area y perimetro
     */
    /*
     public void digite(){
     double semiperimetro;
     if((lado5==lado6) && (lado6==lado7)){
     tipo=1;       
     }else if((lado5==lado6)&&(lado6!=lado7)||(lado6==lado7)&&(lado7!=lado5)||(lado5==lado7)&&lado7!=lado6){
     tipo=2;
     }else{
     tipo=3;
     }
     perimetro=lado5+lado6+lado7;
     semiperimetro = perimetro/2;
     area=Math.sqrt(semiperimetro*((semiperimetro-lado5)*(semiperimetro-lado6)*(semiperimetro-lado7)));
     System.out.println("Area triangulo : "+ area);
     System.out.println("Perimetro Triangulo"+perimetro);
     imprimirTipoFigura();
        
     }
     /**
     * Metodo donde se imprime el tipo de triangulo
     */
    /*
     public void imprimirTipoFigura() {    
     if(tipo==1){
     System.out.println("Equilatero");
     }else if(tipo==2){
     System.out.println("Isoseles");
     }else{
     System.out.println("Escaleno");
     }
     TrianguloVista tb = new TrianguloVista(lado5, lado6,lado7);
     tb.setVisible(true);
           
     }
    
    
     */
    @Override
    public void hallarArea() {
        double semiperimetro;
        semiperimetro = getPerimetro() / 2;
        setArea(Math.sqrt(semiperimetro * ((semiperimetro - getLado1()) * (semiperimetro - getLado2()) * (semiperimetro - getLado3()))));

    }

    @Override
    public void hallarPerimetro() {

        setPerimetro(getLado1() + getLado2() + getLado3());

    }

    public void imprimirTipoFigura() {
        int tipo;
        if ((getLado1() == getLado2()) && (getLado2() == getLado3())) {
            tipo = 1;
        } else if ((getLado1() == getLado2()) && (getLado2() != getLado3()) || (getLado2() == getLado3()) && (getLado3() != getLado1()) || (getLado1() == getLado3()) && getLado3() != getLado2()) {
            tipo = 2;
        } else {
            tipo = 3;
        }
        if (tipo == 1) {
            System.out.println("Equilatero");
        } else if (tipo == 2) {
            System.out.println("Isoseles");
        } else {
            System.out.println("Escaleno");
        }
    }
    /**
     * 
     */
     public void imprimirTriangulo(){
        TrianguloVista tv = new TrianguloVista(getLado1(),getLado2(),getLado3());
        tv.setVisible(true);
        
        
    }
}
