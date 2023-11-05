/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_10;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Unidad_3_Programa_10 {

    public static void main(String[] args) {
        Scanner ss = new Scanner (System.in);
        int HTra, PHor, HExt, SueldoSem;
        System.out.println("Escribe numero de horas Trabajadas: ");
        HTra = ss.nextInt();
        System.out.print("Escribe pago por hora: ");
        PHor = ss.nextInt();
        if (HTra <= 40){
            SueldoSem = HTra * PHor;
            System.out.print("Tu sueldo total es de: " + SueldoSem);
        } else if (HTra > 40){
            HExt = HTra - 40;
            SueldoSem = (40 * PHor) + (HExt * (2 * PHor));
            System.out.print("Tu sueldo total es de: " + SueldoSem);
        } 
    }
}
