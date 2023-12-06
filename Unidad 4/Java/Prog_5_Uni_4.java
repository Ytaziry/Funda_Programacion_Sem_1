/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_5_uni_4;

/**
 *
 * @author USUARIO LENOVO
 */
public class Prog_5_Uni_4 {

    public static void main(String[] args) {
        String[] frutas = { "Manzana", "Fresa", "Cereza", "Frambuesa", "Granada" };
        String[] frutasAlReves = new String[frutas.length];

        for (int i = 0; i < frutas.length; i++) {
            frutasAlReves[i] = frutas[frutas.length - 1 - i];
        }

        System.out.println("Arreglo Original:");
        imprimirArreglo(frutas);

        System.out.println("\nArreglo al Revés:");
        imprimirArreglo(frutasAlReves);
    }

    static void imprimirArreglo(String[] array) {
        for (String elemento : array) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
