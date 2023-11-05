/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_8;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Unidad_3_Programa_8 {

    public static void main(String[] args) {
        Scanner mm = new Scanner (System.in);
        int num1, num2;
        System.out.println("Ingresa primer numero: ");
        num1 = mm.nextInt();
        System.out.println("Escribe el segundo numero: ");
        num2= mm.nextInt();
        
        if (num1 > num2){
            System.out.println("El primer numero es mayor.");
        } else if (num2 > num1){
            System.out.println("El segundo numero es mayor.");
        }
    }
}
