/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_7;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double num1, num2, suma, resta, multiplicacion, division;
        System.out.println("Escribe numero 1: ");
        num1 = sc.nextDouble ();
        System.out.println("Escribe numero 2:");
        num2 = sc.nextDouble ();
        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;
        System.out.println("Resultado SUMA: " + suma);
        System.out.println("Resultado RESTA: " + resta);
        System.out.println("Resultado MULTIPLICACION: " + multiplicacion);
        System.out.println("Resultado DIVISION: " + division);
    } 
}
