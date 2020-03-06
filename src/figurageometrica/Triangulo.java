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

    /**
     * meotodo para hallar area 
     */
    @Override
    public void hallarArea() {
        double semiperimetro;
        semiperimetro = getPerimetro() / 2;
        setArea(Math.sqrt(semiperimetro * ((semiperimetro - getLado1()) * (semiperimetro - getLado2()) * (semiperimetro - getLado3()))));

    }
     /**
      * meotodo para hallar perimetro
      */

    @Override
    public void hallarPerimetro() {

        setPerimetro(getLado1() + getLado2() + getLado3());

    }
    /**
     * meotodo para imprimir el tipo de figura(equilatero,isoseles,escaleno) 
     */
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
     * meotodo para imprimir triangulo
     */
     public void imprimirTriangulo(){
        TrianguloVista tv = new TrianguloVista(getLado1(),getLado2(),getLado3());
        tv.setVisible(true);
        
        
    }
}
