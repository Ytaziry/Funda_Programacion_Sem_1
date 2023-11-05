/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_6;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Unidad_3_Programa_6 {

    public static void main(String[] args) {
        Scanner ip = new Scanner (System.in);
        int num;
        System.out.println("Escribe un numero positivo: ");
        num = ip.nextInt();
        if (num%2 == 0)
            System.out.println("Es par");
        else 
            System.out.println("Es Impar");
    }
}
