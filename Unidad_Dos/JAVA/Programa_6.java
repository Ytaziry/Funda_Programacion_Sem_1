/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_6; //PASO 1
import java.util.Scanner;//PASO 1
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_6 { //PASO 1 

    public static void main(String[] args) {//PASO 1 
        Scanner sc= new Scanner (System.in);//PASO 1 
        double p1, p2, p3, subtotal, total, ivaT; //PASO 2 VARIABLES
        final double iva=0.16; //PASO 2 CONSTANTE
        System.out.println ("Escribe precio Prod. 1: "); //PASO 3
        p1 = sc.nextDouble();//PASO 4
        System.out.println ("Escribe precio Prod. 2: ");//PASO 3
        p2 = sc.nextDouble ();//PASP 4
        System.out.println ("Escribe precio Prod. 3: ");//PASO 3
        p3 = sc.nextDouble ();//PASO 4 
        total = p1 + p2 + p3;//PASO 5a
        ivaT = total*iva;//PASO 5b
        subtotal = total - ivaT;//PASO 5c
        System.out.println("TOTAL: " + total);
        System.out.println("IVA: " + ivaT);
        System.out.println("SUBTOTAL: " + subtotal);
    }
}
