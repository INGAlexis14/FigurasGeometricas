/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figurageometrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Alexis González
 */
public class Principal {

    /**
     *
     */
    Cuadrado cuadrado;
    Rectangulo rectangulo;
    Triangulo triangulo;
    public int l1;
    public int l2;
    public int l3;
    Scanner sc = new Scanner(System.in);
    public int opcion;
    public int lado1;
    List<Figura> figura = new ArrayList<Figura>();

    /**
     * Metodo donde inicia la aplicacion
     */
    public void Inicio() {
        do {
            System.out.println("ELIJA EL TIPO DE FIGURA");
            System.out.println("1. CUADRADO");
            System.out.println("2. RECTANGULO");
            System.out.println("3. TRIANGULO");
            System.out.println("4. LISTAR  TODOS");
            System.out.println("5. SALIR ");
            opcion = sc.nextInt();
            if (opcion == 1) {

                digiteCuadrado();
            } else if (opcion == 2) {

                digiteRectangulo();

            } else if (opcion == 3) {

                digiteTriangulo();
            } else if (opcion == 4) {

                listar();
            } else {
                System.out.println("Opcion Incorrecta");
            }

        } while (opcion != 5);

    }

    public void digiteTriangulo() {
        System.out.println("Digite lado 1");
        l1 = sc.nextInt();
        System.out.println("Digite lado 2");
        l2 = sc.nextInt();
        System.out.println("Digite lado 3");
        l3 = sc.nextInt();

        triangulo = new Triangulo(l1, l2, l3);
        figura.add(triangulo);
        triangulo.hallarPerimetro();
        triangulo.hallarArea();
        triangulo.imprimir();
        triangulo.imprimirTriangulo();
        triangulo.imprimirTipoFigura();
    }

    public void digiteRectangulo() {
        System.out.println("Digite lado 1");
        l1 = sc.nextInt();
        System.out.println("Digite lado 2");
        l2 = sc.nextInt();

        rectangulo = new Rectangulo(l1, l2);
        figura.add(rectangulo);
        rectangulo.hallarArea();
        rectangulo.hallarPerimetro();
        rectangulo.imprimir();
        rectangulo.imprimirRectangulo();
    }

    public void digiteCuadrado() {
        System.out.println("Digite lado");
        cuadrado = new Cuadrado(sc.nextInt());

        figura.add(cuadrado);
        cuadrado.hallarArea();
        cuadrado.hallarPerimetro();
        cuadrado.imprimir();
        cuadrado.imprimirCuadrado();
    }

    public void listar() {

        for (int i = 0; i < figura.size(); i++) {
            if (figura.get(i) instanceof Cuadrado) {
                ((Cuadrado) figura.get(i)).imprimirCuadrado();
            } else if (figura.get(i) instanceof Rectangulo) {
                ((Rectangulo) figura.get(i)).imprimirRectangulo();
            } else {
                ((Triangulo) figura.get(i)).imprimirTriangulo();
            }

        }
    }

}
