/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author redu2
 */
public class CuadradoMagico {

    //Atributos 
    private final int[][] matriz;
    private final static Random aleatorio = new Random();

    //Constructor
    public CuadradoMagico() {

        matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = aleatorio.nextInt((9 - 1) + 1) + 1;
            }
        }
    }

    //Hashcode y equals
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Arrays.deepHashCode(this.matriz);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CuadradoMagico other = (CuadradoMagico) obj;
        if (!Arrays.deepEquals(this.matriz, other.matriz)) {
            return false;
        }
        return true;
    }

    //Método imprimir matriz
    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {

            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print("[" + matriz[i][j] + "]" + "\t");
            }
        }
    }

    //Método de suma total de una fila
    public int sumaFila(int numFila) {

        int suma = 0;

        if (numFila < 0 || numFila > 2) {

            return -1;
        } else {

            for (int i = 0; i < matriz.length; i++) {

                if (i == numFila) {

                    for (int j = 0; j < matriz[i].length; j++) {

                        suma += matriz[i][j];
                    }
                }
            }
        }
        return suma;
    }

    //Método de suma total de una columna
    public int sumaColumna(int numColum) {

        int suma = 0;

        if (numColum < 0 || numColum > 2) {

            return -1;
        } else {

            for (int i = 0; i < matriz.length; i++) {

                for (int j = 0; j < matriz[i].length; j++) {

                    if (j == numColum) {

                        suma += matriz[i][j];
                    }
                }
            }
        }
        return suma;
    }

}
