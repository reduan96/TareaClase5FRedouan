/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.Random;

/**
 *
 * @author redu2
 */
public class CuadradoMagico {

    private int[][] matriz;
    private static Random aleatorio = new Random();

    public CuadradoMagico() {

        matriz = new int[3][3];
        
        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[i].length; j++) {
                
                matriz[i][j] = aleatorio.nextInt((9-1)+1)+1;
            }
        }
    }
}
