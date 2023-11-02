/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidada_3_programa_16;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Unidada_3_Programa_16 {

    public static void main(String[] args) {
        Scanner sd = new Scanner (System.in);
        int cont=1, horas, pago, sueldo;
        while (cont<=20){
        System.out.println("Escribe cantidad de horas trabajadas: ");
        horas = sd.nextInt();
        System.out.println("Escribe el pago por hora: ");
        pago = sd.nextInt();
        sueldo = horas * pago;
        System.out.println("Tu sueldo es: " + sueldo);
        cont++;
        }
        
    }
}