/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author redu2
 */
public class Main {

    public static void main(String[] args) {

        //Creacion de un objeto
        CuadradoMagico cuadrado1 = new CuadradoMagico();
        //Muestra por consola el objeto creado
        cuadrado1.imprimirMatriz();
        //Suma total de los número de la fila indicada(fila entre 0 y 2)
        System.out.println("\nSuma de la primera fila: " + cuadrado1.sumaFila(0));

    }

}