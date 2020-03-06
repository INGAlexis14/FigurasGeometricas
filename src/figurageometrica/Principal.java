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
public class Principal{
    Cuadrado cuadrado;
    Rectangulo rectangulo;
    public int l1;
    public int l2;
    Scanner sc = new Scanner(System.in);
    public int opcion;
    public int lado1;


    

    /**
     * Metodo donde inicia la aplicacion
     */
    public void Inicio() {
        do {
            System.out.println("ELIJA EL TIPO DE FIGURA");
            System.out.println("1. CUADRADO");
            System.out.println("2. RECTANGULO");
            System.out.println("3. TRIANGULO");
            System.out.println("4. SALIR ");
            opcion = sc.nextInt();
            if (opcion == 1) {
               
                System.out.println("Digite lado");
                cuadrado= new Cuadrado(sc.nextInt());
                cuadrado.hallarArea();
                cuadrado.hallarPerimetro();
                cuadrado.imprimir();
                cuadrado.imprimirCuadrado();
            } else if (opcion == 2) {
                
                System.out.println("Digite lado 1");
                l1 = sc.nextInt();
                System.out.println("Digite lado 2");
                l2 = sc.nextInt();
                
                rectangulo = new Rectangulo(l1,l2); 
                
           
                rectangulo.hallarArea();
                rectangulo.hallarPerimetro();
                rectangulo.imprimir();
                rectangulo.imprimirRectangulo();
              
            } else if (opcion == 3) {
                //triangulo.subMenu();
            } else {
                System.out.println("Opcion Incorrecta");
            }

        } while (opcion != 4);

    }
}
