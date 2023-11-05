/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_7;
import java.util.Scanner;
/**
 *
 * @author USUARIO LENOVO
 */
public class Unidad_3_Programa_7 {

    public static void main(String[] args) {
        Scanner tm = new Scanner (System.in);
        int temperatura;
        System.out.println("Escribe la temperatra actual: ");
        temperatura = tm.nextInt();
        if (temperatura > 27){
            System.out.println("Hace calor.");
        } else if (temperatura > 20 && temperatura <=  27){
            System.out.println("Clima agradable.");
        } else if (temperatura < 20){
            System.out.println("Clima fresco o frío.");
        }
    }
}
