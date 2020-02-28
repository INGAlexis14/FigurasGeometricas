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
    
    Scanner sc = new Scanner(System.in);
    public double lado5;
    public double lado6;
    public double lado7;
    private int tipo;
    
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
    public void determina(){
        if((lado5+lado6>lado7)&&(lado5+lado7>lado6)&&(lado6+lado7>lado5)){
            digite();
        }else{
            System.out.println("El triangulo no existe");
        }
    }
    
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
    
    
}
