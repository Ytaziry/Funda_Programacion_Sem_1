/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_22;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Unidad_3_Programa_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int suma = 0, num;
        do {
            System.out.println("Escribe el valo del numero: ");
            num = sc.nextInt();
            suma = suma + num;
        } while (num!=0); 
       System.out.println("Resultado es: " + suma);
    }
}
