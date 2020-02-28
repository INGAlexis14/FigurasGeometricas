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
    private double lado1;
    private double lado2;
    private double lado3;
    private int tipo;
    
    public void subMenu(){     
        System.out.println("Digite Lado 1");
        lado1 = sc.nextInt();
        System.out.println("Digite Lado 2");
        lado2 = sc.nextInt();
        System.out.println("Digite Lado 3");
        lado3 = sc.nextInt();
        determina();
    } 
    /**
     * metodo determina que determina que tipo de triangulo es y si existe
     */
    public void determina(){
        if((lado1+lado2>lado3)&&(lado1+lado3>lado2)&&(lado2+lado3>lado1)){
            digite();
        }else{
            System.out.println("El triangulo no existe");
        }
    }
    
    public void digite(){
        double semiperimetro;
        if((lado1==lado2) && (lado2==lado3)){
           tipo=1;       
        }else if((lado1==lado2)&&(lado2!=lado3)||(lado2==lado3)&&(lado3!=lado1)||(lado1==lado3)&&lado3!=lado2){
           tipo=2;
        }else{
           tipo=3;
        }
        perimetro=lado1+lado2+lado3;
        semiperimetro = perimetro/2;
        area=Math.sqrt(semiperimetro*((semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
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
        imprimirPerimetroArea();     
    }
    
     public void imprimirPerimetroArea() {

    }
}
