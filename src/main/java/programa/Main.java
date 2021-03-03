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

        //Suma total de los números de la fila indicada(fila entre 0 y 2)
        System.out.println("\nSuma de la primera fila: " + cuadrado1.sumaFila(0));

        //Suma total de los números de la columna indicada(columna entre 0 y 2)
        System.out.println("\nSuma de la primera columna: " + cuadrado1.sumaColumna(0));

        //Suma total de la primera diagonal 
        System.out.println("\nSuma de la primera diagonal: " + cuadrado1.sumaPrimeraDiagonal());

        //Suma total de la diagonal inversa
        System.out.println("\nSuma de la diagonal inversa: " + cuadrado1.sumaDiagonalInversa());

        //Prueba del método del cuadrado mágico
        System.out.println("\n"+cuadrado1.esCuadradoMagico(cuadrado1.sumaColumna(0),
                cuadrado1.sumaColumna(0), cuadrado1.sumaPrimeraDiagonal(),
                cuadrado1.sumaDiagonalInversa()));
    }

}
