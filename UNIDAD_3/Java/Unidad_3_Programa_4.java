/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.unidad_3_programa_4;
import java.util.Scanner;
/**
 *
 * @author LaboratorioLTI2
 */
public class Unidad_3_Programa_4 {

    public static void main(String[] args) {
        Scanner ms = new Scanner (System.in);
        int mes;
        System.out.print("Escribe el mes del año numerico: ");
        mes = ms.nextInt();
        switch (mes){
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("No existe el mes ingresado");
                  
        }
    }
}
