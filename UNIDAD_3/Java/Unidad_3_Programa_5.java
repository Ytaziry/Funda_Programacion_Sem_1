 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_5;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Unidad_3_Programa_5 {

    public static void main(String[] args) {
        Scanner sm = new Scanner (System.in);
        double p1, p2, p3, total;
        System.out.println("Escribe precio 1: ");
        p1 = sm.nextDouble ();
          System.out.println("Escribe precio 2: ");
        p2 = sm.nextDouble ();
          System.out.println("Escribe precio 3: ");
        p3 = sm.nextDouble ();
        total = p1 + p2 + p3;
        if (total>=1500){
            total = total - (total * 0.30);
            System.out.println ("El total (30% desc): " + total);
        }else if (total<1500 && total>=1000){
            total = total - (total * 0.20);
            System.out.println ("El total (20% desc): " + total);
        }else if (total<1000 && total>=700){
            total = total - (total * 0.10);
            System.out.println ("El total (10% desc): " + total);
            }else {
            System.out.println ("El total del descuento es de 0%: " + total);
        }
        }
    }
