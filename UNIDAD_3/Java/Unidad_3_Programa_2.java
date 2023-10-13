/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_2;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Unidad_3_Programa_2 {

    public static void main(String[] args) {
        Scanner pro = new Scanner (System.in);
        int cal1, cal2, cal3, cal4, cal5, cal6, promedio;
        
        System.out.println("Escribe cal 1: ");
        cal1 = pro.nextInt();
        
        System.out.println("Escribe cal 2: ");
        cal2 = pro.nextInt();
        
        System.out.println("Escribe cal 3: ");
        cal3 = pro.nextInt();
        
        System.out.println("Escribe cal 4: ");
        cal4 = pro.nextInt();
        
        System.out.println("Escribe cal 5: ");
        cal5 = pro.nextInt();
        
        System.out.println("Escribe cal 6: ");
        cal6 = pro.nextInt();
        
        promedio = (cal1 + cal2 + cal3 + cal4 + cal5 +cal6) / 6;
        System.out.println("Tu promedio es: " + promedio);
        
        if (promedio>=70)
            System.out.println("Aprovado");
        
        else
            System.out.println("Reprovado");
    }
}
