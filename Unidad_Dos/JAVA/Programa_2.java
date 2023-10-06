/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_2;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Proyecto_2 { //PASO 1

    public static void main(String[] args) { //PASO 1
        Scanner sc= new Scanner (System.in);
        int a, b, suma; //PASO 2-DECLARAR VARIABLES 
        System.out.print("Escribe un número A: "); // PASO 3-SOLICITAR NÚMERO
        a = sc.nextInt(); //PASO 4-ASIGNAR VALOR
        System.out.print("Escribe un número B: "); //PASO 3-SOLICITAR NÚMERO
        b = sc.nextInt(); //PASO 4-ASIGNAR VALOR 
        suma=a+b; //PASO 5
        System.out.println("Resultado:" + suma); //PASO 6 
    }
}
