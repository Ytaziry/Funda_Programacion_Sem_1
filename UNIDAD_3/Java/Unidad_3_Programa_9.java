/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_9;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Unidad_3_Programa_9 {

    public static void main(String[] args) {
        Scanner hr = new Scanner (System.in);
        int horEn,horSa,horTotal, costo;
        System.out.println("Escribe la hora de Entrada: ");
        horEn = hr.nextInt();
        System.out.println("Escribe la hora de Salida");
        horSa = hr.nextInt();
        horTotal = horSa - horEn;
        if (horTotal <= 2){
            costo = horTotal * 5;
            System.out.print("El costo total es de: $ " + costo);
        } else if (horTotal <= 5){
            costo = 2 * 5 + (horTotal - 2)* 4;
            System.out.print("El costo total es de: $ " + costo);
        } else if (horTotal <= 10){
            costo = 2 * 5 + 3 * 4 + (horTotal - 5) * 3;
            System.out.print("El costo total es de: $ " + costo);
        } else if (horTotal > 10){
            costo = 2 *5 + 3 * 4 + 5 * 3 + (horTotal - 10) * 2;
            System.out.print("El costo total es de: $ " + costo);
        }
    }
}
