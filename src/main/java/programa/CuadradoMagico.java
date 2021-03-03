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

    private final int[][] matriz;
    private final static Random aleatorio = new Random();

    public CuadradoMagico() {

        matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j] = aleatorio.nextInt((9-1)+1)+1;
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }

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

    @Override
    public String toString() {
        return "CuadradoMagico{" + "matriz=" + matriz + '}';
    }
    
}
