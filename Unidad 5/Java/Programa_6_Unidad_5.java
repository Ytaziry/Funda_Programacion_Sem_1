/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_6_unidad_5;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Programa_6_Unidad_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud de la secuencia Fibonacci:");
        int longitud = scanner.nextInt();

        System.out.println("Secuencia Fibonacci:");
        imprimir_Fibonacci(longitud);
    }

    public static void imprimir_Fibonacci(int longitud) {
        int primer_Numero = 0;
        int segundo_Numero = 1;

        System.out.print(primer_Numero + " " + segundo_Numero + " ");

        for (int i = 2; i < longitud; i++) {
            int siguiente_Numero = primer_Numero + segundo_Numero;
            System.out.print(siguiente_Numero + " ");

            primer_Numero = segundo_Numero;
            segundo_Numero = siguiente_Numero;
        }
    }
}
