/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_1;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Unidad_3_Programa_1 {

    public static void main(String[] args) {
        Scanner ed = new Scanner (System.in);
        int edad;
        System.out.println("Escribe tu edad");
        edad = ed.nextInt();
        if(edad>=18)
            System.out.println("Eres mayor de edad!!!");
        else
            System.out.println("Eres menor se edad");
    }
}
