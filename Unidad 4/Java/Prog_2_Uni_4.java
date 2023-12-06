/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog_2_uni_4;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Prog_2_Uni_4 {

    public static void main(String[] args) {
        double[] calificaciones = new double[10];
        
        Scanner ed = new Scanner(System.in);

     
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese la calificación " + (i + 1) + ": ");
            calificaciones[i] = Double.parseDouble(ed.nextLine());
        }

   
        double suma = 0;
        for (int i = 0; i < 10; i++) {
            suma += calificaciones[i];
        }

        double promedio = suma / 10;

        System.out.println("El promedio de las calificaciones es: " + promedio);

        ed.close();
    }
}
