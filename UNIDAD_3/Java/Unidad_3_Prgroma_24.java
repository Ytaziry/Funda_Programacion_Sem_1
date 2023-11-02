/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_prgroma_24;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Unidad_3_Prgroma_24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        do {
            System.out.println("Ingresa un número entero: ");
            num = sc.nextInt();
            if (num < 0 ){ 
                break;
            }
            if (num % 2 == 0){ 
                System.out.println(num + " Es par.");
            }else {
                System.out.println(num + " Es impar.");
            }
    }while (true);
    }
}

