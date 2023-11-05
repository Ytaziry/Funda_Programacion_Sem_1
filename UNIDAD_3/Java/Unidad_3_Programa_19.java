/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_19;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Unidad_3_Programa_19 {

    public static void main(String[] args) {
        Scanner nc = new Scanner (System.in);
        int n, i = 0, conCero = 0, conMaCero = 0, conMeCero = 0;
        System.out.println("Escribe el valor de N: ");
        n = nc.nextInt();
        System.out.println("Escribe un numero: ");
        if (n == 0){
            conCero++;
            System.out.println("Cantidad de ceros: " + conCero);
        } else if (n > 0){
            conMaCero++;
            System.out.println("Cantidad de números mayores a cero: " + conMaCero);
        } else if (n < 0){ 
            conMeCero++;
            System.out.println("Cantidad de números menores a cero: " + conMeCero);            
        }
        i++;
    }
}
