/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_4_unidad_5;

/**
 *
 * @author USUARIO LENOVO
 */
public class Programa_4_Unidad_5 {

    public static void main(String[] args) {
        int numero = 24;

        if (es_Primo(numero)) {
            System.out.println(numero + " es un número primo.");
        } else {
            System.out.println(numero + " no es un número primo.");
        }
    }

    public static boolean es_Primo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; 
            }
        }
        return true; 
    }
}
