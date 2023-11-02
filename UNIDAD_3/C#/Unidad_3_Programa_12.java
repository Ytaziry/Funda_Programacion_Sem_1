/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_12;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Unidad_3_Programa_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int c, total, num;
        System.out.println("Escribe el total de numeros a procesar:");
        total = sc.nextInt();
        for (c=1; c<=total; c++){
            System.out.println("Escribe numero: ");
            num = sc.nextInt();
            if (num%2 == 0)
                System.out.println("PAR");
            else
                System.out.println("IMPAR");
        }
    }
}
