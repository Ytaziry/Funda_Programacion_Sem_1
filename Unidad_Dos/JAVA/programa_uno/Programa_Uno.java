/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programa_uno;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Programa_Uno {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int cal1, cal2, cal3, cal4, cal5, cal6, promedio;
        System.out.println("Escribe calificacion 1: ");
        cal1 = sc.nextInt();
        System.out.println("Escribe calificacion 2: ");
        cal2 = sc.nextInt();
        System.out.println("Escribe calificacion 3: ");
        cal3 = sc.nextInt();
        System.out.println("Escribe calificacion 4: ");
        cal4 = sc.nextInt();
        System.out.println("Escribe calificacion 5: ");
        cal5 = sc.nextInt();
        System.out.println("Escribe calificacion 6: ");
        cal6 = sc.nextInt();
        promedio = (cal1 + cal2+ cal3 + cal4 + cal5 + cal6)/6;
        System.out.println("PROMEDIO: " + promedio);
    }
}
