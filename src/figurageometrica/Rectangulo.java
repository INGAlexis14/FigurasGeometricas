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
    
    Scanner sc = new Scanner(System.in);
    public int lado3;
    public int lado4;

    public void digite(){
        System.out.println("Digite Base");
        lado3 = sc.nextInt();
        System.out.println("Digite Altura");
        lado4 = sc.nextInt();       
        area = lado3*lado4;
        perimetro = (lado3*2)+(lado4*2);
        System.out.println("Area es igual a : " + area);
        System.out.println("Perimetro es igual a :" + perimetro);
        RectanguloVista rv = new RectanguloVista(lado3, lado4);
        rv.setVisible(true);
        
    }
       

}
