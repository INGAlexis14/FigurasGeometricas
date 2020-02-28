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

public class Principal {
    
    Scanner sc = new Scanner(System.in);
    public int opcion;
    Cuadrado cuadrado = new Cuadrado();
    Rectangulo rectangulo = new Rectangulo();
    Triangulo triangulo = new Triangulo();
    
    /**
     * Metodo donde inicia la aplicacion
     */
    public void Inicio(){
          
        System.out.println("ELIJA EL TIPO DE FIGURA");
        System.out.println("1. CUADRADO");
        System.out.println("2. RECTANGULO");
        System.out.println("3. TRIANGULO");     
        opcion = sc.nextInt();  
        if(opcion==1){
            cuadrado.digite();
        }else if(opcion==2){
            rectangulo.digite();
        }else if(opcion==3){
            triangulo.digite();
        }else{
            System.out.println("Opcion Incorrecta");
        }  
    }
    
}
